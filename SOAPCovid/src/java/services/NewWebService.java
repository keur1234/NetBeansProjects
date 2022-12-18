/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package services;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import model.Covidcase;

/**
 *
 * @author Admin
 */

@WebService(serviceName = "NewWebService")
public class NewWebService {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("SOAPCovidPU");

    @PersistenceContext(unitName = "SOAPCovidPU")
    private EntityManager em;
    @Resource
    private javax.transaction.UserTransaction utx;

    /*
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /*
     * Web service operation
     */
    @WebMethod(operationName = "AllbutnoMember")
    public Covidcase AllbutnoMember(@WebParam(name = "findbyyear") int findbyyear) {
        EntityManager em = emf.createEntityManager();
        Covidcase emp = em.find(Covidcase.class, findbyyear);
        return emp;
    }

    public void persist(Object object) {
        try {
            utx.begin();
            em.persist(object);
            utx.commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
        }
    }

}