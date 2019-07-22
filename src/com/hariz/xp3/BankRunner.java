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
public class BankRunner {
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //BankRegister obj = new BankRegister();
        Scanner s = new Scanner (System.in);
        
        System.out.println("[1] LOGIN");
        System.out.println("[2] REGISTER");
        System.out.println("[3] EXIT");
        System.out.print("Please select: ");
        
        int num = s.nextInt();
        
        switch(num) {
            
            case 1:
                System.out.println("Test 1");
            break;
            
            case 2:
                System.out.println("Test 2");
            break;
            
            case 3:
                System.out.println("Test 3");
            break;
            
            default:
                System.out.println("wut!");
            
        }
                    
        /*int i;
        String d;
        //i = 0;
        d = "*";
        for (i = 1; i < 50; i++) {
            System.out.print(d);
        
        }*/
    }
    
}
