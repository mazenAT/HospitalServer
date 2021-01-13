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
 * @author islam
 */



public class Person extends UnicastRemoteObject implements PersonInterface{
    
    private String name;
    private String email;
    private String phone;
    private int age;
    private String gender;
    private String address;
    private String role;
    private float salary;
    private DBConnection db = new DBConnection();
     
    public Person() throws RemoteException{
        
    } 

    public Person(String name, String email, String phone, int age, String gender, String address, String role, float salary) throws RemoteException {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.role = role;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "person{" + "name=" + name + ", email=" + email + ", phone=" + phone + ", age=" + age + ", gender=" + gender + ", address=" + address + ", role=" + role + ", salary=" + salary + '}';
    }
    
    
    
    
    
    //******************** Functions **********************

    /**
     *
     * @param P
     */
    
    @Override
    public void RegisterP(Person P){
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
   }
    
    /**
     *
     * @param P
     */
    @Override
    public void DeleteP(Person P)
    {
        db.deletePerson(P.email);
    }
    
    /**
     *
     * @param P
     */
    @Override
    public void UpdateP(Person P)
    {
        db.updatePerson(P);
    }
    
    @Override
     public Person GetP(Person P ){
         
         return db.getPersonByMail(P.email);
     }
}
