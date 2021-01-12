/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Tranactions;

import hospital.Person.*;
/**
 *
 * @author mazen
 */
public class Operation {
    private float cost;
    private String time;
    private String AssignedNurse;
    private String AssignedDoctor;
    private int wardId;
    private int RoomNumber;
    private int PatientId;

    public Operation(float cost, String time, String AssignedNurse, String AssignedDoctor, int wardId, int RoomNumber, int PatientId) {
        this.cost = cost;
        this.time = time;
        this.AssignedNurse = AssignedNurse;
        this.AssignedDoctor = AssignedDoctor;
        this.wardId = wardId;
        this.RoomNumber = RoomNumber;
        this.PatientId = PatientId;
    }


    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAssignedNurse() {
        return AssignedNurse;
    }

    public void setAssignedNurse(String AssignedNurse) {
        this.AssignedNurse = AssignedNurse;
    }

    public String getAssignedDoctor() {
        return AssignedDoctor;
    }

    public void setAssignedDoctor(String AssignedDoctor) {
        this.AssignedDoctor = AssignedDoctor;
    }

    public int getWardId() {
        return wardId;
    }

    public void setWardId(int wardId) {
        this.wardId = wardId;
    }

    public int getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(int RoomNumber) {
        this.RoomNumber = RoomNumber;
    }

    public int getPatientId() {
        return PatientId;
    }

    public void setPatientId(int PatientId) {
        this.PatientId = PatientId;
    }
    
    public void AssignOperationtoPatient(Patient P){
        
    }
    public void AssignOperationtoDoctor(Doctor D){
        
    }
    public void NotifyAllObservers(){
        
    }
    
}
