/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Tranactions;

import hospital.DBConnection;
import hospital.Person.Patient;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;


/**
 *
 * @author Lenovo
 */
public class BillHandler extends UnicastRemoteObject implements BillInterface {
DBConnection db = new DBConnection();
    public BillHandler() throws RemoteException {
    }
    @Override
    public Bill GenerateTestBill(String N) throws RemoteException {
        ArrayList<Bill> B = new ArrayList<Bill>();
        B=db.getAllBills();
        Bill a = new Bill();
         for(int x=0; x<B.size() ;x++ ){
                    if(B.get(x).getPateintName()== N){
                        a= B.get(x);  
                        return a;
    }
    
}
         return null;
    }
}