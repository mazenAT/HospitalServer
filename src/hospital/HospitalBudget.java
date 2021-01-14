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

    public HospitalBudget(String HospName, double income, double wagesExpenditures, double EquipmentExpenditures, double medicalToolsExpenditures, double medicineExpenditures) {
        this.HospName = HospName;
        this.income = income;
        this.wagesExpenditures = wagesExpenditures;
        this.EquipmentExpenditures = EquipmentExpenditures;
        this.medicalToolsExpenditures = medicalToolsExpenditures;
        this.medicineExpenditures = medicineExpenditures;
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

    @Override
    public String toString() {
        return "HospitalBudget{" + "HospName=" + HospName + ", income=" + income + ", wagesExpenditures=" + wagesExpenditures + ", EquipmentExpenditures=" + EquipmentExpenditures + ", medicalToolsExpenditures=" + medicalToolsExpenditures + ", medicineExpenditures=" + medicineExpenditures + '}';
    }

    
    
}
