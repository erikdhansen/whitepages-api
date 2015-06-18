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
public class BusinessApiRequest extends AbstractApiRequest {
    String city;
    String name;
    
    public BusinessApiRequest(String city, String name) {
        this.city = city;
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public String getRequestURL() {
        return baseURL.concat("business.json?api_key=").concat(API_KEY).concat("&city=").concat(city).concat("&name=").concat(name);
    }
}
