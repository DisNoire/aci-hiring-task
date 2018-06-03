package com.aciworldwide.controllers.api;

import com.aciworldwide.domain.models.Payment;
import com.aciworldwide.services.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api")
public class PaymentsRestController {
    private final PaymentsService paymentsService;

    @Autowired
    public PaymentsRestController(PaymentsService paymentsService) {
        this.paymentsService = paymentsService;
    }

    @ResponseBody
    @RequestMapping(value = "/payments", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    public List<Payment> getAllPayments() {
        return paymentsService.findAll();
    }

    @ResponseBody
    @RequestMapping(value = "/payments/{id}", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    public Payment getPayment(@PathVariable("id") Long id) {
        return paymentsService.findPaymentById(id);
    }

    @RequestMapping(value = "/payment/new", method = RequestMethod.POST, consumes = APPLICATION_JSON_VALUE)
    public String addNewPayment(@RequestBody Payment payment) {
        //TODO (validate)
        paymentsService.save(payment);
        return "redirect:/payments";
    }
}
