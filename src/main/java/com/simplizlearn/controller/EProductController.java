package com.simplizlearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.simplizlearn.model.EProduct;
import com.simplizlearn.service.EProductService;

@Controller
public class EProductController {

	@Autowired
	EProductService eProductService;
	
	@GetMapping("/listProduct")
	public String listProducts(Model model) {
		List<EProduct> products = eProductService.getProducts();
		model.addAttribute("products", products);
		return "product-list";
	}
}
