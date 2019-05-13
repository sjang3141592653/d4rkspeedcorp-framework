package generated;
import helpers.Config;
import helpers.Context;
public class Switcher
{
	public static void call() throws Exception
	{
		call(Config.get().getRandom().nextInt(1513));
	}
	public static void call(int number) throws Exception
	{
		
		if (number >= 0 && number < 1000)
		{
			Switcher0.call(number);
			return;
		}

			
		if (number >= 1000 && number < 1512)
		{
			Switcher1.call(number);
			return;
		}

	}
}
