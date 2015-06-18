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
public abstract class AbstractApiRequest {
    
    protected final static String API_KEY = "b1d5a99243b45e9b3d09c4d012cd3466";
    protected final static String baseURL = "https://proapi.whitepages.com/2.1/";
    
    public abstract String getRequestURL();
}
