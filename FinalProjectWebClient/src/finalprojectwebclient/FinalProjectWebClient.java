/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalprojectwebclient;

import util.NewJerseyClient;

/**
 *
 * @author Admin
 */
public class FinalProjectWebClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewJerseyClient obj = new NewJerseyClient();
        String xml = obj.getXml("asd");
        System.out.print(xml);
    }
    
}
