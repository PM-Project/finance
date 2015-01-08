/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.finance.com.dao;

import org.finance.com.domain.SalesBasedDetails;

/**
 *
 * @author sunil
 */
public interface SalesBasedDao {
    boolean addPurchaseItem(SalesBasedDetails details);
}
