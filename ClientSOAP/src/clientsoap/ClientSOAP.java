/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientsoap;

import services.Covidcase;

/**
 *
 * @author Admin
 */
public class ClientSOAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Covidcase cc = allbutnoMember(2022);
        System.out.println("New Death = " + cc.getNewDeath());
    }

    private static Covidcase allbutnoMember(int findbyyear) {
        services.NewWebService_Service service = new services.NewWebService_Service();
        services.NewWebService port = service.getNewWebServicePort();
        return port.allbutnoMember(findbyyear);
    }
    
}
