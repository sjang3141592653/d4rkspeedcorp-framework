package generated;

import helpers.Config;
import helpers.Context;
import java.util.concurrent.Callable;

public class EntrypointCallable2 implements Callable<Object>
{
	public Object call() throws Exception
	{
		try
		{
			Switcher.call();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return null;
	}
}
