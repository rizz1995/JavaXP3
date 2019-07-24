/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hariz.xp3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author hariz.r
 */

//CustAccount
//Used to set & get the acc info of customer
public class CustAccount implements Serializable {
    
    
    
    ArrayList cust = new ArrayList(); //create array list    
    
    Scanner s = new Scanner (System.in);
    //CustAccount obj = new CustAccount();
    
    String fname, lname;
    int aNo = 0;
    double amt = 0.00, aBal;
    
    public void setArray() { //List of pre-made accounts
    
        Customer c1 = new Customer("Bella", "Donna", 123, 1200.50);
        Customer c2 = new Customer("Aliah", "Nabilla", 124, 5543.25);
        Customer c3 = new Customer("Edward", "Dass", 125, 12678.50);
        Customer c4 = new Customer("Hazriq", "Daniel", 126, 201.50);
        
        cust.add(c1);
        cust.add(c2);
        cust.add(c3);
        cust.add(c4);
    
    }
    
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
        aNo = s.nextInt();
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
    
    public void loginCust() throws InterruptedException, FileNotFoundException {
    
        
        setArray();
        System.out.println("===============================================================================");
        System.out.println("====================================[LOGIN]====================================");
        System.out.println("===============================================================================");
        System.out.print("Please enter your account number: ");
        aNo = s.nextInt();
        custPage();
        
        //String choice = "Y";
        //while ("Y".equalsIgnoreCase(choice)) {
    }
    
    public void custPage() throws InterruptedException, FileNotFoundException {
        
        Iterator i = cust.iterator();
        while (i.hasNext()) {
            
            Customer c = (Customer)i.next();
                
                
                if (aNo == c.accNo) {
                    
                    System.out.println("================================================================================");
                    System.out.println("================================================================================");
                    System.out.println("Account Number: " + c.accNo);
                    System.out.println("First Name: " + c.custFName);
                    System.out.println("Last Name: " + c.custLName);
                    System.out.println("Account Balance: RM" + String.format ("%.2f" , c.accBal));
                    System.out.println("================================================================================");
                    System.out.println("================================================================================");
                    
                    System.out.println("[OPTIONS]");
                    System.out.println("================================================================================");
                    //System.out.println("[1] TRANSFER TO OTHER ACCOUNT");
                    System.out.println("[2] DEPOSIT TO ACCOUNT");
                    System.out.println("[3] WITHDRAW FROM ACCOUNT");
                    System.out.println("[4] EXIT TO MENU");
                    System.out.print("Please select: ");
        
                    int num = s.nextInt();
            
                    switch(num) {
            
                    //case 1:
                    //transferFund();
                    //break;
            
                    case 2:
                        depositFund();
                    break;
            
                    case 3:
                        withdrawFund();
                    break;
                
                    case 4:
                        //BankRunner.mainMenu();
                        
                    break;
                
            
                    default:
                        System.out.println("Please enter a valid input");
                    break;
            
                    }
        
                }
            }
        
        
                
            
        
            //System.out.println(" Press Y to go back to option and any key to main menu: ");
            //choice = s.next();
            
            /*if (!"Y".equalsIgnoreCase(choice)) {
            
                break;
                
            }*/
        
        }

        
        
    //}
    
    /*public void updateCust() {
    
        System.out.println("================================================================================");
        System.out.println("====================================[UPDATE]====================================");
        System.out.println("================================================================================");
        
    
    }*/
    
    /*public void transferFund() {
    
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
        
    }*/
    
    public void withdrawFund() throws InterruptedException, FileNotFoundException {
   
        Customer c = new Customer(fname, lname, aNo, aBal);
        
        //aBal;
        
        System.out.print("Please enter the desired amount to withdraw: ");
        amt = s.nextFloat();
            if (amt < 0 || amt > aBal) {
                System.out.print("You have insufficient funds...");
                custPage();
            } else {
        
            aBal -= amt;
            System.out.print("You have withdraw RM" + amt + " from your account. Your current balance is: " + String.format("%.2f" , aBal));
        c.accBal = aBal;
        custPage();
            }
        
        
    
    }
    
    public void depositFund() throws InterruptedException, FileNotFoundException {
    
        Customer c = new Customer(fname, lname, aNo, aBal);
        
        System.out.print("Please enter the desired amount to deposit: ");
        amt = s.nextFloat();
        aBal += amt;
        System.out.print("You have deposited RM" + amt + " from your account. Your current balance is: " + String.format("%.2f", aBal));
        c.accBal = aBal;
        custPage();
    
    }
    
    public void dWriteFile() {
        try {
            
            //FileWriter w = new FileWriter("D:\Users")
            //FileOutputStream fos = new FileOutputStream ("Lists.xml");
            //ObjectOutputStream oos = new ObjectOutputStream (fos);
            //oos.writeObject(cust);
            //oos.close();
            
        } catch (Exception ex) {
        
            ex.printStackTrace();
        
        }
        
    }
    
    public void dReadFile() throws FileNotFoundException {
    
        try (Scanner s1 = new Scanner (new FileReader("Lists.xml"))) {
            while (s1.hasNext()) {
                cust.add(s1.next());
            }
            s1.close();
        }
        
        System.out.println(cust);
        
    }
      
}
