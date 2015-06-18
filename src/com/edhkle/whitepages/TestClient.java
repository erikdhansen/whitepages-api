/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edhkle.whitepages;

import java.util.Map;

/**
 *
 * @author ehansen
 */
public class TestClient {

    public TestClient() {

    }

    public Map<String, String> makePhoneRequest(String phoneNumber) throws Exception {
        ApiResponse response = WhitePagesAPI.getInstance().queryPhone(phoneNumber);
        return response.getData();
    }

    public static void main(String args[]) {
        TestClient client = new TestClient();

//        if (args.length < 2) {
//            System.out.println("usage: TestClient phone phone_number");
//            System.exit(-1);
//        }

        try {
            client.makePhoneRequest("6034901894");
        
//            if (args[0].equals("phone")) {
//                client.makePhoneRequest("6037593789");
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
