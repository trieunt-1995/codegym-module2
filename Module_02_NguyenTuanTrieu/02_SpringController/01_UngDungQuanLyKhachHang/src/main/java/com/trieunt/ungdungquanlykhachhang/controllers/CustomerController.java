package com.trieunt.ungdungquanlykhachhang.controllers;

import com.trieunt.ungdungquanlykhachhang.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("listCustomer")
    public ModelAndView listCustomer() {
        return new ModelAndView("list", "customers", customerService.findAll());
    }
}
