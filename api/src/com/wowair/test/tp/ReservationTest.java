package com.wowair.test.tp;

import org.junit.Before;
import org.junit.Test;

import com.wowair.tp.model.reservation.ReservationParent;
import com.wowair.tp.services.TPReservationService;

import static org.junit.Assert.assertTrue;

public class ReservationTest {

	@Before
	public void Assert_Env() {
		assertTrue("Environment must contain REST_AUTHORIZATION", System.getenv().containsKey("REST_AUTHORIZATION"));
	}

	@Test
	public void Test_Schema()
	{
		TPReservationService reservationService = new TPReservationService();
		ReservationParent reservationParent = reservationService.retrieveParentAccount();
		System.out.println(reservationParent.getStatus());
	}

}
