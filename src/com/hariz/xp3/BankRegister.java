/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hariz.xp3;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author hariz.r
 */
public class BankRegister extends CustAccount {
    
    ArrayList cust = new ArrayList();
    Scanner n = new Scanner(System.in);
    //ArrayList<String> 
    
    public void addCustInfo () {
        
        System.out.println("Please enter your account number: ");
        getAcc();
        System.out.println("Please enter your name: ");
        getCName();
        System.out.println("Enter the balance of the account: ");
        getBal();
        
        CustAccount c = new CustAccount ();
        cust.add(c);
        
        //System.out.println("Please enter your password: ");
    
    }
    
}
