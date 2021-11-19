package com.products.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connection.utils.ConnectionManager;
import com.connection.utils.ConnectionUtils;
import com.produit.model.Produit;

public class DAOProduit implements IDAO<Produit>{

	@Override
	public List<Produit> getAll() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		ArrayList<Produit> prds = new ArrayList<>();
		
		ResultSet r = ConnectionUtils.executeQuery("SELECT * FROM PRODUIT");
		
		while(r.next()) {
			Produit p = new Produit();
			
			p.setId(r.getInt(1));
			p.setNom(r.getString(2));
			p.setFamille(r.getString(3));
			p.setPrix_achat(r.getDouble(4));
			p.setPrix_vente(r.getDouble(5));
			
			prds.add(p);
		}
		
		return prds;
	}

	@Override
	public Produit getOne(int id) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		
		ResultSet r = ConnectionUtils.executeQuery("SELECT * FROM PRODUIT WHERE ID = " + id);
		
		if(r.next()) {
			Produit p = new Produit();
			
			p.setId(r.getInt(1));
			p.setNom(r.getString(2));
			p.setFamille(r.getString(3));
			p.setPrix_achat(r.getDouble(4));
			p.setPrix_vente(r.getDouble(5));
			
			return p;
		}
		
		return null;
	}

	@Override
	public int add(Produit p) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		String requete = "INSERT INTO PRODUIT VALUES (null,'"+p.getNom()+"','"+p.getFamille()+"',"+p.getPrix_achat()+","+p.getPrix_vente()+")";
		System.out.println(requete);
		return ConnectionUtils.executeUpdate(requete);
	}

	@Override
	public int update(Produit p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int remove(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
