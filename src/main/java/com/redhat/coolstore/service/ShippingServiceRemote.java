package com.redhat.coolstore.service;

import javax.ejb.Remote;

import com.redhat.coolstore.model.ShoppingCart;

@Remote
public interface ShippingServiceRemote {
    void calculateShipping(ShoppingCart sc);
}
