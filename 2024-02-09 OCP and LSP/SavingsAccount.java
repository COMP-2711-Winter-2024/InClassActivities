/*
 * COPYRIGHT (c) 2023, Laurie Ricker and COMP 2711 Teaching Team. All rights reserved.
 * DO NOT ALTER OR REMOVE THIS FILE HEADER.
 */

import java.math.BigDecimal;

public class SavingsAccount implements DepositAccount, WithdrawableAccount {

    private BigDecimal balance;

    public SavingsAccount(BigDecimal balance) {
        this.balance = balance;
    }

    public void deposit(BigDecimal amount){
        // assumes a positive non-zero amount to be deposited
        balance = balance.add(amount);
    }

    public void withdraw(BigDecimal amount) {
        // throw exception if amount is larger than balance
        if (amount.compareTo(amount) == 1)
            throw new IllegalArgumentException("Cannot withdraw more money than you have in your account.");
        balance = balance.subtract(amount);
    }
}
