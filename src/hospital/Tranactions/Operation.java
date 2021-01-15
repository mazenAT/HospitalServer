/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Tranactions;

import hospital.Person.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author mazen
 */
public class Operation extends UnicastRemoteObject implements OperationInterface{

    private float cost;
    private String time;
    private ArrayList<Nurse> AssignedNurse;
    private ArrayList<Doctor> AssignedDoctor;
    private ArrayList<Doctor> AssignedAssistingDoctor;
    private int wardId;
    private int RoomNumber;
    private int PatientId;

    public Operation() throws RemoteException{
        
    }

    public Operation(float cost, String time, ArrayList<Nurse> AssignedNurse, ArrayList<Doctor> AssignedDoctor, ArrayList<Doctor> AssignedAssistingDoctor, int wardId, int RoomNumber, int PatientId)throws RemoteException {
        this.cost = cost;
        this.time = time;
        this.AssignedNurse = AssignedNurse;
        this.AssignedDoctor = AssignedDoctor;
        this.AssignedAssistingDoctor = AssignedAssistingDoctor;
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

    public ArrayList<Nurse> getAssignedNurse() {
        return AssignedNurse;
    }

    public void setAssignedNurse(ArrayList<Nurse> AssignedNurse) {
        this.AssignedNurse = AssignedNurse;
    }

    public ArrayList<Doctor> getAssignedDoctor() {
        return AssignedDoctor;
    }

    public void setAssignedDoctor(ArrayList<Doctor> AssignedDoctor) {
        this.AssignedDoctor = AssignedDoctor;
    }

    public ArrayList<Doctor> getAssignedAssistingDoctor() {
        return AssignedAssistingDoctor;
    }

    public void setAssignedAssistingDoctor(ArrayList<Doctor> AssignedAssistingDoctor) {
        this.AssignedAssistingDoctor = AssignedAssistingDoctor;
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

 
   
    public void NotifyAllObservers() {

    }

    @Override
    public void AssignAssistingDoctor(Doctor D) throws RemoteException {
        this.AssignedAssistingDoctor.add(D);
    }

    @Override
    public void AssignMainDoctor(Doctor D) throws RemoteException {
        this.AssignedDoctor.add(D);
    }

    @Override
    public void AssignNurse(Nurse N) throws RemoteException {
        this.AssignedNurse.add(N);
    }

}
