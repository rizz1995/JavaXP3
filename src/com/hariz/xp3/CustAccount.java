/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hariz.xp3;

/**
 *
 * @author hariz.r
 */

//CustAccount
//Used to set & get the acc info of customer
public class CustAccount {
    
    private String custCName, pw, pwHint;
    private int accNo, accBal;
    
    public String getCName() {
    
        return custCName;
        
    }
    
    public int getAcc() {
    
        return accNo;
        
    }
    
    public int getBal() {
    
        return accBal;
    
    }
    
    public String getPw() {
    
        return pw;
    
    }
    
    
    public String getPwHint() {
    
        return pwHint;
    
    }
    
    public void setCName (String custCName) {
    
        this.custCName = custCName;
        
    }
    
    public void setAcc (int accNo) {
    
        this.accNo = accNo;
    
    }
    
    public void setBal (int accBal) {
    
        this.accBal = accBal;
    
    }
    
    public void setPw (String pw) {
    
        this.pw = pw;
        
    }

    public void setPwHint (String pwHint) {
    
        this.pwHint = pwHint;
        
    }
    
}
