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
        Nurse N = new Nurse("Bachelors", "Nightshift", false, "fawzea", "fawzea@fawzea.com", "0121616532", 26, "Female", "obour city", "nurse", 2000);
        //db.insertPerson(N);
        //DB.db.insertPerson(N);

        //Person N = new Nurse("Bachelors","Nightshift","xyz",false,"7osnya","7osnya.bue@7osnya.com","0121616532", 26,"Female","obour city","nurse",2000);
        //db.insertPerson(N);
        try {

            Registry r = LocateRegistry.createRegistry(1010);
            ChemistInterface C = new ChemistHandler();
            OperationInterface op = new Operation();
            ReceptionistManager R = new Reception();
            PersonInterface p = new PersonHandler();
            BillReadOnly b = new BillHandler();
            Budget a = new HBController();
            
            r.bind("rece", R);
            r.bind("per", p);
            r.bind("chem", C);
            r.bind("bill", b);
            r.bind("budget", a);
            r.bind("oper", op);
            
            //Person m = new Doctor("Neurologist","Neuro-dept","day","Mohamed","mohamed@mohamed.com","11111",30,"Male","helwan","Doctor",12500);
            // db.insertPerson(m);

            System.out.println("Server Is Ready!");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
