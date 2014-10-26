package com.tripadviator;

import java.net.UnknownHostException;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

/**
 * Hello world!
 * 
 */
public class App
{
	public static void main(String[] args) throws UnknownHostException
	{
		MongoClient mongo = new MongoClient("localhost", 27017);

		List<String> dbs = mongo.getDatabaseNames();

		for (String db : dbs)
		{
			System.out.println(db);
			System.out.println("========================");
		}

		DB db = mongo.getDB("test");
		Set<String> tables = db.getCollectionNames();

		for (String coll : tables)
		{
			System.out.println(coll);
			System.out.println("========================");
		}

		DBCollection table = db.getCollection("numbers");

		BasicDBObject document = new BasicDBObject();
		document.put("name", "mkyong");
		document.put("age", 30);
		document.put("createdDate", new Date());
		table.insert(document);

		BasicDBObject query = new BasicDBObject();
		query.put("name", "mkyong");

		BasicDBObject newDocument = new BasicDBObject();
		newDocument.put("name", "mkyong-updated");

		BasicDBObject updateObj = new BasicDBObject();
		updateObj.put("$set", newDocument);

		table.update(query, updateObj);

		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("name", "mkyong");

		DBCursor cursor = table.find(searchQuery);

		while (cursor.hasNext())
		{
			System.out.println(cursor.next());
		}

		BasicDBObject searchQuery2 = new BasicDBObject();
		searchQuery.put("name", "mkyong");

		table.remove(searchQuery2);
	}
}
