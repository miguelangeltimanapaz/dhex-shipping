package com.dhex.shipping.model;

import com.dhex.shipping.service.ShippingService;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Miguel Angel Timana Paz on 13/10/2016.
 */
public class ShippingRequestTest {

    @Test
    public void shippingRequestIdTest(){

        ShippingRequest shippingRequest = new ShippingRequest("Juan", "Perez", "Av. Rep. de Panama", 12);
        ShippingService shippingService = new ShippingService();
        shippingService.register(shippingRequest);

    }
}