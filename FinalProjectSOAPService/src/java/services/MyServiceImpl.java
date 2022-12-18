/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package services;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;
import com.sun.xml.ws.developer.JAXWSProperties;

public class MyServiceImpl implements MyService {
  @Override
  public String getDataFromAPI(String apiURL) {
    Client client = ClientBuilder.newClient();
    client.property(JAXWSProperties.CONNECT_TIMEOUT, 10000);
    client.property(JAXWSProperties.REQUEST_TIMEOUT, 10000);
    Response response = client.target(apiURL)
        .request()
        .get();
    String jsonData = response.readEntity(String.class);
    return jsonData;
  }
}
