package com.redhat.coolstore.service;

import javax.ejb.Remote;

import com.redhat.coolstore.model.ShoppingCart;

@Remote
public interface ShippingServiceRemote {
    double calculateShipping(ShoppingCart sc);
    double calculateShippingInsurance(ShoppingCart sc);
}
