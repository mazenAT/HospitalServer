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
        
        try {

            Registry r = LocateRegistry.createRegistry(1010);
            Budget a = new HBController();
            BillReadOnly b = new BillHandler();
            r.bind("budget", a);
            r.bind("bill", b);

            System.out.println("Server Is Ready!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
