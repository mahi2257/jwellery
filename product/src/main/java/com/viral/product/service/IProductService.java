package com.viral.product.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.viral.product.model.GenericSearchFilter;
import com.viral.product.model.Product;

@Repository
public interface IProductService {
	
	//product will be created from inventory module
	//public Product postProduct(Product products);	
	//public void deleteByProdId(Long prodId);
	
	public List<Map<String, Object>> findProductsByGenericSearch(GenericSearchFilter search);
	
	public List<Product> findProductByFilter(Product product);
	
	public Product findByProdId(Long prodId);
	
	public List<Product> findByProdCategory(String category);
	
	public List<Product> findProducts();
	
	
	
}
