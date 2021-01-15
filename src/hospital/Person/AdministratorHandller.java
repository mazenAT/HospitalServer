/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Person;

import hospital.DBConnection;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Ezzat
 */
public class AdministratorHandller extends UnicastRemoteObject implements Administration {

    DBConnection db = new DBConnection();

    public AdministratorHandller() throws RemoteException {
    }

    @Override
    public void MaintainDoctorRecord(Doctor D) throws RemoteException {
      db.updateDoctorRecord(D);
    }

    @Override
    public void RegisterDoctor(Doctor D) throws RemoteException {
        db.insertDoctor(D);
        System.out.println("Doctor Added "+D);
    }

}
