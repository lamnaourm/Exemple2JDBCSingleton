package com.connection.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {
	
	private static Connection conn = null; 
	
	private ConnectionManager() {
		
	}
	
	public static Connection getInstance() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		if(conn==null) {
			Properties p = new Properties();
			p.load(new FileInputStream("src/com/connection/utils/db.properties"));
			
			Class.forName(p.getProperty("driver"));
			
			conn = DriverManager.getConnection(p.getProperty("url"),p.getProperty("user"),p.getProperty("pwd"));
		}
		
		return conn; 
	}

}
