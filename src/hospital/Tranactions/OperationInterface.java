/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Tranactions;

import hospital.Person.Doctor;
import hospital.Person.Nurse;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Ezzat
 */
public interface OperationInterface extends Remote {

    public void AssignAssistingDoctor(Doctor D) throws RemoteException;

    public void AssignMainDoctor(Doctor D) throws RemoteException;

    public void AssignNurse(Nurse N) throws RemoteException;
}
