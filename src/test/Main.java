package test; 

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.connection.utils.ConnectionManager;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub

		Connection c = ConnectionManager.getInstance();
		
		Statement st = c.createStatement();
		
		ResultSet r = st.executeQuery("SELECT * FROM PRODUIT");
		
		while(r.next()) {
			System.out.println(r.getInt(1) + " - " + r.getString(2));
		}
		
	}

}
