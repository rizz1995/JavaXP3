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
public class MenuFunc extends CustAccount {
    
    public void menuOne() {
    
        System.out.println("LOGIN PAGE");
        System.out.println("Please enter the account number: ");
        getAcc();
    
    }
    
    public void menuTwo() {
    
        System.out.println("REGISTER");
        System.out.print("Please enter your name: ");
        getCName();
        System.out.print("Please enter your account number: ");
        getAcc();
        System.out.print("Please enter the balance of the account: ");
        getBal();
                
    }
    
    public void menuThree () {
    
        System.out.println("Thanks for using XP3 Banking System");
        //Thread.sleep(2500);
        System.exit(0);
        
    }
    
}
