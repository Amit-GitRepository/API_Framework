package com.wowair.test.tp;

import org.junit.Before;
import org.junit.Test;

import com.wowair.tp.model.bundles.BundlesParent;
import com.wowair.tp.services.BundlesService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertTrue;


public class BundlesTest {

    String adults = "1";
    String infant = "1";
    String children = "1";
    String currency = "USD";
    String origin = "BOS";
    String destination = "CDG";
    String departureDate;
    String brandedFare = "All";


    @Before
    public void Assert_Env() {
        assertTrue("Environment must contain REST_AUTHORIZATION", System.getenv().containsKey("REST_AUTHORIZATION"));
    }

    @Test
    public void Test_Schema() {

        DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        departureDate = dateformatter.format(now.plusMonths(3));

        BundlesService tpBundlesService = new BundlesService();
        BundlesParent tpBundlesParent = tpBundlesService.retrieveParentAccount(adults, infant, children, currency, origin, destination, departureDate, brandedFare);
    }
}
