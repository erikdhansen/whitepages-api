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
public class PhoneApiRequest extends AbstractApiRequest {
    String phoneNumber;
    
    public PhoneApiRequest(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getRequestURL() {
        if(phoneNumber == null || phoneNumber.length() == 0) {
            throw new IllegalArgumentException("Invalid null/zero length phone number");
        }
        
        return baseURL.concat("phone.json?api_key=").concat(API_KEY).concat("&phone_number=").concat(phoneNumber);
    }
}
