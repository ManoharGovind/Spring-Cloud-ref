package com.practice.springcloud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.springcloud.model.product;
import com.practice.springcloud.repo.ProductRepo;

@RestController
@RequestMapping("/productapi")
public class ProductController {
	
	@Autowired
	ProductRepo repoo;
	
	@PostMapping("/createproduct")
	public product createproduct(@RequestBody product item) {
		return repoo.save(item);
	}
}

