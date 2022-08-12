package com.example.SpringProduct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
	
	private ProductRepository productRepository;

	@Autowired
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public Long create(Product product) {
		Product savedProduct = productRepository.save(product);
		return savedProduct.getId();
	}

	@Override
	public List<Product> selectAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

}
