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
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;



public class HospitalServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException {
        // TODO code application logic here
        DBConnection db = new DBConnection();
//        HospitalBudget h = new HospitalBudget("El-Amal",0,0,0,0,0);
        
        try {
            // My remote object [Skeleton]
            Budget a = new HBController();
            
            // My RMI Registry
            Registry registry = LocateRegistry.createRegistry(1099);
            
            //Add my object to the RMI Registry
            registry.bind("budget", a);
            System.out.println("Ready...");   
        } catch (Exception ex) {
           System.out.println("Exception occured");
        } 
        
    }
    
}
