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

enum Degreelvl{Bachelors, MAsters, Doctoral};
enum Shifts{NightShift, DayShift};

public class Nurse extends Person{
    
    private Degreelvl degreeLvl;
    private Shifts Shift;
    private String Operation;
    private boolean availability;

    public Nurse(Degreelvl degreeLvl, Shifts Shift, String Operation, boolean availability, String name, String email, String phone, int age, Genders gender, String address, String role, float salary) {
        super(name, email, phone, age, gender, address, role, salary);
        this.degreeLvl = degreeLvl;
        this.Shift = Shift;
        this.Operation = Operation;
        this.availability = availability;
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
