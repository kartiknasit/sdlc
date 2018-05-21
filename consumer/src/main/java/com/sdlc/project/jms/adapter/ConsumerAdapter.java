package com.sdlc.project.jms.adapter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bson.Document;
import org.springframework.stereotype.Component;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Component
public class ConsumerAdapter {

	private static Logger logger = LogManager.getLogger(ConsumerAdapter.class.getName());
	
	public void sendToMongo(String json) {
		logger.info("Sending to MongoDB");
		MongoClient client = new MongoClient();
		MongoDatabase db = client.getDatabase("vendor");
		MongoCollection<Document> collection = db.getCollection("contact");
		logger.info("Converting JSON to DBObject");
		Document document = Document.parse(json);
		collection.insertOne(document);
		logger.info("Sent to MongoDB");
		client.close();
	}
}
