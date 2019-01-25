package com.wowair.heart.services;

import com.wowair.heart.model.AllFlights;
import com.wowair.httpclient.GetRequest;

public class AllFlightsService {

	public AllFlights retrieveParentAccount() {
		return new GetRequest().GetRequestWithGraphQL("https://clientapi.dev.wowair.net/graphql")
				.as(AllFlights.class);
	}

}
