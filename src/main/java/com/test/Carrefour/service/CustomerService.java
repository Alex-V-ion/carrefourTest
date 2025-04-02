package com.test.Carrefour.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.test.Carrefour.model.RefundRequest;
import com.test.Carrefour.repository.CustomerRepository;

@Service
public class CustomerService {
	
	private CustomerRepository repository;

    public void CustomerRepository(CustomerRepository repository) {
        this.repository = repository;
    }

    public RefundRequest saveRequest(RefundRequest refundRequest) {
        refundRequest.setRequestDate(LocalDateTime.now());
        return repository.save(refundRequest);
    }
}
