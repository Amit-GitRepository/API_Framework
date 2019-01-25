package com.wowair.ancillary.services;

import com.wowair.httpclient.GetRequest;
import com.wowair.tp.model.reservation.ReservationParent;

public class ReservationService {
	public ReservationParent retrieveParentAccount() {
		return new GetRequest().GetRequestWithOauth("https://tpapi.dev.wowair.net/api/v5/reservations/LBDBQT?LastName=DUSRT")
				.as(ReservationParent.class);
	}

}
