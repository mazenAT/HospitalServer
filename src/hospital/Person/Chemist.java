/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Person;

import hospital.Tranactions.LaboratoryTest;
import hospital.Person.*;
/**
 *
 * @author islam
 */

public class Chemist extends Person{
    
    private String degreeLvl;
    private String Shift;
    private LaboratoryTest[] LT;

    public Chemist(String degreeLvl, String Shift, LaboratoryTest[] LT, String name, String email, String phone, int age, String gender, String address, String role, float salary) {
        super(name, email, phone, age, gender, address, role, salary);
        this.degreeLvl = degreeLvl;
        this.Shift = Shift;
        this.LT = LT;
    }

    public String getDegreeLvl() {
        return degreeLvl;
    }

    public void setDegreeLvl(String degreeLvl) {
        this.degreeLvl = degreeLvl;
    }

    public String getShift() {
        return Shift;
    }

    public void setShift(String Shift) {
        this.Shift = Shift;
    }

    public LaboratoryTest[] getLT() {
        return LT;
    }

    public void setLT(LaboratoryTest[] LT) {
        this.LT = LT;
    }

    @Override
    public String toString() {
        return "Chemist{" + "degreeLvl=" + degreeLvl + ", Shift=" + Shift + ", LT=" + LT + '}';
    }
    
    
    
}
