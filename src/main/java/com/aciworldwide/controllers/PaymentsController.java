package com.aciworldwide.controllers;

import com.aciworldwide.services.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PaymentsController {
    private final PaymentsService paymentsService;

    @Autowired
    public PaymentsController(PaymentsService paymentsService) {
        this.paymentsService = paymentsService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndexPage(Model model) {
        model.addAttribute("payments", paymentsService.findAll());
        return "payments";
    }

    @RequestMapping(value = "/payment/new", method = RequestMethod.GET)
    public String getNewPaymentPage() {
        return "new-payment";
    }

}
