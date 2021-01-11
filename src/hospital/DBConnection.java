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

/**
 *
 * @author mazen
 */
public class DBConnection {
    private MongoClient mongo;
    private MongoDatabase hospital;
    private MongoCollection<Document> collection;
    private Gson gson = new Gson();
    
MongoClientURI uri = new MongoClientURI(
    "mongodb+srv://mazen:Mazen123@cluster0.x8xwc.mongodb.net/test");

    public DBConnection(){
         mongo = new MongoClient(uri);
         hospital = mongo.getDatabase("hospital");
        collection = hospital.getCollection("Person"); // Collection name
        System.out.println("Connected successfully");
    }
    

    
}
