/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerrestful;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppRegistradora {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TallerRestfulPU");
        EntityManager em = emf.createEntityManager();
   
        Asociado asociado = new Asociado();
        Date fechaIngreso = new Date();
        
        public Registradora crearRegistro(Date fecha, String Nombre){
            em.getTransaction().begin();
            Registradora r = new Registradora();
            r.setFecha(fecha);
            int id=0;
            id++;
            r.setId(id);
            //r.setIdAsociado(asociado);
               String bu = Nombre;
               Asociado a = em.find(Asociado.class, bu);
               System.out.println("\nAsociado: " + a.getNombre());
               System.out.println("Registro: " + r.getId());
               System.out.println("Fecha: " + r.getFecha() + "\n");
               
            em.persist(r);
            em.getTransaction().commit();
        
            em.close();
            emf.close();
            return r;       
        
        }
        public static void registradora(String[] args) {
            
            AppRegistradora c = new AppRegistradora();
        
            c.crearRegistro (new Date(), "BRYAN");
        
    }    
        
       //c.crearPersona(01,"Valverde","David","Cra 45 #12-32",3423454);
           
        
   
    }