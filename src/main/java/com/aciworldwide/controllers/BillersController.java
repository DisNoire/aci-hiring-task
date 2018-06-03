package com.aciworldwide.controllers;

import com.aciworldwide.services.BillersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BillersController {
    private final BillersService billersService;

    @Autowired
    public BillersController(BillersService billersService) {
        this.billersService = billersService;
    }

    @RequestMapping(value = "/billers", method = RequestMethod.GET)
    public String getBillersPage() {
        return "billers";
    }

    @RequestMapping(value = "/biller/new", method = RequestMethod.GET)
    public String getNewBillerPage() {
        return "new-biller";
    }
}
