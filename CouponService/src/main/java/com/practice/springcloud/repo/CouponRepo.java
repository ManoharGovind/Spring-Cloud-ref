package com.practice.springcloud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.springcloud.model.Couponmodel;

public interface CouponRepo extends JpaRepository<Couponmodel,Long> {

	Couponmodel findByCode(String code);

}
