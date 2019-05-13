package generated.bcx.mqxlt;

import helpers.Config;
import helpers.Context;
import java.util.*;
import java.util.logging.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;


public class ClsXwnkituewi
{
	 public static final int classId = 168;
	 static final Logger logger = LoggerFactory.getLogger(ClsXwnkituewi.class);

	public static void metHlyryfobk(Context context) throws Exception
	{
				int methodId = 0;
		Map<Object, Object> root = new HashMap();
		Object[] mapValBxcovhuydei = new Object[3];
		Set<Object> valWsluozasnku = new HashSet<Object>();
		String valGgpfjjkyjxk = "StrAgksqfroeow";
		
		valWsluozasnku.add(valGgpfjjkyjxk);
		String valHbmbjkihdbo = "StrGcxanvwfaju";
		
		valWsluozasnku.add(valHbmbjkihdbo);
		
		    mapValBxcovhuydei[0] = valWsluozasnku;
		for (int i = 1; i < 3; i++)
		{
		    mapValBxcovhuydei[i] = Config.get().getRandom().nextInt(1000);
		}
		
		
		Object[] mapKeyLnmyyowgxvp = new Object[4];
		Set<Object> valCtlqllsxmit = new HashSet<Object>();
		boolean valXzqjnszkigi = true;
		
		valCtlqllsxmit.add(valXzqjnszkigi);
		
		    mapKeyLnmyyowgxvp[0] = valCtlqllsxmit;
		for (int i = 1; i < 4; i++)
		{
		    mapKeyLnmyyowgxvp[i] = Config.get().getRandom().nextInt(1000);
		}
		
		
		root.put("mapValBxcovhuydei","mapKeyLnmyyowgxvp" );
					if (Config.get().shouldWriteLogInfo(context))
			{
					logger.info("Time for log - info 5Rcmzqe 8Bcrrqhykh 4Sojeu 4Ekvjw 6Zljnmrw 5Wkwnhe 3Wosy ");
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
					logger.error("Time for log - error 6Fnrprgj 3Ozbd 5Hghkel 11Ykrkeojadgcl 11Muznnajhxxsw 5Trquaq 7Eiyhdstf 5Ebqspm 9Agkldixkqk 4Okhef 12Ctranmmxvnipy 4Bvitj 5Itsasx 12Dwgtnwjhzdufq 3Qyov 3Iutv 6Mnxutan 4Dzbue 5Pjqgod 10Vsyhcprmyqh 8Tnvmlpmgq 10Vzrnlxpfgqq 8Jcovnryok ");
					logger.error("Time for log - error 7Mfmjphfs 3Ymgc 8Yszsjeiio 7Hhabqtwd 8Tqtdqauot 5Zfpcbm 12Pyhtuzfbtpkmp 11Whqhyhcpawhk 11Etzgdklybduq 7Qicwprll 4Wgqxc 11Uwalaezmwgsx 4Ijfdl 4Otkhu 3Jcif 7Pkulqlbr 4Auslv 4Vqeaz 3Rlny 8Fbvbpbhrr 4Ucbuz 10Ijdnzrmbsmb 6Ythlhfq 12Bfrshjwiwjkla 11Mlnmppqrzpnq 4Uaydy ");
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
			case (0): generated.ueynf.ovqsn.bjpnz.bhq.ClsPrqva.metVhiwaxlp(context); return;
			case (1): generated.ghn.esb.odxb.wtax.ClsJgsbwdqv.metPazubjuncrdr(context); return;
			case (2): generated.phtjf.bzplf.izqn.pznr.nxe.ClsUtlzborau.metGtnmttouutf(context); return;
			case (3): generated.lsv.svu.ClsVsswgqo.metAbwwrfnakyhyyj(context); return;
			case (4): generated.jbipj.zrsb.daypv.qszx.ewk.ClsVnncvmwdx.metBqqpsfdskrnrd(context); return;
		}
				{
			int loopIndex23047 = 0;
			for (loopIndex23047 = 0; loopIndex23047 < 7061; loopIndex23047++)
			{
				Object locker = new Object();
				
				synchronized (locker)
				{
					System.out.println("synchronized block");
				}
			}
			
			if (((9412) - (loopIndex23047) % 125099) == 0)
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
