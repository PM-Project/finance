/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.finance.com.controller;

import javax.servlet.http.HttpServletResponse;
import org.finance.com.domain.SalesBasedDetails;
import org.finance.com.service.SalesBasedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
     * @param details
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String authCard(@RequestParam("cardNo") String cardNo, @RequestParam("price") Double price) {
        System.out.println("CALL FINANCE SERVICE");
        if (cardNo != null && price > 0) {
            System.out.println("Success");
            SalesBasedDetails basedDetails = new SalesBasedDetails();
            basedDetails.setCardNo(cardNo);
            basedDetails.setPrice(price);
            service.addPurchaseItem(basedDetails);
            return "success";
        } else {
            return "fail";
        }

    }

//    @RequestMapping(value = "/addfinac", method = RequestMethod.GET)
//    public String financeDetails() {
//        try {
//            System.out.println(">>>>>>>>CALL FINANCE");
//
//            RestTemplate restTemplate = new RestTemplate();
//            SalesBasedDetails basedDetails = restTemplate.getForObject("http://localhost:8080/myshop/fin", SalesBasedDetails.class);
//            System.out.println("Card Number " + basedDetails.getItem());
//            basedDetails.setItem(basedDetails.getItem());
//            basedDetails.setPrice(2.5);
//            boolean checkStatus = service.addPurchaseItem(basedDetails);
//            if (checkStatus == true) {
//                System.out.println("Saved to the database");
//            } else {
//                System.out.println("Problem while saving");
//            }
//        } catch (Exception ex) {
//
//        }
//        return null;
//    }
//    @RequestMapping(value = "/fin", method = RequestMethod.GET)
//    public @ResponseBody  SalesBasedDetails create(@RequestBody SalesBasedDetails details) {
//        System.out.println("DETAILS  here");
//        SalesBasedDetails basedDetails=new SalesBasedDetails();
//        return basedDetails;
//    }

//    @RequestMapping(value = "/fin", method = RequestMethod.GET)
//    public String testMethod() {
//        System.out.println("INside here");
//        SalesBasedDetails basedDetails=new SalesBasedDetails();
//        basedDetails.setItem("Niky");
//        basedDetails.setPrice(22.5);
//        boolean checkStatus=service.addPurchaseItem(basedDetails);
//        if(checkStatus==true){
//            System.out.println("Saved to the database");
//        }else{
//            System.out.println("Problem while saving");
//        }
//        return "test";
//    }
//    @RequestMapping(method = RequestMethod.GET)
//    public @ResponseBody
//    SalesBasedDetails get(HttpServletResponse res) {
//
//        SalesBasedDetails person = new SalesBasedDetails();
//        person.setItem("item1");
//        person.setPrice(22.0);
//
//        return person;
//    }

    //this method response to POST request http://localhost/spring-mvc-json/rest/cont/person
    // receives json data sent by client --> map it to Person object
    // return Person object as json
//    @RequestMapping(value = "person", method = RequestMethod.POST)
//    public @ResponseBody
//    SalesBasedDetails post(@RequestBody final SalesBasedDetails person) {
//        System.out.println("::::");
//        System.out.println(person.getId() + " " + person.getPrice());
//        return person;
//    }

}
