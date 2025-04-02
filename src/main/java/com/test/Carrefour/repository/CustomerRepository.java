package com.test.Carrefour.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.Carrefour.model.RefundRequest;

public interface CustomerRepository extends JpaRepository<RefundRequest, Long>{

}
