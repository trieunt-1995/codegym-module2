package com.trieunt.ungdungquanlykhachhang.repository;

import com.trieunt.ungdungquanlykhachhang.models.Customer;

import java.util.List;

public interface CustomerRepository extends Repository<Customer> {
    List<Customer> getAll();
}
