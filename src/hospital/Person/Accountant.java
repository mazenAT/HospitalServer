/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Person;

import hospital.Tranactions.Medical_Insurance;
import hospital.Tranactions.Operation;

/**
 *
 * @author Ezzat
 */
public class Accountant extends Person {
    private String jobDegree;
    private Medical_Insurance[] medicalInsurances;
    private float intial_treasury;
    private float Current_treasury;
    private Operation operation;

    public Accountant(String jobDegree, Medical_Insurance[] medicalInsurances, float Current_treasury, Operation operation, String name, String email, String phone, int age, Genders gender, String address, String role, float salary) {
        super(name, email, phone, age, gender, address, role, salary);
        this.jobDegree = jobDegree;
        this.medicalInsurances = medicalInsurances;
        this.Current_treasury = Current_treasury;
        this.operation = operation;
    }

    public String getJobDegree() {
        return jobDegree;
    }

    public void setJobDegree(String jobDegree) {
        this.jobDegree = jobDegree;
    }

    public Medical_Insurance[] getMedicalInsurances() {
        return medicalInsurances;
    }

    public void setMedicalInsurances(Medical_Insurance[] medicalInsurances) {
        this.medicalInsurances = medicalInsurances;
    }

    public float getIntial_treasury() {
        return intial_treasury;
    }

    public void setIntial_treasury(float intial_treasury) {
        this.intial_treasury = intial_treasury;
    }

    public float getCurrent_treasury() {
        return Current_treasury;
    }

    public void setCurrent_treasury(float Current_treasury) {
        this.Current_treasury = Current_treasury;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Accountant{" + "jobDegree=" + jobDegree + ", medicalInsurances=" + medicalInsurances + ", intial_treasury=" + intial_treasury + ", Current_treasury=" + Current_treasury + ", operation=" + operation + '}';
    }
    
   // functions here 
    
    public void DrawSalary(){
        
    }
    
    public float CalculateExpenditures(){
        return 0;
    }
    
    public float Calcluate_Net_Profit(){
        return 0;
    }
    
    public float Assign_Expenditures(){
        return 0;
    }
    
    public void Update(){
        
    }
}
