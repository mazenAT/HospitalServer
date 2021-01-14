/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author isl27
 */
public interface Budget extends Remote{
    
    public double getWages() throws RemoteException;
    public double getEq() throws RemoteException;
    public double getMT() throws RemoteException;
    public double getMedicine() throws RemoteException;
    public double setIncome(String name,double x) throws RemoteException;
    public double setWagesExpenditures(String name,double x) throws RemoteException;
    public double setEquipmentExpenditures(String name,double x) throws RemoteException;
    public double setMedicalToolsExpenditures(String name,double x) throws RemoteException;
    public double setMedicineExpenditures(String name,double x) throws RemoteException;
    
}
