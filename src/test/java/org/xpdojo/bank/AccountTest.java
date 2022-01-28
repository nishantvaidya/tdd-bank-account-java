package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void test_balance_check() {

        Account account = new Account(10);
        assertThat( account.balance()).isEqualTo(10);
    }

    @Test
    public void test_deposit_money(){
        Account account = new Account(20);
        assertThat( account.balance()).isEqualTo(20);
    }
}
