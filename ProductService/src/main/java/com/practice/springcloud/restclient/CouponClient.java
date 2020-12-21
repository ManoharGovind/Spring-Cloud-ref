package com.practice.springcloud.restclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.practice.springcloud.model.Couponmodel;

@FeignClient("COUPON-SERVICE")
public interface CouponClient {

	@GetMapping("couponapi/getcoupon/{code}")
	public Couponmodel getcoupon(@PathVariable("code") String code);
}
