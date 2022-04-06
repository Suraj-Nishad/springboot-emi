/**
 * 
 */
package com.finance.springapp.dao;

import java.util.List;

import com.finance.springapp.entities.Products;

/**
 * @author lntinfotech
 *
 */
public interface ProductDao {

	public List<Products> getAllProducts();
	
	public Products findProductById(int id);
}
