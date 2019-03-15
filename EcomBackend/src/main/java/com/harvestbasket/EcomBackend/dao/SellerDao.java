package com.harvestbasket.EcomBackend.dao;

import java.util.List;

import com.harvetbasket.EcomBackend.model.Seller;

public interface SellerDao {
	boolean insertsid(Seller seller);
	boolean updatesname(Seller seller);
	boolean deletescity(Seller seller);
	List<Seller> selectAllSellers();
	Seller selectOneSellers();


}
