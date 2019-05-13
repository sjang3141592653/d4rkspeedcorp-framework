package generated;

import helpers.Config;
import helpers.Context;
import java.util.concurrent.Callable;

public class EntrypointCallable1 implements Callable<Object>
{
	public Object call() throws Exception
	{
		Switcher.call();
		return null;
	}
}
