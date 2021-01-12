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
    private MongoCollection<Document> Admin;
    private MongoCollection<Document> Accountant;
    private MongoCollection<Document> Chemist;
    private MongoCollection<Document> Doctor;
    private MongoCollection<Document> Receptionist;
    private MongoCollection<Document> Patient;
    private MongoCollection<Document> Nurse;
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
        Admin = hospital.getCollection("Admin"); // Collection name
        Accountant = hospital.getCollection("Accountant"); // Collection name
        Chemist = hospital.getCollection("Chemist");
        Doctor = hospital.getCollection("Doctor");
        Nurse= hospital.getCollection("Nurse");
        Patient= hospital.getCollection("Patient");
        Receptionist= hospital.getCollection("Receptionist");
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
    
    public void insertPerson(Admin A) {
        Admin.insertOne(Document.parse(gson.toJson(A)));
        System.out.println("Student inserted.");
    }
    public void insertPerson(Equipments E) {
        Equipments.insertOne(Document.parse(gson.toJson(E)));
        System.out.println("Student inserted.");
    }
    public void insertPerson(MedicalTool MT) {
        MedicalTool.insertOne(Document.parse(gson.toJson(MT)));
        System.out.println("Student inserted.");
    }
    public void insertPerson(Medicine M) {
        Medicine.insertOne(Document.parse(gson.toJson(M)));
        System.out.println("Student inserted.");
    }
    public void insertPerson(Warehouse W) {
        Warehouse.insertOne(Document.parse(gson.toJson(W)));
        System.out.println("Student inserted.");
    }
    public void insertPerson(Ward WR) {
        Ward.insertOne(Document.parse(gson.toJson(WR)));
        System.out.println("Student inserted.");
    }
    public void insertPerson(Room R) {
        Room.insertOne(Document.parse(gson.toJson(R)));
        System.out.println("Student inserted.");
    }
    public void insertPerson(Laboratory L) {
        Laboratory.insertOne(Document.parse(gson.toJson(L)));
        System.out.println("Student inserted.");
    }
    public void insertPerson(Clinic C) {
        Clinic.insertOne(Document.parse(gson.toJson(C)));
        System.out.println("Student inserted.");
    }
    public void insertPerson(Supplier S) {
        Supplier.insertOne(Document.parse(gson.toJson(S)));
        System.out.println("Student inserted.");
    }
    public void insertPerson(Bill B) {
        Bill.insertOne(Document.parse(gson.toJson(B)));
        System.out.println("Student inserted.");
    }
    public void insertPerson(LaboratoryTest LT) {
        LaboratoryTest.insertOne(Document.parse(gson.toJson(LT)));
        System.out.println("Student inserted.");
    }
    public void insertPerson(Operation O) {
        Operation.insertOne(Document.parse(gson.toJson(O)));
        System.out.println("Student inserted.");
    }

    public void deleteStudent(String email) {
        collection.deleteOne(Filters.eq("email", email));
    }

    public Person getStudentByMail(String email) {
        Document doc = collection.find(Filters.eq("email", email)).first();
        Person result = gson.fromJson(doc.toJson(), Person.class);
        return result;
    }

    public ArrayList<Person> getStudentsByYear(int year) {
        ArrayList<Person> result = new ArrayList();
        ArrayList<Document> docs = collection.find(Filters.eq("year", year)).into(new ArrayList<Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), Person.class));
        }
        return result;
    }

    public ArrayList<Person> getStudentsByYearLT(int year) {
        ArrayList<Person> result = new ArrayList();
        ArrayList<Document> docs = collection.find(Filters.lt("year", year)).into(new ArrayList<Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), Person.class));
        }
        return result;
    }

    public ArrayList<Person> getStudentsByCourse(String courseID) {
        ArrayList<Person> result = new ArrayList();
        ArrayList<Document> docs = collection.find(Filters.eq("courses.courseID", courseID)).into(new ArrayList<Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), Person.class));
        }
        return result;
    }

    public ArrayList<Person> getAllStudents() {
        ArrayList<Person> result = new ArrayList();
        ArrayList<Document> docs = collection.find().into(new ArrayList<Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), Person.class));
        }
        return result;
    }

    public void updateStudent(Person s) {
        Document doc = Document.parse(gson.toJson(s));
        collection.replaceOne(Filters.eq("email", s.getEmail()), doc);
    }

    public void close() {
        mongo.close();
    }
    
}
