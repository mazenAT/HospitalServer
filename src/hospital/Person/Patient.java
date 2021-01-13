/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Person;
import hospital.DBConnection;
import hospital.Tranactions.Medical_Insurance;
import hospital.Person.*;

/**
 *
 * @author islam
 */

enum BloodType{A,B,AB,O}

public class Patient {
    
    private BloodType BT;
    private String name;
    private String phone;
    private int age;
    private String gender;
    private Medical_Insurance insurance;
    private String MedicalCondition;
    
    DBConnection db = new DBConnection();

    public Patient(BloodType BT, String name, String phone, int age, String gender, Medical_Insurance insurance, String MedicalCondition) {
        this.BT = BT;
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
        this.insurance = insurance;
        this.MedicalCondition = MedicalCondition;
    }

    public BloodType getBT() {
        return BT;
    }

    public void setBT(BloodType BT) {
        this.BT = BT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Medical_Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Medical_Insurance insurance) {
        this.insurance = insurance;
    }

    public String getMedicalCondition() {
        return MedicalCondition;
    }

    public void setMedicalCondition(String MedicalCondition) {
        this.MedicalCondition = MedicalCondition;
    }
            
    
    
    
    //******************** Functions **********************

    public void GivePrescription ()
    {
    
    }
    public void registerPateint(Patient P,String Admission){
        if(Admission =="outdoors"){
            db.insertOutDoorPatient(P);
        }else if(Admission =="indoors"){
            db.insertInDoorPatient(P);
        }
            
    }
}
