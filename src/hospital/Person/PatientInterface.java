/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Person;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author hmoo_
 */
public interface PatientInterface extends Remote{
    public void registerPateint(Patient P,String Admission) throws RemoteException;
}
