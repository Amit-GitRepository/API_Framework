package com.wowair.tp.services;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import org.apache.http.client.utils.URIBuilder;

import com.wowair.httpclient.GetRequest;
import com.wowair.tp.model.offers.OffersParent;

public class OffersService {

	public OffersParent retrieveParentAccount(String adults, String infants, String children, String currency, String origin, String destination, String departureDate, String returnDate, String brandedFare){


		URIBuilder offerParams = null;
		try {
			offerParams = new URIBuilder("https://tpapi.wowair.net/api/v6/offers");
			offerParams.addParameter("adults", adults);
			offerParams.addParameter("infants", infants);
			offerParams.addParameter("children", children);
			offerParams.addParameter("currency", currency);
			offerParams.addParameter("origin", origin);
			offerParams.addParameter("destination", destination);
			offerParams.addParameter("departureDate", departureDate);
			offerParams.addParameter("returnDate", returnDate);
			offerParams.addParameter("brandedFare", brandedFare);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}


		URL url = null;
		try {
			url = offerParams.build().toURL();
		} catch (MalformedURLException | URISyntaxException e) {
			e.printStackTrace();
		}
		
		System.out.println(url.toString());

		return new GetRequest().GetRequestWithOauth(url.toString())
				.as(OffersParent.class);
	}
}
