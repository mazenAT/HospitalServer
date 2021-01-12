/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;


import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;

import hospital.Person.*;
import hospital.Expenditures.*;
import hospital.Spaces.*;
import hospital.Tranactions.*;

/**
 *
 * @author mazen
 */
public class DBConnection {
    private MongoClient mongo;
    private MongoDatabase hospital;
    private MongoCollection<Document> Person;
    private MongoCollection<Document> Equipments;
    private MongoCollection<Document> MedicalTool;
    private MongoCollection<Document> Medicine;
    private MongoCollection<Document> Clinic;
    private MongoCollection<Document> Laboratory;
    private MongoCollection<Document> Room;
    private MongoCollection<Document> Supplier;
    private MongoCollection<Document> Ward;
    private MongoCollection<Document> Warehouse;
    private MongoCollection<Document> Bill;
    private MongoCollection<Document> LaboratoryTest;
    private MongoCollection<Document> Medical_Insurance; 
    private MongoCollection<Document> Operation;
    private Gson gson = new Gson();
    
MongoClientURI uri = new MongoClientURI(
    "mongodb+srv://mazen:Mazen123@cluster0.x8xwc.mongodb.net/test"
);

    public DBConnection(){
        mongo = new MongoClient(uri);// uri of the database
        hospital = mongo.getDatabase("hospital");//database name
        Person = hospital.getCollection("Person"); // Collection name
        Clinic= hospital.getCollection("Clinic");
        Laboratory= hospital.getCollection("Laboratory");
        Room= hospital.getCollection("Room");
        Equipments = hospital.getCollection("Equipments");
        MedicalTool = hospital.getCollection("MedicalTool");
        Medicine = hospital.getCollection("Medicine");
        Warehouse = hospital.getCollection("Warehouse");
        Ward = hospital.getCollection("Ward");
        Supplier = hospital.getCollection("Supplier");
        Bill = hospital.getCollection("Bill");
        LaboratoryTest = hospital.getCollection("LaboratoryTest");
        Medical_Insurance= hospital.getCollection("Medical_Insurance");
        Operation= hospital.getCollection("Operation");
        System.out.println("Connected successfully");
    }
    
  
    
    
    public void insertEquipments(Equipments E) {
        Equipments.insertOne(Document.parse(gson.toJson(E)));
    }
    
    public void deleteEquipments(String Id) {
        Equipments.deleteOne(Filters.eq("Id", Id));
    }
    
     public Equipments getEquipmentByID(int Id) {
        Document doc = Equipments.find(Filters.eq("Id", Id)).first();
        Equipments result = gson.fromJson(doc.toJson(), Equipments.class);
        return result;
    }
     
    public void updateMedicalTool(Equipments E) {
        Document doc = Document.parse(gson.toJson(E));
        Equipments.replaceOne(Filters.eq("Id", E.getId()), doc);
        
    } 
     
    public void insertMedicalTool(MedicalTool MT) {
        MedicalTool.insertOne(Document.parse(gson.toJson(MT)));
        
    }
    
     public void deleteMedicalToolt(String Code) {
        MedicalTool.deleteOne(Filters.eq("Code", Code));
    }
     
    public MedicalTool getMedicalToolByCode(String Code) {
        Document doc = MedicalTool.find(Filters.eq("Code", Code)).first();
        MedicalTool result = gson.fromJson(doc.toJson(), MedicalTool.class);
        return result;
    } 
    
    public void updateMedicalTool(MedicalTool MT) {
        Document doc = Document.parse(gson.toJson(MT));
        MedicalTool.replaceOne(Filters.eq("Code", MT.getCode()), doc);
        
    }
    
    
    public void insertMedicine(Medicine M) {
        Medicine.insertOne(Document.parse(gson.toJson(M)));
     
    }
    
     public void deleteMedicine(String Code) {
        Medicine.deleteOne(Filters.eq("Code", Code));
    }
     
    public Medicine getMedicineByCode(String Code) {
        Document doc = Medicine.find(Filters.eq("Code", Code)).first();
        Medicine result = gson.fromJson(doc.toJson(), Medicine.class);
        return result;
    }  
    
    public void updateMedicine(Medicine M) {
        Document doc = Document.parse(gson.toJson(M));
        Medicine.replaceOne(Filters.eq("Code", M.getCode()), doc);
        
    }
    
    public void insertWard(Ward WR) {
        Ward.insertOne(Document.parse(gson.toJson(WR)));
        
    }
    
    public void deleteWard(String WardId) {
        Ward.deleteOne(Filters.eq("WardId", WardId));
    }
    
    public Ward getWardById(String WardId) {
        Document doc = Ward.find(Filters.eq("WardId", WardId)).first();
        Ward result = gson.fromJson(doc.toJson(), Ward.class);
        return result;
    } 
    

    public void updateWard(Ward W) {
        Document doc = Document.parse(gson.toJson(W));
        Ward.replaceOne(Filters.eq("WardId", W.getWardId()), doc);
        
    }

    public void close() {
        mongo.close();
    }
    
}
