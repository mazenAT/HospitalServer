/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Person;

import hospital.Tranactions.LaboratoryTest;
import hospital.Person.*;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author islam
 */

public class Chemist extends Person implements Serializable{
    
    private String JobDegree;
    private String Shift;
    private ArrayList<LaboratoryTest> LT;

    public Chemist(String JobDegree, String Shift, ArrayList<LaboratoryTest> LT, String name, String email, String phone, int age, String gender, String address, String role, float salary) {
        super(name, email, phone, age, gender, address, role, salary);
        this.JobDegree = JobDegree;
        this.Shift = Shift;
        this.LT = LT;
    }

    

    public String getDegreeLvl() {
        return JobDegree;
    }

    public void setDegreeLvl(String JobDegree) {
        this.JobDegree = JobDegree;
    }

    public String getShift() {
        return Shift;
    }

    public void setShift(String Shift) {
        this.Shift = Shift;
    }

    public ArrayList<LaboratoryTest> getLT() {
        return LT;
    }

    public void setLT(LaboratoryTest LT) {
        this.LT.add(LT);
    }

    @Override
    public String toString() {
        return "Chemist{" + "degreeLvl=" + JobDegree + ", Shift=" + Shift + ", LT=" + LT + '}';
    }
    
    
    
}
