package com.test.Carrefour.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.Carrefour.model.RefundRequest;
import com.test.Carrefour.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<RefundRequest> createRefundRequest(@RequestBody RefundRequest refundRequest) {
        RefundRequest savedRequest = service.saveRequest(refundRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedRequest);
    }
}
