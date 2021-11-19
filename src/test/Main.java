package test; 

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connection.utils.ConnectionManager;
import com.products.dao.DAOProduit;
import com.products.dao.IDAO;
import com.produit.model.Produit;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub

		IDAO dao = new DAOProduit();
		
		List<Produit> p = dao.getAll();
		
		for(Produit pp : p)
			System.out.println(pp);
		
		System.out.println(dao.getOne(2));
		
		Produit p1 = new Produit(1,"TESTDAT","FAM",11111,4444);
		dao.add(p1);
	}

}
