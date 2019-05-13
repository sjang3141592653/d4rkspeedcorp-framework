package generated.zuqq.dis;

import helpers.Config;
import helpers.Context;
import java.util.*;
import java.util.logging.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;


public class ClsZotjz
{
	 public static final int classId = 102;
	 static final Logger logger = LoggerFactory.getLogger(ClsZotjz.class);

	public static void metPhpym(Context context) throws Exception
	{
				int methodId = 0;
		Object[] root = new Object[9];
		Object[] valGvhkoixqrns = new Object[4];
		Set<Object> valJjwnwtahzcq = new HashSet<Object>();
		boolean valWtrvhcbnact = false;
		
		valJjwnwtahzcq.add(valWtrvhcbnact);
		String valBymlnufjfve = "StrTjiirjoyedc";
		
		valJjwnwtahzcq.add(valBymlnufjfve);
		
		    valGvhkoixqrns[0] = valJjwnwtahzcq;
		for (int i = 1; i < 4; i++)
		{
		    valGvhkoixqrns[i] = Config.get().getRandom().nextInt(1000);
		}
		
		
		    root[0] = valGvhkoixqrns;
		for (int i = 1; i < 9; i++)
		{
		    root[i] = Config.get().getRandom().nextInt(1000);
		}
		
					if (Config.get().shouldWriteLogInfo(context))
			{
					logger.info("Time for log - info 3Pfyz 4Kfbsk 7Kelmqzhy 3Pjzl 3Uuac 12Uuothrezzyalf 5Knwkib 10Mkfetkzeksl 9Wyfehfczup 11Usxcrgkinpry 6Tdclqmn 3Xoob 5Ynuqri 11Iufqbweqirac ");
					logger.info("Time for log - info 3Dbmj 12Nvtoprldsapjo 3Jzqw 5Ksygeh 6Xkkzevf 4Rfrub 4Kdzfr 8Scvujgfom 6Gcbscvm 11Cninrxlpdbdf 10Rzrypaehmfd 10Ohepmarmoxo 7Piuqnyle 5Gfddmu 7Oeslqpme 9Qydphgybxu 9Igsbgpnwyj 5Svxufb 7Scbpliin 6Slkkpmn 6Cunxzgk 9Pncavituaw 6Doqbpgd 6Ptsenvv 9Znovorcvee 10Bixabbbqrxi 6Ewqikfg 11Tndzdotwoljq 8Lcjmpockt ");
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
					logger.warn("Time for log - warn 11Clwxlviuxabz 4Bnmux 7Uijqfqwp 12Pigzxccmqbpnn 8Qblemclxx 4Selwb 8Bdaelcotd 7Chuknnqi 3Gokp 9Xlvyjojlph 10Dfwftjntpfd 12Pyzwtqpdkjoxw 11Uzuehvszyhpy 8Tjghxxvbj 11Abjwunpzbrku 10Hcbrzxghiua 10Iaacoxcnpiz ");
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
			case (0): generated.qrzc.frg.utv.itv.ClsGoyvsxo.metOllflngqrpzh(context); return;
			case (1): generated.lraiq.fcmvy.qwp.rkzex.eokht.ClsJupuz.metTywqcdpv(context); return;
			case (2): generated.hzw.xclp.jagge.pvih.oqmlx.ClsBjaeoqqxwxxp.metLyljj(context); return;
			case (3): generated.eddt.homo.syk.wqll.dyeuq.ClsYzlmjqrjjp.metWfbnvwlbefalsd(context); return;
			case (4): generated.ebl.tdhe.hblqj.plazc.otajb.ClsEihhumwr.metZzqrbtidxpltas(context); return;
		}
				{
			if (((4394) * (Config.get().getRandom().nextInt(556) + 3) % 212040) == 0)
			{
				java.io.File file = new java.io.File("/dirWeoyywpocrl/dirMcvntjxuopk/dirBazinzcfybx");
				
				if (file.canRead())
				{
					System.out.println("File exists");
				}
				else
				{
					System.out.println("File not exists");
				}
			}
			else
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
