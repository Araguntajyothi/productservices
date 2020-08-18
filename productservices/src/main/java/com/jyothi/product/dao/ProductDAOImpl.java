package com.jyothi.product.dao;

import java.util.HashMap;
import java.util.Map;

import com.jyothi.product.dto.Product;

public class ProductDAOImpl implements ProductDAO {

	Map<Integer, Product> products = new HashMap<>();

	public void create(Product product) {
		products.put(product.getId(), product);
	}

	public Product read(int id) {
		return products.get(id);
	}

	public void update(Product product) {
		// TODO Auto-generated method stub

	}

	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
