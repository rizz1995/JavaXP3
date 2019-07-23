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

//CustAccount
//Used to set & get the acc info of customer
public class CustAccount {
    
    ArrayList cust = new ArrayList(); //create array list
    
    Scanner s = new Scanner (System.in);
    
    public void registerCust() {
    
        System.out.println("==============================================================================");
        System.out.println("==================================[REGISTER]==================================");
        System.out.println("==============================================================================");
        //while (true)  
        System.out.print("Please enter your first name: ");
        String fname = s.next();
        System.out.print("Please enter your last name: ");
        String lname = s.next();
        System.out.print("Please enter your account number: ");
        Long aNo = s.nextLong();
        /*System.out.print("Please enter your password: ");
        String pw = s.next();
        System.out.print("Please enter your backup pin: ");
        int pin = s.nextInt();*/
        System.out.print("Please enter your account balance: ");
        double aBal = s.nextFloat();
        
        Customer c = new Customer(fname, lname, aNo, aBal);
        cust.add(c); //add to ArrayList
        
        System.out.println("Record successfully added");
        
    }// end of method
    
    public void loginCust() {
    
        System.out.println("===============================================================================");
        System.out.println("====================================[LOGIN]====================================");
        System.out.println("===============================================================================");
        System.out.print("Please enter your account number: ");
        
        
    }
    
    public void updateCust() {
    
        System.out.println("================================================================================");
        System.out.println("====================================[UPDATE]====================================");
        System.out.println("================================================================================");
        
    
    }
    
    public void transferFund() {
    
        double amt = 0.00;
        System.out.print("Enter the account number of the receiver: ");
        
    }
    
    public void withdrawFund() {
    
        double amt = 0.00;
        System.out.print("Please enter the desired amount to withdraw: ");
        amt = s.nextFloat();
        //aBal = aBal - amt;
    
    }
    
    public void depositFund() {
    
        float amt = 0.00f;
        System.out.print("Please enter the desired amount to deposit: ");
        amt = s.nextFloat();
        //aBal = aBal + amt;
    
    }
      
}
