package generated.xnl.gdx.dmkh.hpyan;

import helpers.Config;
import helpers.Context;
import java.util.*;
import java.util.logging.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;


public class ClsNxgzyqd
{
	 public static final int classId = 416;
	 static final Logger logger = LoggerFactory.getLogger(ClsNxgzyqd.class);

	public static void metRbhfzkkxtnc(Context context) throws Exception
	{
				int methodId = 0;
		List<Object> root = new LinkedList<Object>();
		Object[] valFjfvlirjxqf = new Object[5];
		Object[] valOfqhniujeji = new Object[5];
		long valIgytqurcidi = -7154737585985267026L;
		
		    valOfqhniujeji[0] = valIgytqurcidi;
		for (int i = 1; i < 5; i++)
		{
		    valOfqhniujeji[i] = Config.get().getRandom().nextInt(1000);
		}
		
		
		    valFjfvlirjxqf[0] = valOfqhniujeji;
		for (int i = 1; i < 5; i++)
		{
		    valFjfvlirjxqf[i] = Config.get().getRandom().nextInt(1000);
		}
		
		
		root.add(valFjfvlirjxqf);
					if (Config.get().shouldWriteLogInfo(context))
			{
					logger.info("Time for log - info 12Jchxlhfgsefrn 9Saqhydrmgl 10Hjrogvbqaoj ");
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
					logger.error("Time for log - error 9Ggwoahbuym 5Ihlfbx 8Xctunvuwc 7Yoxeekfp 3Qezg 4Tgylg 6Dcivppo 3Ctsn 5Kcpgbm ");
					logger.error("Time for log - error 10Eqrtgfggbbo 10Xpsejuitnxs 10Pyahnrsudmx 11Dbqqmwjyiele 6Zjgdudf 10Yipxqchulzb 9Qvwacrxdww 5Sylqhu 11Gemcmsfwkgzz 11Ceehumjygxtb 6Utfhnoz 4Mxeda 12Zdzhbouppsobf 11Xjmbuyaegmul 3Vfqa 10Hajldiyfsrd 9Sqtvbwqepw 4Nycdc 9Rhtwurjagj 5Rxssfd 3Tcvu 6Ifbacxp 5Ebqqnn 7Nuwcgnva 6Dkozlxh ");
					logger.error("Time for log - error 3Drgl 9Vvqzrjqsby 9Txbawumvmf 12Hyvsdtzquhtto 5Fkeyin 8Lbjttjogw 6Eljeqsz 12Xbopmjqskwwer 3Hldb 5Bczhbp 9Cbozpkahqd 10Utpqaufgpxf 9Qpxeujkmgi 7Ivsrdaat ");
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
			case (0): generated.wspiu.cmqv.pvdxy.isdgi.ljwn.ClsZpnvzubxm.metVqngzt(context); return;
			case (1): generated.gnqi.cix.ClsQxfsbpts.metKsqjpoe(context); return;
			case (2): generated.lbx.ujwf.wayq.ClsEtipntwjjs.metYkgppbepgd(context); return;
			case (3): generated.vvl.eygsr.pmv.fzat.xuhvb.ClsRspudgdgeelrz.metTflzgskfmgmc(context); return;
			case (4): generated.yzf.fayrw.fbm.pexsg.rxfb.ClsSblyqahlwj.metDtinpwu(context); return;
		}
				{
			long varZxwpupcbrsq = (4581);
			if (((Config.get().getRandom().nextInt(960) + 7) % 166777) == 0)
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
