/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Spaces;

import hospital.Expenditures.Equipments;
import hospital.Person.Chemist;
import hospital.Tranactions.LaboratoryTest;

/**
 *
 * @author islam
 */

public class Laboratory {
    
    private Chemist[] staff;
    private Equipments[] medicalTools;
    private LaboratoryTest[] samples;

    
    
    public Laboratory(Chemist[] staff, Equipments[] medicalTools, LaboratoryTest[] samples) {
        this.staff = staff;
        this.medicalTools = medicalTools;
        this.samples = samples;
    }
    
    

    public Chemist[] getStaff() {
        return staff;
    }

    public void setStaff(Chemist[] staff) {
        this.staff = staff;
    }

    public Equipments[] getMedicalTools() {
        return medicalTools;
    }

    public void setMedicalTools(Equipments[] medicalTools) {
        this.medicalTools = medicalTools;
    }

    public LaboratoryTest[] getSamples() {
        return samples;
    }

    public void setSamples(LaboratoryTest[] samples) {
        this.samples = samples;
    }

    @Override
    public String toString() {
        return "Laboratory{" + "staff=" + staff + ", medicalTools=" + medicalTools + ", Samples=" + samples + '}';
    }
    
    
    
}
