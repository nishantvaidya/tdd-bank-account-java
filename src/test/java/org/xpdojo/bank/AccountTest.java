package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {
    private  Account account;

    public AccountTest(){
        Account account = new Account(0);
    }

    @Test
    public void test_balance_check() {

        assertThat( account.balance()).isEqualTo(0);
    }

    @Test
    public void test_deposit_money(){
        account.depositMoney(20);
        assertThat( account.balance()).isEqualTo(20);
    }

   /* @Test
    @Disabled
    public void test_withDraw_money(){
        account.withdrawMoney(10);
        assertThat( account.balance()).isEqualTo(10);
    }*/
}
