/**
 * 
 */
package com.finance.springapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finance.springapp.dao.ProductDao;
import com.finance.springapp.entities.Products;

/**
 * @author lntinfotech
 *
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	@Override
	public List<Products> getAllProducts() {

		return productDao.getAllProducts();
	}

	@Override
	public Products findProductById(int id) {
		
		return productDao.findProductById(id);
	}

}
