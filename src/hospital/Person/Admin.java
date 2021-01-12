/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Person;
import hospital.Tranactions.Operation;
/**
 *
 * @author Ezzat
 */
public class Admin extends Person {
    private int adminLicence;
    private String Credintials;
    private Person[] person;
    private Admin AdminInsurance;
    private Operation operation;

    private Admin(int adminLicence, String Credintials, Person[] person, Admin AdminInsurance, Operation operation, String name, String email, String phone, int age, String gender, String address, String role, float salary) {
        super(name, email, phone, age, gender, address, role, salary);
        this.adminLicence = adminLicence;
        this.Credintials = Credintials;
        this.person = person;
        this.AdminInsurance = AdminInsurance;
        this.operation = operation;
    }

    public int getAdminLicence() {
        return adminLicence;
    }

    public void setAdminLicence(int adminLicence) {
        this.adminLicence = adminLicence;
    }

    public String getCredintials() {
        return Credintials;
    }

    public void setCredintials(String Credintials) {
        this.Credintials = Credintials;
    }

    public Person[] getPerson() {
        return person;
    }

    public void setPerson(Person[] person) {
        this.person = person;
    }

    public Admin getAdminInsurance() {
        return AdminInsurance;
    }

    public void setAdminInsurance(Admin AdminInsurance) {
        this.AdminInsurance = AdminInsurance;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Admin{" + "adminLicence=" + adminLicence + ", Credintials=" + Credintials + ", person=" + person + ", AdminInsurance=" + AdminInsurance + ", operation=" + operation + '}';
    }

   public Admin GetInstance(){
       return AdminInsurance;
   }
    
   public void Update(){
       
   }
    
}
