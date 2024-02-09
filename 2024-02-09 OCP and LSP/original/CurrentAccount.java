/*
 * COPYRIGHT (c) 2023, Laurie Ricker and COMP 2711 Teaching Team. All rights reserved.
 * DO NOT ALTER OR REMOVE THIS FILE HEADER.
 */

import java.math.BigDecimal;

public class CurrentAccount {
    private BigDecimal balance;
    private BigDecimal overdraft;

    public CurrentAccount(BigDecimal balance, BigDecimal overdraft) {
        this.balance = balance;
        this.overdraft = overdraft;
    }

    public void deposit(BigDecimal amount){
        // assumes a positive non-zero amount to be deposited
        balance = balance.add(amount);
    }

    public void withdraw(BigDecimal amount) {
        // throw exception if amount is larger than balance + overdraft
        if (amount.compareTo(amount.add(overdraft))== 1)
            throw new IllegalArgumentException("Cannot exceed your overdraft!");
        balance = balance.subtract(amount);
    }
}
