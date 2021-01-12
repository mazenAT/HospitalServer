/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Spaces;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Warehouse {
     private ArrayList <medicine> medicine;
    private ArrayList <medicalTool> MedicalTool;
    private int Medicinequantity;
    private int medicalToolquantity;

    public Warehouse(ArrayList<medicine> medicine, ArrayList<medicalTool> MedicalTool, int Medicinequantity, int medicalToolquantity) {
        this.medicine = medicine;
        this.MedicalTool = MedicalTool;
        this.Medicinequantity = Medicinequantity;
        this.medicalToolquantity = medicalToolquantity;
    }

    public ArrayList<medicine> getMedicine() {
        return medicine;
    }

    public void setMedicine(ArrayList<medicine> medicine) {
        this.medicine = medicine;
    }

    public ArrayList<medicalTool> getMedicalTool() {
        return MedicalTool;
    }

    public void setMedicalTool(ArrayList<medicalTool> MedicalTool) {
        this.MedicalTool = MedicalTool;
    }

    public int getMedicinequantity() {
        return Medicinequantity;
    }

    public void setMedicinequantity(int Medicinequantity) {
        this.Medicinequantity = Medicinequantity;
    }

    public int getMedicalToolquantity() {
        return medicalToolquantity;
    }

    public void setMedicalToolquantity(int medicalToolquantity) {
        this.medicalToolquantity = medicalToolquantity;
    }

    
    public boolean CheckMedicinequantity(){
    return true;
}
    public boolean CheckMedicalToolquantity(){
        return true;
}
    
    
}
