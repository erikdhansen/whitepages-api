/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edhkle.whitepages;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ehansen
 */
public class ApiResponse {
    String response;
    Map<String,String> data = new HashMap<>();
    
    public ApiResponse(String response){
        this.response = response;
        parseResponse();
    }
    
    public void parseResponse() {
        // Parse string and create key/value pairs
        System.out.println("REPONSE STRING: " + response);
    }
    
    public Map<String,String> getData() {
        return data;
    }
    
}
