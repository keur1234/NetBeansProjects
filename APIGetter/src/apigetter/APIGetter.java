/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apigetter;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import org.json.JSONObject;
import sun.misc.IOUtils;


/**
 *
 * @author Admin
 */
public class APIGetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        stream(https://covid19.ddc.moph.go.th/api/Cases/today-cases-all.html);
    }
    
    public static String stream(URL url) {
    try (InputStream input = url.openStream()) {
        InputStreamReader isr = new InputStreamReader(input);
        BufferedReader reader = new BufferedReader(isr);
        StringBuilder json = new StringBuilder();
        int c;
        while ((c = reader.read()) != -1) {
            json.append((char) c);
        }
        return json.toString();
    }
    catch(Exception e) {
        System.out.print(e);
    }
     return null;
}
    
    public static JSONObject getJson(URL url) {
        String json = IOUtils.toString(url, Charset.forName("UTF-8"));
    return new JSONObject(json);
}
    
}
