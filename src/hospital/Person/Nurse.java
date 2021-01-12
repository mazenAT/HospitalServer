/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Person;

/**
 *
 * @author islam
 */




public class Nurse extends Person{
   
    
    private String degreeLvl;
    private String Shift;
    private String Operation;
    private boolean availability;

    public Nurse(String degreeLvl, String Shift, String Operation, boolean availability, String name, String email, String phone, int age, String gender, String address, String role, float salary) {
        super(name, email, phone, age, gender, address, role, salary);
        this.degreeLvl = degreeLvl;
        this.Shift = Shift;
        this.Operation = Operation;
        this.availability = availability;
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

    public String getOperation() {
        return Operation;
    }

    public void setOperation(String Operation) {
        this.Operation = Operation;
    }


    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    
    
    
    
    //******************** Functions **********************
    
    public boolean checkAvailability()
    {
        return availability;
        
    }
    
    
    public void changeShift()
    {
        
    }
    
    
    public void update()
    {
        
    }
    
}
