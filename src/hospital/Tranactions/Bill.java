/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Tranactions;

import java.util.Date;

/**
 *
 * @author mazen
 */
public class Bill {
    private String BillID;
    private Date Date;
    private String PateintName;
    private float TotalMoney;
    private Bill BillDetails;

    public Bill(String BillID, Date Date, String PateintName, float TotalMoney) {
        this.BillID = BillID;
        this.Date = Date;
        this.PateintName = PateintName;
        this.TotalMoney = TotalMoney;
    }

    public String getBillID() {
        return BillID;
    }

    public void setBillID(String BillID) {
        this.BillID = BillID;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public String getPateintName() {
        return PateintName;
    }

    public void setPateintName(String PateintName) {
        this.PateintName = PateintName;
    }

    public float getTotalMoney() {
        return TotalMoney;
    }

    public void setTotalMoney(float TotalMoney) {
        this.TotalMoney = TotalMoney;
    }

    public Bill getBillDetails() {
        return BillDetails;
    }
    
    public Bill GenerateTestBill(LaboratoryTest L){
        
        
        return null;
    }
    public Bill OperationBill(Operation O){
        
        
        return null;
    }
}
