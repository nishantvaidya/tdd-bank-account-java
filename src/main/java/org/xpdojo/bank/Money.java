package org.xpdojo.bank;

import java.math.BigDecimal;

/**
 * Immutable class to represent Money as a concept.
 * This class should have no accessor methods.
 */
public class Money {

    private final int money;

    public Money(int money){
        this.money = money;
    }

    public int getMoney(){
        return  money;
    }
}
