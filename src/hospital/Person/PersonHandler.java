/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Person;

import hospital.DBConnection;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author mazen
 */
public class PersonHandler extends UnicastRemoteObject implements PersonInterface {

    
    DBConnection db =new DBConnection();
    
    public PersonHandler() throws RemoteException {
    }
    
     @Override
    public void RegisterP(Person P){
      if(db.PersonAlreadyExists(P))
          System.out.print("The User Already Exists!!!!!");
      else{
          db.insertPerson(P);}
   }

    @Override
    public void DeleteP(Person P)
    {
        db.deletePerson(P.getEmail());
    }

   @Override
    public void UpdateP(Person P)
    {
        db.updatePerson(P);
    }

    @Override
     public Person GetP(String email ){
         
         return db.getPersonByMail(email);
     }
    
}
