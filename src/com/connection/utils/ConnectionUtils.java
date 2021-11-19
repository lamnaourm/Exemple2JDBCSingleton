package com.connection.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionUtils {

	public static ResultSet executeQuery(String requete) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Connection c = ConnectionManager.getInstance();
		Statement st = c.createStatement();
		return st.executeQuery(requete);
	}
	
	public static int executeUpdate(String requete) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Connection c = ConnectionManager.getInstance();
		Statement st = c.createStatement();
		return st.executeUpdate(requete);
	}
}
