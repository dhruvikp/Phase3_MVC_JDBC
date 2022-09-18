package com.simplizlearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplizlearn.model.EProduct;
import com.simplizlearn.repository.EProductDAO;

@Service
public class EProductService {

	@Autowired
	EProductDAO eProductDAO;
	
	public List<EProduct> getProducts() {
		return eProductDAO.getProducts();
	}
}
