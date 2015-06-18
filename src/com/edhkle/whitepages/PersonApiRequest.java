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
public class PersonApiRequest extends AbstractApiRequest {
    String name;
    
    public PersonApiRequest(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getRequestURL() {
        return baseURL.concat("person.json?api_key=").concat(API_KEY).concat("&name=").concat(name);
    }
}
