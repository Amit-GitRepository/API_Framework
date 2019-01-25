package com.wowair.test.ancillary;


import org.junit.Test;

import com.wowair.ancillary.services.ReservationService;
import com.wowair.tp.model.reservation.ReservationParent;

public class ReservationTest {
	
	@Test
	public void Test_ReservationSchemaAPI()
	{
		ReservationService reservationservice = new ReservationService();
		ReservationParent reservation = reservationservice.retrieveParentAccount();		
		System.out.println(reservation.getStatus());
		
		
	}


}
