package edu.iis.mto.time;

public class FakeTimeSoruce implements TimeSource
{
	private static final long DELAY_25_HOURS = 25*60*60*1000;
	
	/** One day in advance of the actual time.*/
	@Override public long currentTimeMillis() 
	{
		return System.currentTimeMillis() - DELAY_25_HOURS;
	}
}
