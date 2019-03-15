package com.harvestbasket.EcomBackend.dao;

import java.util.List;

import com.harvetbasket.EcomBackend.model.Product;

public interface ProductDao {
	boolean insertProduct(Product products);
	boolean updateProduct(Product products);
	boolean deleteProduct(Product products);
	List<Product> selectAllProducts();
	Process selectOneProducts();

}
