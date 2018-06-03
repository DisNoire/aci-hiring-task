package com.aciworldwide.controllers.api;

import com.aciworldwide.domain.models.Biller;
import com.aciworldwide.domain.models.Payment;
import com.aciworldwide.services.BillersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api")
public class BillersRestController {
    private final BillersService billersService;

    @Autowired
    public BillersRestController(BillersService billersService) {
        this.billersService = billersService;
    }

    @ResponseBody
    @RequestMapping(value = "/billers", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    public List<Biller> getAllBillers() {
        return billersService.findAll();
    }

    @ResponseBody
    @RequestMapping(value = "/billers/{id}", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    public Biller getBillerById(@PathVariable("id") Integer id) {
        return billersService.findBillerById(id);
    }

    @RequestMapping(value = "/biller/new", method = RequestMethod.POST, consumes = APPLICATION_JSON_VALUE)
    public String addNewPayment(@RequestBody Biller biller) {
        //TODO (validate)
        billersService.save(biller);
        return "redirect:/billers";
    }
}
