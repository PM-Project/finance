/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.finance.com.dao;

import org.finance.com.domain.SalesBasedDetails;
import org.finance.com.utils.SessionUtil;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sunil
 */
@Repository
public class SalesBasedDaoImpl extends SessionUtil implements SalesBasedDao{

    @Override
    public boolean addPurchaseItem(SalesBasedDetails basedDetails) {
        System.out.println("OBJECT IS "+basedDetails);
        if(basedDetails!=null){
            getSession().save(basedDetails);
            return true;
        }else
            return false;
    }
    
}
