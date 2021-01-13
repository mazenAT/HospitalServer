/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author mazen
 */
import hospital.Person.*;
import hospital.Expenditures.*;
import hospital.Spaces.*;
import hospital.Tranactions.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;



public class HospitalServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        try{
       DBConnection db = new DBConnection();
       // Person N = new Nurse("Bachelors","Nightshift","xyz",false,"noor","noor@bue.com","0121616532", 26,"Female","obour city","nurse",2000);
       // db.insertPerson(N);
        PersonInterface p = new Person();
       // Registry registry = LocateRegistry.createRegistry(1260);
       // registry.bind("person",p);
        Person m = new Doctor("Neurologist","Neuro-dept","day",null,null,"Mohamed","mohamed@mohamed.com","01000214546",30,"Male","helwan","Doctor",12500);
        db.insertPerson(m);
        
        
        
        System.out.print("Server Is Ready");
        }catch(Exception ex){
            System.out.print(ex);
        }

    }
    
}
