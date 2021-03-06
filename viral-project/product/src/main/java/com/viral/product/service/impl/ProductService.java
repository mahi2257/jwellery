package com.viral.product.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.viral.product.dao.ProductRepo;
import com.viral.product.model.GenericSearchFilter;
import com.viral.product.model.Product;
import com.viral.product.service.IProductService;

@Service
public class ProductService implements IProductService{
	
	@Autowired
	private ProductRepo productRepo;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Product findByProdId(Long prodId) {
		return productRepo.findById(prodId).get();
	}

	@Override
	public List<Product> findProducts() {
		return null;
	}

	@Override
	public List<Product> findProductByFilter(Product product) {
		return null;
	}

	@Override
	public List<Map<String, Object>> findProductsByGenericSearch(GenericSearchFilter search) {
		StringBuilder queryBuilder = new StringBuilder("select * from product p, category c where p.CAT_ID_FK=c.CAT_ID");
		if(!ObjectUtils.isEmpty(search)) {
			Float priceFrom = search.getPriceFrom();
			Float priceTo = search.getPriceTo();
			String regional = search.getRegional();
			String service = search.getService();
			if(priceFrom != null && priceTo != null) {
				queryBuilder.append(" and p.SELL_PRICE between "+priceFrom+" and "+priceTo);
			}
			if(!StringUtils.isEmpty(regional)) {
				queryBuilder.append(" and p.REGIONAL='"+regional+"'");
			}
			if(!StringUtils.isEmpty(service)) {
				queryBuilder.append(" and p.SERVICE='"+service+"'");
			}
		
		}
		System.out.println("Query :: "+queryBuilder);
		
		List<Map<String, Object>> queryForList = jdbcTemplate.queryForList(queryBuilder.toString());
		
		System.out.println("queryForList :: "+Arrays.asList(queryForList));
		
		return queryForList;
	}

	@Override
	public List<Product> findByProdCategory(String category) {
		System.out.println("Category : "+category);
		return productRepo.findProductsByCategory(category);
	}

}
