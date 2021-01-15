/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Person;

import hospital.Tranactions.Medical_Insurance;
import hospital.Tranactions.Operation;
import java.io.Serializable;
import java.rmi.RemoteException;

/**
 *
 * @author Ezzat
 */
public class Accountant extends Person implements Serializable{
    private String jobDegree;
    private Operation operation;

   

    public Accountant(String jobDegree, Operation operation, String name, String email, String phone, int age, String gender, String address, String role, float salary) {
        super(name, email, phone, age, gender, address, role, salary);
        this.jobDegree = jobDegree;
        this.operation = operation;
    }

    public String getJobDegree() {
        return jobDegree;
    }

    public void setJobDegree(String jobDegree) {
        this.jobDegree = jobDegree;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Accountant{" + "jobDegree=" + jobDegree + ", operation=" + operation + '}';
    }

   

      public void Update(){
        
    }
}
