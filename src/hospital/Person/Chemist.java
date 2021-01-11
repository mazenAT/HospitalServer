/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Person;

import hospital.Tranactions.LaboratoryTest;

/**
 *
 * @author islam
 */

enum Degreelvl{Bachelors, MAsters, Doctoral};
enum Shifts{NightShift, DayShift};

public class Chemist extends person{
    
    private Degreelvl degreeLvl;
    private Shifts Shift;
    private LaboratoryTest[] LT;

    public Chemist(Degreelvl degreeLvl, Shifts Shift, LaboratoryTest[] LT, String name, String email, String phone, int age, Genders gender, String address, String role, float salary) {
        super(name, email, phone, age, gender, address, role, salary);
        this.degreeLvl = degreeLvl;
        this.Shift = Shift;
        this.LT = LT;
    }

    public Degreelvl getDegreeLvl() {
        return degreeLvl;
    }

    public void setDegreeLvl(Degreelvl degreeLvl) {
        this.degreeLvl = degreeLvl;
    }

    public Shifts getShift() {
        return Shift;
    }

    public void setShift(Shifts Shift) {
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
