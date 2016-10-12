package com.ibm.dbutil;

import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;

public class APIDBUtil {
	
	public static CloudantClient client;
	static Logger logger = Logger.getLogger(APIDBUtil.class.getName());

	public static Database connectToDatabase() {
		Properties prop = new Properties();
		Database database;
		
		prop.setProperty("dbaccount", "chmurga");
		prop.setProperty("dbuser", "chmurga");
		prop.setProperty("dbpassword", "lamurga");
		prop.setProperty("database", "expert_presenter");
//		try {
//			File configFile = new File("config.properties");//("config.properties");
//			logger.info("file found..!!!!..  "+configFile.getAbsoluteFile());
//			FileReader fileReader  = new FileReader(configFile);
//			prop.load(fileReader);
//		} catch (Exception ex) {
//			logger.severe("APIDBUtil:An error during reading config file  "+ex.getMessage());
//			ex.printStackTrace();
//		}
		client = new CloudantClient(prop.getProperty("dbaccount"),
				prop.getProperty("dbuser"), prop.getProperty("dbpassword"));

		List<String> dbs = client.getAllDbs();

		if (dbs.contains(prop.getProperty("database"))) {
			logger.info("Database exists. Will use existing database");
			database = client.database((prop.getProperty("database")), false);
		} else {
			client.createDB((prop.getProperty("database")));
			logger.info("Database does not exists. created new database");
			database = client.database(prop.getProperty("database"), false);
		}
		
		return database;
	} 

}

