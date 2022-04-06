/**
 * 
 */
package com.finance.springapp.service;

import java.util.List;

import com.finance.springapp.entities.Products;

/**
 * @author lntinfotech
 *
 */
public interface ProductService {

	public List<Products> getAllProducts();
	
	public Products findProductById(int id);

	
}
