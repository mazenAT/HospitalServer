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
public class LaboratoryTest {
    private String ID;
    private String TestName;
    private String ChemistName;
    private float testPrice;
    private String PateintName;

    public LaboratoryTest(String ID, String TestName, String ChemistName, float testPrice, String PateintName) {
        this.ID = ID;
        this.TestName = TestName;
        this.ChemistName = ChemistName;
        this.testPrice = testPrice;
        this.PateintName = PateintName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTestName() {
        return TestName;
    }

    public void setTestName(String TestName) {
        this.TestName = TestName;
    }

    public String getChemistName() {
        return ChemistName;
    }

    public void setChemistName(String ChemistName) {
        this.ChemistName = ChemistName;
    }

    public float getTestPrice() {
        return testPrice;
    }

    public void setTestPrice(float testPrice) {
        this.testPrice = testPrice;
    }

    public String getPateintName() {
        return PateintName;
    }

    public void setPateintName(String PateintName) {
        this.PateintName = PateintName;
    }
    
    public boolean validateTest(String name){
        
        return false;
    }
    public LaboratoryTest GenerateTestResults(){
        
        return null;
    }
    
}
