/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soapcilent;

/**
 *
 * @author Admin
 */
import javax.xml.soap.*;
import org.json.*;

public class SoapCilent {

    public static void main(String[] args) {
        try {
            // Create a SOAP connection
            SOAPConnectionFactory factory = SOAPConnectionFactory.newInstance();
            SOAPConnection connection = factory.createConnection();

            // Create a SOAP message
            MessageFactory messageFactory = MessageFactory.newInstance();
            SOAPMessage message = messageFactory.createMessage();
            SOAPPart soapPart = message.getSOAPPart();
            SOAPEnvelope envelope = soapPart.getEnvelope();
            SOAPBody body = envelope.getBody();
            body.addChildElement("getData", "ns").addTextNode("{'url': 'http://www.example.com/data.json'}");

            // Send the SOAP message and retrieve the response
            String url = "http://www.example.com/soap/service";
            SOAPMessage response = connection.call(message, url);

            // Parse the response
            String responseString = response.getSOAPBody().getTextContent();
            JSONObject responseJSON = new JSONObject(responseString);
            JSONArray data = responseJSON.getJSONArray("data");
            for (int i = 0; i < data.length(); i++) {
                JSONObject item = data.getJSONObject(i);
                System.out.println(item.getString("name") + ": " + item.getString("value"));
            }

            // Close the connection
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

