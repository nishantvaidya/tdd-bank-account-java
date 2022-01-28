package org.xpdojo.bank;

public class Account {

    private int money;

    public Account(int money){
         this.money = money;
    }

    public int balance(){
        return money;
    }
}
