package generated.hvqh.qdnb.tawyn;

import helpers.Config;
import helpers.Context;
import java.util.*;
import java.util.logging.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;


public class ClsAaddylg
{
	 public static final int classId = 55;
	 static final Logger logger = LoggerFactory.getLogger(ClsAaddylg.class);

	public static void metCsnugb(Context context) throws Exception
	{
				int methodId = 0;
		Set<Object> root = new HashSet<Object>();
		Map<Object, Object> valCixarmazlsz = new HashMap();
		Map<Object, Object> mapValAsfsvnlynkx = new HashMap();
		long mapValJkmhbyleqaj = 6944041991556712828L;
		
		int mapKeyHictutmaauk = 402;
		
		mapValAsfsvnlynkx.put("mapValJkmhbyleqaj","mapKeyHictutmaauk" );
		
		Set<Object> mapKeyOyeoogvsrmn = new HashSet<Object>();
		long valFybklysbhts = 8439193098734465128L;
		
		mapKeyOyeoogvsrmn.add(valFybklysbhts);
		
		valCixarmazlsz.put("mapValAsfsvnlynkx","mapKeyOyeoogvsrmn" );
		Set<Object> mapValIofopityvut = new HashSet<Object>();
		long valLhtcbwqijgm = -4906443216083446662L;
		
		mapValIofopityvut.add(valLhtcbwqijgm);
		int valUnavduztimr = 587;
		
		mapValIofopityvut.add(valUnavduztimr);
		
		Set<Object> mapKeyKeimuqtvaaa = new HashSet<Object>();
		boolean valFzliqvowprc = false;
		
		mapKeyKeimuqtvaaa.add(valFzliqvowprc);
		
		valCixarmazlsz.put("mapValIofopityvut","mapKeyKeimuqtvaaa" );
		
		root.add(valCixarmazlsz);
		Object[] valBqurbwzgevn = new Object[6];
		List<Object> valTplpgdmvoah = new LinkedList<Object>();
		boolean valTbcgfojtrbr = true;
		
		valTplpgdmvoah.add(valTbcgfojtrbr);
		
		    valBqurbwzgevn[0] = valTplpgdmvoah;
		for (int i = 1; i < 6; i++)
		{
		    valBqurbwzgevn[i] = Config.get().getRandom().nextInt(1000);
		}
		
		
		root.add(valBqurbwzgevn);
					if (Config.get().shouldWriteLogInfo(context))
			{
					logger.info("Time for log - info 9Dgahwbnrnb 9Untkohfomy 5Zronkm 3Zche 10Xruswbqnirh 12Lbdskrjsrixvq 9Tcvbfvpdek 7Iuvgovdx 6Tfywlyu 4Vifmf 3Oetj 8Uvgtatjlz 7Addmarag 5Rrrkin ");
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
					logger.error("Time for log - error 4Ragzb 5Nartes 6Pijwrlm 6Hhozjrl 11Ubgnwflpcsmr ");
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
			case (0): generated.pli.sac.lcrkw.ery.xwlo.ClsIghyijbnkvoubq.metGkvfppppcn(context); return;
			case (1): generated.yyztd.kdvzo.xtlfe.sqo.ClsTrzriiwcgvlv.metXtcge(context); return;
			case (2): generated.cwxj.lmfzj.egfdm.ClsTwbdwdairow.metHhffvvxhy(context); return;
			case (3): generated.fpa.lsm.ClsOulug.metRvwreotu(context); return;
			case (4): generated.rnr.pwsrq.cbi.tat.ClsQsqavl.metUzhol(context); return;
		}
				{
			try
			{
				Object locker = new Object();
				
				synchronized (locker)
				{
					System.out.println("synchronized block");
				}
			}
			finally
			{
				Object locker = new Object();
				
				synchronized (locker)
				{
					System.out.println("synchronized block");
				}
			}
			
			long whileIndex21045 = 0;
			
			while (whileIndex21045-- > 0)
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
