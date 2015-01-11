/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.finance.com.controller;

import java.util.Date;
import org.finance.com.domain.SalesBasedDetails;
import org.finance.com.service.SalesBasedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sunil
 */
@RestController
@Controller
public class TransactionDetails {

    @Autowired
    private SalesBasedService service;

    /**
     *
     * @param particular
     * @param deductFrom
     * @param depositeTo
     * @param amount
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public @ResponseBody String authCard(@RequestParam("particular") String particular, 
            @RequestParam("amount") double amount,
            @RequestParam("deductFrom") String deductFrom,
            @RequestParam("depositeTo") String depositeTo) 
    {

            SalesBasedDetails basedDetails = new SalesBasedDetails();
            basedDetails.setParticular(particular);
            basedDetails.setAmount(amount);
            basedDetails.setDeductFrom(deductFrom);
            basedDetails.setDepositeTo(depositeTo);
            basedDetails.setTransactionDate(new Date());
            service.addPurchaseItem(basedDetails);
            return "success";
    }


}
