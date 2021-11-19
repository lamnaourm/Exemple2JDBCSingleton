package com.products.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.produit.model.Produit;

public interface IDAO<T> {

	List<T> getAll() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;
	
	T getOne(int id) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;
	
	int add(T p) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;
	
	int update(T p);
	
	int remove(int id);
	
	
}
