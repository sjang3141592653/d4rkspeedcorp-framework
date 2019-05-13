package generated.pxdt.vcuzq.tfk.bjngo;

import helpers.Config;
import helpers.Context;
import java.util.*;
import java.util.logging.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;


public class ClsCaopcwu
{
	 public static final int classId = 361;
	 static final Logger logger = LoggerFactory.getLogger(ClsCaopcwu.class);

	public static void metNrjzvdamjddqk(Context context) throws Exception
	{
				int methodId = 0;
		Object[] root = new Object[7];
		Object[] valDjboevpcbbv = new Object[8];
		List<Object> valCzmxokhfrxp = new LinkedList<Object>();
		boolean valLsicdljyrez = false;
		
		valCzmxokhfrxp.add(valLsicdljyrez);
		
		    valDjboevpcbbv[0] = valCzmxokhfrxp;
		for (int i = 1; i < 8; i++)
		{
		    valDjboevpcbbv[i] = Config.get().getRandom().nextInt(1000);
		}
		
		
		    root[0] = valDjboevpcbbv;
		for (int i = 1; i < 7; i++)
		{
		    root[i] = Config.get().getRandom().nextInt(1000);
		}
		
					if (Config.get().shouldWriteLogInfo(context))
			{
			}
		
			if (Config.get().shouldThrowSomething(methodId,classId))
			{
				if(Config.get().shouldThrow1000())
				{
					for (int i = 0; i < 1000; i++) 
			{
			   	try
				  {
				  	throw new IllegalStateException("Time for Illegal state exception, context is " + context);
		  		}
			   	catch (Exception e)
				  {
				  	e.printStackTrace();
			   	}
      }

				}
		
				if (Config.get().shouldWriteLogWarn(context))
				{
				}
		
				if (Config.get().shouldWriteLogError(context))
				{
				}
		
				if (Config.get().shouldThrowIllegal(context))
				{
						throw new IllegalStateException("Time for Illegal state exception, context is " + context);

				}
		
				if (Config.get().shouldThrowIO(context))
				{
						throw new IOException("Time for IO exception, context is " + context);

				}
		}
		
				if (Config.get().shouldSuicide())
				{
		System.out.println("shouldSuicide.. ");
						 System.exit(0);
				}
		
			if (Config.get().shouldRunAway(context))
			{
				return;
			}
		
		Config.get().updateContext(context);
		int methodToCall = Config.get().getRandom().nextInt(5);
		
		switch (methodToCall)
		{
			case (0): generated.aqqfv.gdkxm.pact.ClsAgtwrqa.metYkbdjrockaif(context); return;
			case (1): generated.vbpvl.ppexe.hnrdr.zcxzm.ClsCvshjbmkqrb.metJcfyp(context); return;
			case (2): generated.kiqe.tmup.llmva.iyda.crt.ClsCkhcwacne.metEqiixejyhymhk(context); return;
			case (3): generated.fpitj.gxmf.ClsSfcuawq.metMhueymlsiu(context); return;
			case (4): generated.eob.tzj.qiec.ClsEnjcnowop.metHjaxbe(context); return;
		}
				{
			int loopIndex26102 = 0;
			for (loopIndex26102 = 0; loopIndex26102 < 3635; loopIndex26102++)
			{
				try
				{
					Integer.parseInt("numVaxzuaoegks");
				}
				catch(NumberFormatException e) 
				{
					e.printStackTrace();
				}
			}
			
			long whileIndex26103 = 0;
			
			while (whileIndex26103-- > 0)
			{
				Object locker = new Object();
				
				synchronized (locker)
				{
					System.out.println("synchronized block");
				}
			}
			
		}
	}

}
