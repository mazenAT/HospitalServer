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
    private MongoCollection<Document> OutdoorPatient;
    private MongoCollection<Document> IndoorPatient;
    private Gson gson = new Gson();

    MongoClientURI uri = new MongoClientURI(
            "mongodb+srv://mazen:Mazen123@cluster0.x8xwc.mongodb.net/test"
    );

    public DBConnection() {
        mongo = new MongoClient(uri);// uri of the database
        hospital = mongo.getDatabase("hospital");//database name


        Person = hospital.getCollection("Person"); // Collection nam
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
        Medical_Insurance = hospital.getCollection("Medical_Insurance");
        Operation = hospital.getCollection("Operation");
        OutdoorPatient = hospital.getCollection("OutdoorPatient");
        IndoorPatient = hospital.getCollection("IndoorPatient");
        System.out.println("Connected successfully");
    }

    
    
    
     public void insertPerson(Person P) {
        Person.insertOne(Document.parse(gson.toJson(P)));
        System.out.println("Person inserted.");
    }
      public void insertOutDoorPatient(Patient P) {
        OutdoorPatient.insertOne(Document.parse(gson.toJson(P)));
        System.out.println("OutPatient inserted.");
    }
       public void insertInDoorPatient(Patient P) {
        IndoorPatient.insertOne(Document.parse(gson.toJson(P)));
        System.out.println("Inpatient inserted.");
    }
       public void FilePatientInsurance(Medical_Insurance MI) {
        Medical_Insurance.insertOne(Document.parse(gson.toJson(MI)));
        System.out.println("Insurance claimed.");
    }
     public void deletePerson(String email) {
        Person.deleteOne(Filters.eq("email", email));
    }
     public void updatePerson(Person P) {
        Document doc = Document.parse(gson.toJson(P));
        Person.replaceOne(Filters.eq("email", P.getEmail()), doc);
    }
    public Person getPersonByMail(String email) {
        Document doc = Person.find(Filters.eq("email", email)).first();
        Person result = gson.fromJson(doc.toJson(), Person.class);
        return result;
    }

    public ArrayList<Person> getAllPersons() {
        ArrayList<Person> result = new ArrayList();
        ArrayList<Document> docs = Person.find().into(new ArrayList<Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), Person.class));
        }
        return result;
    }

     public void insertRoom(Room R) {
        Room.insertOne(Document.parse(gson.toJson(R)));
        System.out.println("Room inserted.");
    }
      public void insertSupplier(Supplier S) {
        Supplier.insertOne(Document.parse(gson.toJson(S)));
        System.out.println("Supplier inserted.");
    }
       public void insertWarehouse(Warehouse W) {
        Warehouse.insertOne(Document.parse(gson.toJson(W)));
        System.out.println("Warehouse inserted.");
    }
       
     public void deleteRoom(int RoomNum) {
        Room.deleteOne(Filters.eq("RoomNum", RoomNum));
    }
      public void deleteSupplier(String Supplier_Name) {
        Supplier.deleteOne(Filters.eq("Supplier_Name", Supplier_Name));
    }   
     public void deleteWarehouse(int WarehouseNum) {
        Warehouse.deleteOne(Filters.eq("WarehouseNum", WarehouseNum));
    }
       
     public Room getRoomByRoomNum(int RoomNum) {
        Document doc = Room.find(Filters.eq("RoomNum",  RoomNum)).first();
        Room result = gson.fromJson(doc.toJson(), Room.class);
        return result;
    }
     public Supplier getSupplierBySupplier_Name(String Supplier_Name) {
        Document doc = Supplier.find(Filters.eq("Supplier_Name",  Supplier_Name)).first();
        Supplier result = gson.fromJson(doc.toJson(), Supplier.class);
        return result;
    }
     public Warehouse getWarehouseByWarehouse(int WarehouseNum) {
        Document doc = Warehouse.find(Filters.eq("WarehouseNum",  WarehouseNum)).first();
        Warehouse result = gson.fromJson(doc.toJson(), Warehouse.class);
        return result;
    }
     public ArrayList<Room> getAllRoom() {
        ArrayList<Room> result = new ArrayList();
        ArrayList<Document> docs = Room.find().into(new ArrayList<Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), Room.class));
        }
        return result;

    }

    
    
      public void insertLab(Laboratory l) {
        Laboratory.insertOne(Document.parse(gson.toJson(l)));
        System.out.println("Laboratory inserted.");
      }

    public void deleteLab(String id) {
    Laboratory.deleteOne(Filters.eq("id", id));
    }

    public Laboratory getLabByID(String id) {
    Document doc = Laboratory.find(Filters.eq("id", id)).first();
    Laboratory result = gson.fromJson(doc.toJson(), Laboratory.class);
    return result;
    }



    public ArrayList<Laboratory> getAllLabs() {
    ArrayList<Laboratory> result = new ArrayList();
    ArrayList<Document> docs = Laboratory.find().into(new ArrayList<Document>());
    for (int i = 0; i < docs.size(); i++) {
    result.add(gson.fromJson(docs.get(i).toJson(), Laboratory.class));
    }
    return result;
    }
    
    

    public ArrayList<Warehouse> getAllWarehouse() {
        ArrayList<Warehouse> result = new ArrayList();
        ArrayList<Document> docs = Warehouse.find().into(new ArrayList<Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), Warehouse.class));
        }
        return result;
    }public ArrayList<Supplier> getAllSupplier() {
        ArrayList<Supplier> result = new ArrayList();
        ArrayList<Document> docs = Supplier.find().into(new ArrayList<Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), Supplier.class));
        }
        return result;
    }


    //***************** Clinic Database *******************// 
    public void insertClinic(Clinic C) {
        Clinic.insertOne(Document.parse(gson.toJson(C)));
        System.out.println("Clinic inserted.");
    }

    public void deleteClinic(String ClinicNumber) {
        Clinic.deleteOne(Filters.eq("ClinicNumber", ClinicNumber));
    }

    public Clinic GetClinicbyNum(String ClinicNumber) {
        Document doc = Clinic.find(Filters.eq("ClinicNumber", ClinicNumber)).first();
        Clinic result = gson.fromJson(doc.toJson(), Clinic.class);
        return result;
    }

    public ArrayList<Clinic> getClinicbyNum(String ClinicNumber) {
        ArrayList<Clinic> result = new ArrayList();
        ArrayList<Document> docs = Clinic.find(Filters.eq("ClinicNumber", ClinicNumber)).into(new ArrayList<Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), Clinic.class));
        }
        return result;
    }

    public void UpdateClinic(Clinic C) {
        Document doc = Document.parse(gson.toJson(C));
        Clinic.replaceOne(Filters.eq("ClinicNumber", C.getClinicNumber()), doc);

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

      public void updateRoom(Room R) {
        Document doc = Document.parse(gson.toJson(R));
        Room.replaceOne(Filters.eq("RoomNum", R.getRoomNum()), doc);
    }
      public void updateSupplier(Supplier s) {
        Document doc = Document.parse(gson.toJson(s));
        Supplier.replaceOne(Filters.eq("Supplier_Name", s.getSupplier_Name()), doc);
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
      public void updateWarehouse(Warehouse s) {
        Document doc = Document.parse(gson.toJson(s));
        Warehouse.replaceOne(Filters.eq("WarehouseNum", s.getWarehouseNum()), doc);
    }
     
    public void close() {
        mongo.close();
    }


}
