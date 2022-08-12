package com.example.SpringProduct;

import java.util.List;

public interface ProductService {
	Long create(Product product);
	List<Product> selectAll();
}
