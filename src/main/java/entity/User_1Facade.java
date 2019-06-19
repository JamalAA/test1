/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.EntityManager;
import utils.PuSelector;

/**
 *
 * @author jamalahmed
 */
public class User_1Facade {
    
      public void PostUser(User_1 u)
    {
         EntityManager em = PuSelector.getEntityManagerFactory("pu").createEntityManager();
      
        try
        {
            em.getTransaction().begin();
            em.persist(u);
            em.getTransaction().commit();
        }
        finally
        {
            em.close();
        }        
    }
    
      
}





/**
 
     
     public List<HistoryDTO> getAll(){
         EntityManager em = PuSelector.getEntityManagerFactory("pu").createEntityManager();
          List<HistoryDTO> histories = new ArrayList();
        try
        {
            // Q&D should be returned as list of HistoryDTOs.
            histories = em.createQuery("SELECT h FROM History h").getResultList();
            
           
        }
        finally
        {
            em.close();
        }
        
        return histories;
     }
     
 */