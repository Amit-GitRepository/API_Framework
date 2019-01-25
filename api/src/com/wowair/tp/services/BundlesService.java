package com.wowair.tp.services;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import org.apache.http.client.utils.URIBuilder;
import com.wowair.httpclient.GetRequest;
import com.wowair.tp.model.bundles.BundlesParent;

public class BundlesService {

	public BundlesParent retrieveParentAccount(String adults, String infants, String children, String currency, String origin, String destination, String departureDate, String brandedFare){


		URIBuilder bundlesParams = null;
		try {
			bundlesParams = new URIBuilder("https://tpapi.wowair.net/api/v5/bundles");
			bundlesParams.addParameter("adults", adults);
			bundlesParams.addParameter("infants", infants);
			bundlesParams.addParameter("children", children);
			bundlesParams.addParameter("currency", currency);
			bundlesParams.addParameter("Flights[0].origin", origin);
			bundlesParams.addParameter("Flights[0].destination", destination);
			bundlesParams.addParameter("Flights[0].departureDate", departureDate);
			bundlesParams.addParameter("brandedFare", brandedFare);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}


		URL url = null;
		try {
			url = bundlesParams.build().toURL();
		} catch (MalformedURLException | URISyntaxException e) {
			e.printStackTrace();
		}
		
		System.out.println(url.toString());
		return new GetRequest().GetRequestWithOauth(url.toString())
				.as(BundlesParent.class);
	}
}
