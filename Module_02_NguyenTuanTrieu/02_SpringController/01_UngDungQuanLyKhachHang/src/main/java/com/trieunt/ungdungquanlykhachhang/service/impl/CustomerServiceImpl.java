package com.trieunt.ungdungquanlykhachhang.service.impl;

import com.trieunt.ungdungquanlykhachhang.models.Customer;
import com.trieunt.ungdungquanlykhachhang.repository.CustomerRepository;
import com.trieunt.ungdungquanlykhachhang.repository.impl.CustomerRepositoryImpl;
import com.trieunt.ungdungquanlykhachhang.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public List<Customer> findAll() {

        return customerRepository.getAll();
    }
}
