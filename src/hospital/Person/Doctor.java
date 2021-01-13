/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Person;

import hospital.Tranactions.Operation;
import java.io.Serializable;
import java.rmi.RemoteException;

/**
 *
 * @author Ezzat
 */

public class Doctor extends Person implements Serializable{
    private String Specialziation;
    private String Department;
    private String shift;
    private Patient[] patient;
    private Operation operation;

    public Doctor(String Specialziation, String Department, String shift, Patient[] patient, Operation operation, String name, String email, String phone, int age, String gender, String address, String role, float salary) throws RemoteException {
        super(name, email, phone, age, gender, address, role, salary);
        this.Specialziation = Specialziation;
        this.Department = Department;
        this.shift = shift;
        this.patient = patient;
        this.operation = operation;
    }

    public String getSpecialziation() {
        return Specialziation;
    }

    public void setSpecialziation(String Specialziation) {
        this.Specialziation = Specialziation;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public Patient[] getPatient() {
        return patient;
    }

    public void setPatient(Patient[] patient) {
        this.patient = patient;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Doctor{" + "Specialziation=" + Specialziation + ", Department=" + Department + ", shift=" + shift + ", patient=" + patient + ", operation=" + operation + '}';
    }

    
    
    
    // functions here
    
    public Operation CheckOperation(){
        return operation;
    }
    public  Patient[] CheckPatients(){
        return patient;
    }
    
    public void Update(){
        
    }
    
}
