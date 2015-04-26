package com.tripadviator.dao.mongo;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;

public class BaseDAO {
	/**
	 */
	private DB db;
	/**
	 */
	private DBCollection dbCollection;
	/**
	 */
	private GridFS fs;
	
	public BaseDAO()
	{
		System.out.println(db);
	}

	/**
	 * 
	 * @param jo
	 * @return
	 */
	public int insert(DBObject jo) {
		WriteResult wr = dbCollection.save(jo);
		return wr.getN();
	}

	/**
	 * 
	 * @param jo
	 */
	public void delete(DBObject jo) {
		dbCollection.remove(jo);
	}

	/**
	 * 
	 * @param query
	 * @param jo
	 * @return
	 */
	public int update(DBObject query, DBObject jo) {
		WriteResult wr = dbCollection.update(query, jo);
		return wr.getN();
	}

	/**
	 * 
	 * @param query
	 * @return
	 */
	public List<DBObject> query(DBObject query) {
		DBCursor dbc = dbCollection.find(query);
		List<DBObject> joList = new ArrayList<DBObject>();
		while (dbc.hasNext()) {
			DBObject jo = dbc.next();
			joList.add(jo);
		}
		return joList;
	}

	/**
	 * @param file
	 */
	public void saveFile(File file) {
		try {
			GridFSInputFile gif = fs.createFile(file);
			gif.save();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param in
	 * @param id
	 * @param filename
	 * @param contentType
	 */
	public void saveFile(InputStream in, Object id, String filename,
			Object contentType) {
		DBObject query = (DBObject) new BasicDBObject("_id", id);
		GridFSDBFile gff = fs.findOne(query);
		if (gff == null) {
			GridFSInputFile gif = fs.createFile(in);
			gif.setFilename(filename);
			gif.put("_id", id);
			gif.put("contentType", contentType);
			gif.save();
		}
	}

	/**
	 * @param id
	 * @return
	 */
	public GridFSDBFile queryFile(Object id) {
		DBObject query = (DBObject) new BasicDBObject("_id", id);
		return fs.findOne(query);
	}

	/**
	 * @param filename
	 * @return
	 */
	public GridFSDBFile queryFile(String filename) {
		DBObject query = (DBObject) new BasicDBObject("filename", filename);
		return fs.findOne(query);
	}

	/**
	 * @param query
	 * @return
	 */
	public List<GridFSDBFile> queryFile(DBObject query) {
		return fs.find(query);
	}

	/**
	 * @param query
	 * @return
	 */
	public long getCount(DBObject query) {
		return dbCollection.getCount(query);
	}

	public GridFS getFs() {
		return fs;
	}

	public void setFs(GridFS fs) {
		this.fs = fs;
	}

	public DBCollection getDbCollection() {
		return dbCollection;
	}

	public void setDbCollection(DBCollection dbCollection) {
		this.dbCollection = dbCollection;
	}
}