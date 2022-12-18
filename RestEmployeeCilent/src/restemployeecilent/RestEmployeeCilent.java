/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restemployeecilent;

import java.util.Arrays;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Covidcase;
import util.EmployeeClient;

/**
 *
 * @author Admin
 */
public class RestEmployeeCilent {

    /**
     * @param args the command line arguments
     */
    static Covidcase model = new Covidcase();
    public static void main(String[] args) {
        EmployeeClient empClient = new EmployeeClient();
        String json = empClient.findAll_JSON(String.class);
        String rs = json.replace("[", "").replace("{", "").replace("]", "").replace("}", "").replace("'", "");

        String[] parts = rs.split(",");
        String[] partssss = new String[38];
        
        int i = 0;
        for (String part : parts) {
            String[] partss = part.split(":");
            for (String part3 : partss) {
                partssss[i] = part3;               
                System.out.println(part3);  // Outputs "year" 2022 "weeknum" 49 "new_case" 3961
                 i++;
            }
            
        }
        System.out.println(Arrays.toString(partssss));
        
        model.setYeah(Integer.valueOf(partssss[1]));
        model.setWeeknum(Integer.valueOf(partssss[3]));
        model.setNewCase(Integer.valueOf(partssss[5]));
        model.setTotalCase(Integer.valueOf(partssss[7]));
        model.setNewCaseExcludeabroad(Integer.valueOf(partssss[9]));
        model.setTotalCaseExcludeabroad(Integer.valueOf(partssss[11]));
        model.setNewRecovered(Integer.valueOf(partssss[13]));
        model.setTotalRecovered(Integer.valueOf(partssss[15]));
        model.setNewDeath(Integer.valueOf(partssss[17]));
        model.setTotalDeath(Integer.valueOf(partssss[19]));
        model.setCaseForeign(Integer.valueOf(partssss[21]));
        model.setCasePrison(Integer.valueOf(partssss[23]));
        model.setCaseWalkin(Integer.valueOf(partssss[25]));
        model.setCaseNewPrev(Integer.valueOf(partssss[27]));
        model.setCaseNewDiff(Integer.valueOf(partssss[29]));
        model.setDeathNewPrev(Integer.valueOf(partssss[31]));
        model.setDeathNewDiff(Integer.valueOf(partssss[33]));
        model.setUpdateDate(partssss[35]);
        
        persist(model);
    }

    public static void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("RestEmployeeCilentPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
   
    
    
}
