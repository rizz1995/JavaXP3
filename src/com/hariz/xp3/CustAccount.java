/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hariz.xp3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author hariz.r
 */

public class CustAccount {
   
    ArrayList cust = new ArrayList(); //create ArrayList   
    Scanner s = new Scanner (System.in);
    String fname, lname;
    int aNo = 0;
    double amt = 0.00, aBal;
    
    public void setArray() { //List of pre-made accounts
    
        Customer c1 = new Customer("Justina", "John", 123, 1200.50);
        Customer c2 = new Customer("Aliah", "Nabilla", 124, 5543.25);
        Customer c3 = new Customer("Edwin", "Dass", 125, 12678.50);
        Customer c4 = new Customer("Hafiz", "Daniel", 126, 201.50);
        
        //adds the newly created objects into ArrayList
        cust.add(c1);
        cust.add(c2);
        cust.add(c3);
        cust.add(c4);
    
    }
    
    public void registerCust() throws InterruptedException {
    
        System.out.println("==============================================================================");
        System.out.println("==================================[REGISTER]==================================");
        System.out.println("==============================================================================");
        //while (true)  
        System.out.print("Please enter your first name: ");
        fname = s.next();
        System.out.print("Please enter your last name: ");
        lname = s.next();
        System.out.print("Please enter your account number: ");
        aNo = s.nextInt();
        /*System.out.print("Please enter your password: ");
        String pw = s.next();
        System.out.print("Please enter your backup pin: ");
        int pin = s.nextInt();*/
        System.out.print("Please enter your account balance: RM");
        aBal = s.nextFloat();
        
        Customer c = new Customer(fname, lname, aNo, aBal); //create object & insert the input data into it
        cust.add(c); //add object to ArrayList
        
        System.out.println("Record successfully added");
        loginCust();
        
    }// end of method
    
    public void loginCust() throws InterruptedException {

        setArray();
        System.out.println("===============================================================================");
        System.out.println("====================================[LOGIN]====================================");
        System.out.println("===============================================================================");
        System.out.print("Please enter your account number: ");
        aNo = s.nextInt();
        custPage();
        
    }
    
    public void custPage() throws InterruptedException {
        
        Iterator i = cust.iterator();
        while (i.hasNext()) {
            
            Customer c = (Customer)i.next();
                
                if (aNo == c.accNo) { //check to determine the account within ArrayList is the same as input & run it if it is the same
                                   
                    System.out.println("================================================================================");
                    System.out.println("Account Number: " + c.accNo);
                    System.out.println("First Name: " + c.custFName);
                    System.out.println("Last Name: " + c.custLName);
                    System.out.println("Account Balance: RM" + String.format ("%.2f" , c.accBal));
                    System.out.println("================================================================================");
                    System.out.println("[OPTIONS]");
                    System.out.println("================================================================================");
                    System.out.println("[1] DEPOSIT TO ACCOUNT");
                    System.out.println("[2] WITHDRAW FROM ACCOUNT");
                    System.out.println("[3] TRANSFER TO OTHER ACCOUNT");
                    System.out.println("[4] LOGOUT & LOGIN TO ANOTHER ACCOUNT");
                    System.out.println("[5] LOGOUT & REGISTER");
                    System.out.println("[6] LOGOUT & EXIT");
                    System.out.print("Please select: ");
        
                    int num = s.nextInt();
            
                    switch(num) {
            
                    case 1:
                        depositFund();
                    break;
            
                    case 2:
                        withdrawFund();
                    break;
                    
                    case 3:
                        transferFund();
                    break;
                    
                    case 4:
                        loginCust();
                    break;
                    
                    case 5:
                        registerCust();
                    break;
                    
                    case 6:
                        System.out.println("Thanks for using our service!");
                        Thread.sleep(5000);
                        System.exit(0);
                    break;
            
                    default:
                        System.out.println("Please enter a valid input");
                        custPage();
                    break;
            
                    }
                }
            }
    }
    
    public void transferFund() throws InterruptedException {
   
        Iterator i = cust.iterator();
        while (i.hasNext()) {
            
            Customer c = (Customer)i.next();
                
            if (aNo == c.accNo) {
            
                System.out.println("Please enter the receiver account number: ");
                int aNoTr = s.nextInt(); //there is some error here when the entered account number doesn't exist
                Iterator it = cust.iterator();
                while (i.hasNext()) {
                    
                    Customer ct = (Customer)it.next();
                    if (aNoTr == ct.accNo) {
                    
                        System.out.print("Please enter the desired amount to transfer: ");
                        amt = s.nextFloat();
                    
                        if (amt < 0 || amt > c.accBal) {
                        
                            System.out.println("You have insuficient funds");
                            custPage();
                        } else {
                            
                            ct.accBal += amt;
                            c.accBal -= amt;
                            String pFName = ct.custFName;
                            String pLName = ct.custLName;
                            int pANo = ct.accNo;
                            double cBal = ct.accBal;
                            String oFName = c.custFName;
                            String oLName = c.custLName;
                            int oONo = c.accNo;
                            double oBal = c.accBal;
                            
                            cust.remove(ct);
                            cust.remove(c);
                            
                            Customer ctn = new Customer (pFName, pLName, pANo, cBal);
                            Customer cn = new Customer (oFName, oLName, oONo, oBal);
                            
                            cust.add(ctn);
                            cust.add(cn);
                            
                            System.out.println("You have transferred RM" + String.format("%.2f", amt) + " from your account to receiver account " + pANo +". Your current balance is: " + String.format("%.2f" , oBal));
                            custPage();
                            
                        }
                    }
                }   
            }
        }
    }
    
    public void withdrawFund() throws InterruptedException {
   
        Iterator i = cust.iterator();
        while (i.hasNext()) {
            
            Customer c = (Customer)i.next();
                
            if (aNo == c.accNo) {
            
                System.out.print("Please enter the desired amount to withdraw: ");
                amt = s.nextFloat();
        
                if (amt < 0 || amt > c.accBal) {
                    System.out.println("You have insufficient funds...");
                    custPage();
                } else {   
            
                    c.accBal -= amt;
                    String pFName = c.custFName;
                    String pLName = c.custLName;
                    int pANo = c.accNo;
                    double cBal = c.accBal;
            
                    cust.remove(c);            
                    Customer cn = new Customer (pFName, pLName, pANo, cBal);
                    cust.add(cn);
                    System.out.println("You have withdraw RM" + String.format("%.2f", amt) + " from your account. Your current balance is: " + String.format("%.2f" , cBal));
                    custPage();
            
                }
            }
        }        
    }
    
    public void depositFund() throws InterruptedException {
    
        Iterator i = cust.iterator();
        while (i.hasNext()) {
                
            Customer c = (Customer)i.next();
            
            if (aNo == c.accNo) {
                
                System.out.print("Please enter the desired amount to deposit: ");
                amt = s.nextFloat();
                c.accBal += amt;
                String pFName = c.custFName;
                String pLName = c.custLName;
                int pANo = c.accNo;
                double cBal = c.accBal;
                
                cust.remove(c);
                Customer cn = new Customer (pFName, pLName, pANo, cBal);
                cust.add(cn);
                System.out.println("You have deposited RM" + String.format("%.2f", amt) + " from your account. Your current balance is: " + String.format("%.2f", cBal));
                custPage();
                
            }  
        } 
    }
}
