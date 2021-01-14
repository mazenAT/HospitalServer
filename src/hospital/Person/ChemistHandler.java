/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Person;

import hospital.DBConnection;
import hospital.Tranactions.LaboratoryTest;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class ChemistHandler extends UnicastRemoteObject implements ChemistInterface {
DBConnection db = new DBConnection();
public ChemistHandler() throws RemoteException {
    }
    @Override
    public LaboratoryTest GenerateTestResult(String N) throws RemoteException {
        ArrayList<Patient> z1 = new ArrayList<Patient>();
        z1=db.getAllPatient();
        
         ArrayList<LaboratoryTest> z2 = new ArrayList<LaboratoryTest>();
        z2=db.getAllLaboratoryTest();
   
        Patient a = new Patient();
        LaboratoryTest b = new LaboratoryTest();
      
        for(int y=0; y<z1.size(); y++){
            if(z1.get(y).getName()== N )
               a =z1.get(y);
        }
        for(int x=0;x<z2.size();x++ ){
                    if(z2.get(x).getPateintName()== a.getName()){
                        b=z2.get(x); 
                        return b;
                    }
                }   
        return null;
    }
    
}
