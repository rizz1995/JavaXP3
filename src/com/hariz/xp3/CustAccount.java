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

//CustAccount
//Used to set & get the acc info of customer
public class CustAccount {
    
    private String custCName;
    //private String custCName, pw, pwHint;
    private long accNo;
    private float accBal;
    
    Scanner obj = new Scanner (System.in);
    
    public String getCName() {
    
        obj.next();
        return custCName;
        
    }
    
    public long getAcc() {
    
        obj.nextLong();
        return accNo;
        
    }
    
    public float getBal() {
    
        obj.nextFloat();
        return accBal;
    
    }
    
    /*public String getPw() {
    
        return pw;
    
    }
    
    
    public String getPwHint() {
    
        return pwHint;
    
    }*/
    
    public void setCName (String custCName) {
    
        this.custCName = custCName;
        
    }
    
    public void setAcc (int accNo) {
    
        this.accNo = accNo;
    
    }
    
    public void setBal (int accBal) {
    
        this.accBal = accBal;
    
    }
    
    /*public void setPw (String pw) {
    
        this.pw = pw;
        
    }

    public void setPwHint (String pwHint) {
    
        this.pwHint = pwHint;
        
    }*/
    
}
