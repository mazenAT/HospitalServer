/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author isl27
 */
public class HospitalBudget {
    
    private String HospName;
    private double income;
    private double wagesExpenditures;
    private double EquipmentExpenditures;
    private double medicalToolsExpenditures;
    private double medicineExpenditures;
    private float intial_treasury;
    private float Current_treasury;

    public HospitalBudget(String HospName, double income, double wagesExpenditures, double EquipmentExpenditures, double medicalToolsExpenditures, double medicineExpenditures, float intial_treasury, float Current_treasury) {
        this.HospName = HospName;
        this.income = income;
        this.wagesExpenditures = wagesExpenditures;
        this.EquipmentExpenditures = EquipmentExpenditures;
        this.medicalToolsExpenditures = medicalToolsExpenditures;
        this.medicineExpenditures = medicineExpenditures;
        this.intial_treasury = intial_treasury;
        this.Current_treasury = Current_treasury;
    }

    public String getHospName() {
        return HospName;
    }

    public void setHospName(String HospName) {
        this.HospName = HospName;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getWagesExpenditures() {
        return wagesExpenditures;
    }

    public void setWagesExpenditures(double wagesExpenditures) {
        this.wagesExpenditures = wagesExpenditures;
    }

    public double getEquipmentExpenditures() {
        return EquipmentExpenditures;
    }

    public void setEquipmentExpenditures(double EquipmentExpenditures) {
        this.EquipmentExpenditures = EquipmentExpenditures;
    }

    public double getMedicalToolsExpenditures() {
        return medicalToolsExpenditures;
    }

    public void setMedicalToolsExpenditures(double medicalToolsExpenditures) {
        this.medicalToolsExpenditures = medicalToolsExpenditures;
    }

    public double getMedicineExpenditures() {
        return medicineExpenditures;
    }

    public void setMedicineExpenditures(double medicineExpenditures) {
        this.medicineExpenditures = medicineExpenditures;
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
    
    
    
}
