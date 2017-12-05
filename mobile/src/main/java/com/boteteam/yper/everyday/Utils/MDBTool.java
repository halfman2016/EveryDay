package com.boteteam.yper.everyday.Utils;

import com.boteteam.yper.everyday.Module.EverDayModel;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;

import java.util.Arrays;

/**
 * Created by Feng Jiang on 2017/10/22.
 */

public class MDBTool {
    private MongoCredential credential;
    private MongoClient mongoClient;
    private MongoDatabase mongoDatabase;
    private MongoCollection<Document> mongoCollection;
    private String dBase;
    public MDBTool() {
        dBase="halfman";
        credential=MongoCredential.createScramSha1Credential("halfman", "halfman", "halfman21".toCharArray());
        mongoClient=new MongoClient(new ServerAddress("boteteam.com",27017), Arrays.asList(credential));
        mongoDatabase=mongoClient.getDatabase(dBase);
    }

   public boolean writeDay(EverDayModel dayModel){
        mongoCollection=mongoDatabase.getCollection("EverDays");
        Gson gson=new GsonBuilder().setDateFormat("MMM d, yyyy h:mm:ss a").create();
        String json=gson.toJson(dayModel);
        mongoCollection.insertOne(Document.parse(json));
        return true;
    }

}
