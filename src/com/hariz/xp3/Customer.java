/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hariz.xp3;

/**
 *
 * @author Asus
 */
public class Customer {
    
    private String custFName, custLName;
    /*private String custCName, pw, pwHint;*/
    private long accNo;
    private double accBal;
    
    Customer(String custFName, String custLName, long accNo, double accBal) {
        
        this.custFName = custFName;
        this.custLName = custLName;
        this.accNo = accNo;
        this.accBal = accBal;
    
    }

}// end of class
