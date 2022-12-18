/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soapclient;

/**
 *
 * @author Admin
 */
public class SOAPClient {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        try { // Call Web Service Operation
            services.NewWebService_Service service = new services.NewWebService_Service();
            services.NewWebService port = service.getNewWebServicePort();
            // TODO initialize WS operation arguments here
            int findbyyear = 0;
            // TODO process result here
            services.Covidcase result = port.allbutnoMember(findbyyear);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

    }
}
