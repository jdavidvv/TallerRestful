/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerrestful;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class AppAsociado {

 EntityManagerFactory emf = Persistence.createEntityManagerFactory("TallerRestfulPU");
        EntityManager em = emf.createEntityManager();
   
        String nombre;
               
        public Asociado crearAsociado(String asociado){
            em.getTransaction().begin();
            Asociado a = new Asociado();
            a.setNombre(asociado);
            em.persist(a);
            em.getTransaction().commit();
        
            em.close();
            emf.close();
            return a;
                    
        }
        
       public static void buscarAsociado(){
           EntityManagerFactory emf = Persistence.createEntityManagerFactory("TallerRestfulPU");
           EntityManager em = emf.createEntityManager();

           em.getTransaction().begin();

           String o;

           do {

               System.out.println("Ingrese asociado a buscar: ");
               Scanner b = new Scanner(System.in);
               String bu = b.nextLine();
               Asociado a = em.find(Asociado.class, bu);

               System.out.println("\nAsociado: " + a.getNombre() + "\n");

               System.out.println("Desea buscar otro asociado S/N?");
               Scanner op = new Scanner(System.in);
               o = op.nextLine();
           } while (o.equals("s") || o.equals("S"));

           em.close();
           emf.close();
     
   }
        
        public static void asociado(String[] args) {
            int op;

            do {
                System.out.println("\n1. Crear asociado");
                System.out.println("2. Buscar asociado");
                System.out.println("3. Salir");
                System.out.println("Elija una Opcion:");
                Scanner s = new Scanner(System.in);

                op = s.nextInt();

                switch (op) {
                    case 1:
                        //Crear asociado                              
                         System.out.println("Digite nombre: ");
                        Scanner n = new Scanner(System.in);
                        String nombres = n.nextLine();
                        AppAsociado a = new AppAsociado();
                        a.crearAsociado(nombres);
        
                        break;
                    case 2:
                        //Buscar asociado
                        AppAsociado.buscarAsociado();
                        break;
                    case 3:
                        //SALIR
                        break;
                    default:
                        System.out.println("Opcion Invalida");
                }
            } while (op != 3);
               
    }        
}
