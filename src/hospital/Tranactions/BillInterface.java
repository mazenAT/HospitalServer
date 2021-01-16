/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospital.Tranactions;
import hospital.DBConnection;
import hospital.Tranactions.LaboratoryTestFactory;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Lenovo
 */
public interface BillInterface extends Remote {
     public Bill GenerateTestBill(String N) throws RemoteException;
    
}
