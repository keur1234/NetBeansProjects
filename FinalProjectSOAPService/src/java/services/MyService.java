/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package services;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public interface MyService {
  @WebMethod
  public String getDataFromAPI(String apiURL);
}
