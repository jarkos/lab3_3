package edu.iis.mto.time;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderTest {

	@Test(expected = OrderExpiredException.class)
	public void confirmTest_give25HoursDelayInSubmit_shouldThrowOrderExpiredException() 
	{
		Order order = new Order();
		order.submit();
		order.confirm();
	}
}
