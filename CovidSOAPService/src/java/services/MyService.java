/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface MyService {
  @WebMethod
  public String getDataFromAPI(String apiURL);
}