package com.wowair.test.heart;

import org.junit.Test;

import com.wowair.heart.model.AllFlights;
import com.wowair.heart.services.AllFlightsService;

public class AllFlightsTest {
	
	@Test
	public void Test_Schema()
	{
		AllFlightsService allFlightService = new AllFlightsService();	
		AllFlights allFlights = allFlightService.retrieveParentAccount();
		System.out.println(allFlights.getData().getAllFlights().get(0).getId());
	}

}
