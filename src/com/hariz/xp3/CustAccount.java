/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hariz.xp3;

//import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author hariz.r
 */

//CustAccount
//Used to set & get the acc info of customer
public class CustAccount {
    
    ArrayList cust = new ArrayList(); //create array list
    
    Scanner s = new Scanner (System.in);
    
    String fname, lname;
    Long aNo = 0L;
    double amt = 0.00, aBal = 0.00;
    
    public void registerCust() {
    
        System.out.println("==============================================================================");
        System.out.println("==================================[REGISTER]==================================");
        System.out.println("==============================================================================");
        //while (true)  
        System.out.print("Please enter your first name: ");
        fname = s.next();
        System.out.print("Please enter your last name: ");
        lname = s.next();
        System.out.print("Please enter your account number: ");
        aNo = s.nextLong();
        /*System.out.print("Please enter your password: ");
        String pw = s.next();
        System.out.print("Please enter your backup pin: ");
        int pin = s.nextInt();*/
        System.out.print("Please enter your account balance: RM");
        aBal = s.nextFloat();
        
        Customer c = new Customer(fname, lname, aNo, aBal);
        cust.add(c); //add to ArrayList
        
        System.out.println("Record successfully added");
        
    }// end of method
    
    public void loginCust() throws InterruptedException {
    
        System.out.println("===============================================================================");
        System.out.println("====================================[LOGIN]====================================");
        System.out.println("===============================================================================");
        System.out.print("Please enter your account number: ");
        aNo = s.nextLong();
        Iterator i = cust.iterator();
        String choice = "Y";
        while ("Y".equalsIgnoreCase(choice)) {
            
            while (i.hasNext()) {
            
                Customer c = (Customer)i.next();
                if (aNo == c.accNo) {
                System.out.println("================================================================================");
                System.out.println("================================================================================");
                System.out.println("Account Number: " + c.accNo);
                System.out.println("First Name: " + c.custFName);
                System.out.println("Last Name: " + c.custLName);
                System.out.println("Account Balance: RM" + c.accBal);
                System.out.println("================================================================================");
                System.out.println("================================================================================");
        
                }
            }
        
        
            System.out.println("[OPTIONS]");
            System.out.println("================================================================================");
            System.out.println("[1] TRANSFER TO OTHER ACCOUNT");
            System.out.println("[2] DEPOSIT TO ACCOUNT");
            System.out.println("[3] WITHDRAW FROM ACCOUNT");
            System.out.println("[4] EXIT TO MENU");
            System.out.print("Please select: ");
        
            int num = s.nextInt();
            
            switch(num) {
            
                case 1:
                    transferFund();
                break;
            
                case 2:
                    depositFund();
                break;
            
                case 3:
                    withdrawFund();
                break;
                
                case 4:
                    BankRunner.mainMenu();
                break;
                
            
                default:
                    System.out.println("Please enter a valid input");
            
            }
        
            System.out.println("Do you want to continue to main menu? (Y/N)");
            choice = s.next();
            
            /*if (!"Y".equalsIgnoreCase(choice)) {
            
                break;
                
            }*/
        
        }

        
        
    }
    
    /*public void updateCust() {
    
        System.out.println("================================================================================");
        System.out.println("====================================[UPDATE]====================================");
        System.out.println("================================================================================");
        
    
    }*/
    
    public void transferFund() {
    
        System.out.print("Enter the account number of the receiver: ");
        //function to detect whether the account number is valid or not ???
        //function to detect the account number within the ArrayList
         while (amt < aBal) {
            System.out.print("Please enter the desired amount to withdraw: ");
            amt = s.nextFloat();
            if (amt > aBal) {
                System.out.print("You have insufficient funds...");
            }
        }
        aBal -= amt;
        //System.out.print("You have transfer RM" + amt + " to the account" + c.aNo + ". Your current balance is: " + aBal);
        
    }
    
    public void withdrawFund() {
   
        while (amt < aBal) {
            System.out.print("Please enter the desired amount to withdraw: ");
            amt = s.nextFloat();
            if (amt > aBal) {
                System.out.print("You have insufficient funds...");
            }
        }
        aBal -= amt;
        System.out.print("You have withdraw RM" + amt + " from your account. Your current balance is: " + aBal);
    
    }
    
    public void depositFund() {
    
        System.out.print("Please enter the desired amount to deposit: ");
        amt = s.nextFloat();
        aBal += amt;
        System.out.print("You have deposited RM" + amt + " from your account. Your current balance is: " + aBal);
    
    }
    
    /*public void dWriteFile() {
        try {
            
            FileOutputStream fos = new FileOutputStream ("Lists");
            ObjectOutputStream oos = new ObjectOutputStream (fos);
            oos.writeObject(cust);
            oos.close();
            
        } catch (Exception ex) {
        
            ex.printStackTrace();
        
        }
        
    }*/
      
}
