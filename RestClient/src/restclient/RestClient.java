/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restclient;

import java.io.StringReader;
import javax.xml.bind.JAXB;
import util.UrlJerseyClient;

/**
 *
 * @author Admin
 */
public class RestClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UrlJerseyClient obj = new UrlJerseyClient();
        String xml = obj.getXml("Sarun");
        System.out.println(xml);
        
        String string = (String) JAXB.unmarshal(new StringReader(xml), String.class);
        System.out.println(string);
    }
//    
//    public static String stream(URL url) throws IOException {
//    try (InputStream input = url.openStream()) {
//        InputStreamReader isr = new InputStreamReader(input);
//        BufferedReader reader = new BufferedReader(isr);
//        StringBuilder json = new StringBuilder();
//        int c;
//        while ((c = reader.read()) != -1) {
//            json.append((char) c);
//        }
//        return json.toString();
//    }
//}
    
}
