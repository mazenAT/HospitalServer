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
    public boolean RegisterP(Person P){
       ArrayList<Person> arr = new ArrayList();
       boolean found = false;
       arr = db.getAllPersons();
       for(int i = 0; i<arr.size(); i++){
           if(P == arr.get(i)){
               found = true;
           }
           else{
               db.insertPerson(P);
           }
       }
       return found;
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
     public Person GetP(Person P ){
         
         return db.getPersonByMail(P.getEmail());
     }
    
}
