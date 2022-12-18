/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package services;

import javax.jws.WebService;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import javax.jws.WebMethod;
import javax.jws.WebService;
import com.sun.xml.ws.developer.JAXWSProperties;

/**
 *
 * @author Admin
 */
@WebService(serviceName = "MyServiceImpl")

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

@WebService
public class MySOAPService {

    @WebMethod
    public String getDataFromURL(String url) {
        // Make an HTTP GET request to the URL and retrieve the response
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);
        HttpResponse response = client.execute(request);

        // Convert the response to a String
        String responseString = EntityUtils.toString(response.getEntity());

        // Parse the JSON data
        JSONParser parser = new JSONParser();
        JSONArray data = null;
        try {
            data = (JSONArray) parser.parse(responseString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Access and manipulate the data as needed
        // ...

        // Return the data as a String
        return data.toString();
    }

}

