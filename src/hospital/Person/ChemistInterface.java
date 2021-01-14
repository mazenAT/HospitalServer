/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Person;

import hospital.Person.Patient;
import hospital.Tranactions.LaboratoryTest;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public interface ChemistInterface extends Remote{
   public LaboratoryTest GenerateTestResult(String N) throws RemoteException;
}
