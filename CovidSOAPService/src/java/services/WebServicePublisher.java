/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import javax.xml.ws.Endpoint;

public class WebServicePublisher {
  public static void main(String[] args) {
    Endpoint.publish("http://localhost:8080/myservice", new MyServiceImpl());
  }
}
