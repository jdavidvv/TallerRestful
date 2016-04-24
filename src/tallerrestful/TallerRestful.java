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

public class TallerRestful {

    public static void main(String[] args) {
                  
         int op; 
              
        do{
        System.out.println("\n1. Ingresar/Buscar asociado");
        System.out.println("2. Ingresar Registro");
        System.out.println("3. Salir");
        System.out.println("Elija una Opcion:");
        Scanner s=new Scanner(System.in);
        
        op=s.nextInt();
        
        switch(op){
            case 1:
                //Crear asociado                              
                AppAsociado.asociado(args);
                break;
            case 2:
                //AppRegistradora.registradora(args);
                break;
            case 3:
                //SALIR
                break;
            default:
                System.out.println("Opcion Invalida");
        }
       }while(op!=3);
        
       }
    
}
