package edu.iis.mto.time;

public class FakeTimeSoruce implements TimeSource
{
	private static final long ONE_DAY = 24*60*60*1000;
	
	/** One day in advance of the actual time.*/
	@Override public long currentTimeMillis() 
	{
		return System.currentTimeMillis() + ONE_DAY;
	}
}
