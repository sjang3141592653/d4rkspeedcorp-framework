package generated.fflc.jdncn;

import helpers.Config;
import helpers.Context;
import java.util.*;
import java.util.logging.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;


public class ClsHubvnnx
{
	 public static final int classId = 391;
	 static final Logger logger = LoggerFactory.getLogger(ClsHubvnnx.class);

	public static void metSnkfjhjtib(Context context) throws Exception
	{
				int methodId = 0;
		List<Object> root = new LinkedList<Object>();
		Object[] valVuzapzijolc = new Object[5];
		Set<Object> valGntwpkagorn = new HashSet<Object>();
		long valFyhscjqmlgt = -8427728177878480399L;
		
		valGntwpkagorn.add(valFyhscjqmlgt);
		
		    valVuzapzijolc[0] = valGntwpkagorn;
		for (int i = 1; i < 5; i++)
		{
		    valVuzapzijolc[i] = Config.get().getRandom().nextInt(1000);
		}
		
		
		root.add(valVuzapzijolc);
		Object[] valPamsfzcthlo = new Object[11];
		Object[] valLasemcjiutz = new Object[10];
		String valThwyyvlqgld = "StrSvzreqkraiu";
		
		    valLasemcjiutz[0] = valThwyyvlqgld;
		for (int i = 1; i < 10; i++)
		{
		    valLasemcjiutz[i] = Config.get().getRandom().nextInt(1000);
		}
		
		
		    valPamsfzcthlo[0] = valLasemcjiutz;
		for (int i = 1; i < 11; i++)
		{
		    valPamsfzcthlo[i] = Config.get().getRandom().nextInt(1000);
		}
		
		
		root.add(valPamsfzcthlo);
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
					logger.error("Time for log - error 8Dzriwxhaf 7Bbpqczyg 8Mcfcusptf 10Ncpvoqnacyy 5Hohofq 11Hdwwchsxjuei 3Yvdi 12Lzicwiihbzdqd 4Vxtdu 9Uzcwnzmlcz 4Apkad 3Uahd 5Oclokp 8Oauacvuab 8Dxxtearna 9Qxvwcikjlb 6Hwjgnxg 7Eggqzxlz 12Oxlwmcgrevjdu ");
					logger.error("Time for log - error 4Cziqn 11Homxkkzplxcs 3Iaiu 8Klyjjcqjz 5Ulotiq 12Oxevaqeragdml 4Mbhyw 10Wrvmutlixhj 6Aryzpcm 5Paocwo 11Vnqkbuoqanst 9Gtupduuauh 3Zfoy ");
					logger.error("Time for log - error 11Bhxizdoeygxk 7Hrmpbxmr 11Snoznsjswclc 8Tooyovone 9Jombdqtxyn 3Mvjz ");
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
			case (0): generated.uooez.nez.ipsx.tenui.ClsCrgtl.metHrkchutdgiq(context); return;
			case (1): generated.reb.nzlh.ClsFjrtwsmg.metGcfvrdlvkdpv(context); return;
			case (2): generated.gcr.qqx.juuh.caxx.ClsRlelgjq.metIstdlmn(context); return;
			case (3): generated.ebdo.cied.ClsIqlmeepdcmuqo.metBklcmfgo(context); return;
			case (4): generated.mtq.flhse.ygibh.yfs.ClsSzzuamch.metIuxgxgafdnqnhh(context); return;
		}
				{
			long whileIndex26645 = 0;
			
			while (whileIndex26645-- > 0)
			{
				Object locker = new Object();
				
				synchronized (locker)
				{
					System.out.println("synchronized block");
				}
			}
			
			try
			{
				Object locker = new Object();
				
				synchronized (locker)
				{
					System.out.println("synchronized block");
				}
			}
			catch (Exception ex26649)
			{
			}
			
		}
	}

}
