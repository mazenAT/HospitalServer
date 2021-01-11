/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Tranactions;

/**
 *
 * @author mazen
 */
public class Medical_Insurance {
    private String ID;
    private String Patient_ID;
    private String CompanyName;
    private boolean Status;
    private String Type;
    private float cost;

    public Medical_Insurance(String ID, String Patient_ID, String CompanyName, boolean Status, String Type, float cost) {
        this.ID = ID;
        this.Patient_ID = Patient_ID;
        this.CompanyName = CompanyName;
        this.Status = Status;
        this.Type = Type;
        this.cost = cost;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPatient_ID() {
        return Patient_ID;
    }

    public void setPatient_ID(String Patient_ID) {
        this.Patient_ID = Patient_ID;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    
    public void File_Insurance_Claim(Patient p){
    }
    public boolean ApproveInsuranceClaim(Medical_Insurance MI){
        return false;
    }
    
    
}
