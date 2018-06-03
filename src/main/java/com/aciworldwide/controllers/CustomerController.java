package com.aciworldwide.controllers;

import com.aciworldwide.services.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {
    private final CustomersService customersService;

    @Autowired
    public CustomerController(CustomersService customersService) {
        this.customersService = customersService;
    }

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public String getCustomersPage() {
        return "customers";
    }

    @RequestMapping(value = "/customer/new", method = RequestMethod.GET)
    public String getNewCustomerPage() {
        return "new-customer";
    }

}
