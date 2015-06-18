/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edhkle.whitepages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author ehansen
 */
public class WhitePagesAPI {

    private static final WhitePagesAPI api = new WhitePagesAPI();
    
    private WhitePagesAPI(){}
    
    public static WhitePagesAPI getInstance() {
        return api;
    }
    
    public ApiResponse queryPhone(String phoneNumber) throws Exception {
        return sendRequest(new PhoneApiRequest(phoneNumber));
    }
    
    public ApiResponse queryAddress(Address address) throws Exception {
        return sendRequest(new AddressApiRequest(address));
    }
    
    public ApiResponse queryBusiness(String city, String name) throws Exception {
        return sendRequest(new BusinessApiRequest(city, name));
    }
    
    public ApiResponse queryPerson(String name) throws Exception {
        return sendRequest(new PersonApiRequest(name));
    }
    
    private ApiResponse sendRequest(AbstractApiRequest request) throws MalformedURLException, IOException {
        URL url = new URL(request.getRequestURL());
        System.out.println("Transmitting request...");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("User-Agent", "Mozilla/5.0");
        int responseCode = http.getResponseCode();
        System.out.println("Received: " + responseCode);
        
        BufferedReader in = new BufferedReader(new InputStreamReader(http.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();
        while((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        return new ApiResponse(response.toString());
    }
}
