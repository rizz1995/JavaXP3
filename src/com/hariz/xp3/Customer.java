/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hariz.xp3;

import java.io.Serializable;


/**
 *
 * @author Asus
 */
public class Customer implements Serializable {
    
    String custFName;
    String custLName;
    /*private String custCName, pw, pwHint;*/
    int accNo;
    double accBal;
    
    Customer(String custFName, String custLName, int accNo, double accBal) {
        
        this.custFName = custFName;
        this.custLName = custLName;
        this.accNo = accNo;
        this.accBal = accBal;
        
   
    
    }

}// end of class
