package com.practice.springcloud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.springcloud.model.product;

public interface ProductRepo extends JpaRepository<product, Long> {

}
