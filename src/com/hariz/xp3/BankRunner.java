/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hariz.xp3;

import java.util.Scanner;

/**
 *
 * @author hariz.r
 */

//BankRunner
//Used to run the entire thing
public class BankRunner{
    
    public static void main(String[] args) throws InterruptedException { //main function
    
        Scanner s = new Scanner (System.in);
        
        CustAccount r = new CustAccount();
        
        String choice = "Y";
        
        while ("Y".equalsIgnoreCase(choice)) {
            System.out.println("[1] LOGIN");
            System.out.println("[2] REGISTER");
            System.out.println("[3] EXIT");
            System.out.print("Please select: ");
        
            int num = s.nextInt();
        
            switch(num) {
            
                case 1:
                    r.loginCust();
                break;
            
                case 2:
                    r.registerCust();
                break;
            
                case 3:
                    System.out.println("Thanks for using our service!");
                    Thread.sleep(5000);
                    System.exit(0);
                break;
            
                default:
                    System.out.println("Please enter a valid input");
            
            }
        
            System.out.println("Do you want to continue? (Y/N)");
            choice = s.next();
        
            if (!"Y".equalsIgnoreCase(choice)) {
        
                System.out.println("Thanks for using our service!");
                Thread.sleep(5000);
                System.exit(0);
            
            }
        }
    }
    
}
