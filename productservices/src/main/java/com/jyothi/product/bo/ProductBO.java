package com.jyothi.product.bo;

import com.jyothi.product.dto.Product;

public interface ProductBO {

	public void create(Product product);

	public Product findProduct(int id);

}
