/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edhkle.whitepages;

/**
 *
 * @author ehansen
 */
public class AddressApiRequest extends AbstractApiRequest {
    Address address;
    
    public AddressApiRequest(Address address) {
        this.address = address;
    }
    
    public String getRequestURL() {
        if(address == null) {
            throw new IllegalArgumentException("Invalid null address in request");
        }
        
        return baseURL.concat("location.json?api_key=").concat(API_KEY).concat(address.toQueryString());
    }
}
