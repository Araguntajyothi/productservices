package com.jyothi.product.bo;

import com.jyothi.product.dao.ProductDAO;
import com.jyothi.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	private ProductDAO dao;

	public void create(Product product) {

		dao.create(product);
	}

	public Product findProduct(int id) {
		return dao.read(id);
	}

	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

}
