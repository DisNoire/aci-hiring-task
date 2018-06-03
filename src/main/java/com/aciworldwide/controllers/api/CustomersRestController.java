package com.aciworldwide.controllers.api;

import com.aciworldwide.domain.models.Customer;
import com.aciworldwide.services.CustomersService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api")
public class CustomersRestController {
    private final CustomersService customersService;

    public CustomersRestController(CustomersService customersService) {
        this.customersService = customersService;
    }

    @ResponseBody
    @RequestMapping(value = "/customers", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    public List<Customer> getAllCustomers() {
        return customersService.findAll();
    }

    @ResponseBody
    @RequestMapping(value = "/customers/{id}", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    public Customer getCustomerById(@PathVariable("id") Integer id) {
        return customersService.findCustomerById(id);
    }

    @RequestMapping(value = "/customer/new", method = RequestMethod.POST, consumes = APPLICATION_JSON_VALUE)
    public String addNewCustomer(@RequestBody Customer customer) {
        //TODO (validate)
        customersService.save(customer);
        return "redirect:/customers";
    }
}
