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
public class DiabetesTest implements Test{
    private String TestType;
    private String ChemistName;
    private float testPrice;
    private String PateintName;
    private int TestSample;

    public DiabetesTest(String TestType, String ChemistName, float testPrice, String PateintName, int TestSample) {
        this.TestType = TestType;
        this.ChemistName = ChemistName;
        this.testPrice = testPrice;
        this.PateintName = PateintName;
        this.TestSample = TestSample;
    }

    public int getTestSample() {
        return TestSample;
    }

    public void setTestSample(int TestSample) {
        this.TestSample = TestSample;
    }
    
    

    public DiabetesTest() {
        
    }


    public String getTestType() {
        return TestType;
    }

    public void setTestType(String TestType) {
        this.TestType = TestType;
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
    
    @Override
    public void MakeTest () {
       
        this.TestSample = TestSample*5;
    }
    
}
