package com.practice.springcloud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.practice.springcloud.model.Couponmodel;
import com.practice.springcloud.repo.CouponRepo;

@RestController
@RequestMapping("/couponapi")
public class CouponController {
	
	@Autowired
	CouponRepo repoo;
	
	@GetMapping("/test")
	public String testing() {
		return "Heollo_world";
	}
	
	@PostMapping("/coupons")
	public Couponmodel create(@RequestBody Couponmodel coupon) {
		repoo.save(coupon);
		return coupon;
	}
	
	@GetMapping("/getcoupon/{code}")
	public Couponmodel getcoupon(@PathVariable("code") String code) {
		return repoo.findByCode(code);
	}
}