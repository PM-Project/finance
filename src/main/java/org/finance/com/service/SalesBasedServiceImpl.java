/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.finance.com.service;

import org.finance.com.dao.SalesBasedDao;
import org.finance.com.domain.SalesBasedDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sunil
 */
@Service
public class SalesBasedServiceImpl implements SalesBasedService{

    @Autowired
    private SalesBasedDao salesBasedDao;
    
    @Override
    public boolean addPurchaseItem(SalesBasedDetails details) {
        return salesBasedDao.addPurchaseItem(details);
    }
    
}
