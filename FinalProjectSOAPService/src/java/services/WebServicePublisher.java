/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package services;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 *
 * @author Admin
 */
@WebService(serviceName = "WebServicePublisher")
public class WebServicePublisher {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
public static void main(String[] args) {
    Endpoint.publish("http://localhost:8080/myservice", new MyServiceImpl());
  }
}
