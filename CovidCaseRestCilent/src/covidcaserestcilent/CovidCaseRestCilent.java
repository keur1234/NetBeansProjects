/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package covidcaserestcilent;

import java.util.Arrays;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import util.CovidCaseClient;


/**
 *
 * @author Admin
 */
public class CovidCaseRestCilent {

    /**
     * @param args the command line arguments
     */
     CovidCaseClient model = new CovidCaseClient();
     public static void main(String[] args) {
        CovidCaseClient empClient = new CovidCaseClient();
        String json = empClient.findAll_JSON(String.class);
        String rs = json.replace("[", "").replace("{", "").replace("]", "").replace("}", "").replace("'", "");

        String[] parts = rs.split(",");
        String[] partssss = new String[38];
        
        int i = 0;
        for (String part : parts) {
            String[] partss = part.split(":");
            for (String part3 : partss) {
                partssss[i] = part3;               
                System.out.println(part3);  // Outputs "Hello", " world", " how", " are", " you", " today?"
                 i++;
            }
            
        }
        System.out.println(Arrays.toString(partssss));
        
 
}
}
