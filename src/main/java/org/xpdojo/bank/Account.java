package org.xpdojo.bank;

import java.util.HashMap;

public class Account {

    private int money;


    public Account(int money){
         this.money = money;
    }

    public int balance(){
        return money;
    }

    public void depositMoney(int money){
       this.money += money;
    }

    public  void withdrawMoney(int money){
        this.money = this.money - money;
    }
}
