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
public interface PersonInterface extends Remote{
    
    public void RegisterP(Person P)throws RemoteException;
    
    public void DeleteP(Person P)throws RemoteException;
    
    public void UpdateP(Person P)throws RemoteException;
    
    public Person GetP(Person P)throws RemoteException;
    
    
}
