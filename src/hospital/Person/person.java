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

enum Genders{Male,Female};

public class person {
    
    private String name;
    private String email;
    private String phone;
    private int age;
    private Genders gender;
    private String address;
    private String role;
    private float salary;

    public person(String name, String email, String phone, int age, Genders gender, String address, String role, float salary) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.role = role;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Genders getGender() {
        return gender;
    }

    public void setGender(Genders gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "person{" + "name=" + name + ", email=" + email + ", phone=" + phone + ", age=" + age + ", gender=" + gender + ", address=" + address + ", role=" + role + ", salary=" + salary + '}';
    }
    
    
    
    
    
    //******************** Functions **********************
    
    public void RegisterP()
    {
        
    }
    
    public void DeleteP()
    {
        
    }
    
    public void ModifyP()
    {
        
    }
    
}
