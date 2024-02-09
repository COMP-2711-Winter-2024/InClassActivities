/*
 * COPYRIGHT (c) 2023, Laurie Ricker and COMP 2711 Teaching Team. All rights reserved.
 * DO NOT ALTER OR REMOVE THIS FILE HEADER.
 */

/**
 * Notes from 2024-02-09
 * 
 * First, we created an Account interface to abstract away account and
 * solve the OCP violation. But, then we introduced an LSP violation:
 * FixedTermDepositAccount can't be withdrawn from! So, we split our
 * Account interface into DepositAccount and WithdrawableAccount to
 * fix this violation.
 */


import java.math.BigDecimal;

public class BankingAppWithdrawalService {
    private WithdrawableAccount currentAccount;

    public BankingAppWithdrawalService(WithdrawableAccount cAccount) {
        this.currentAccount = cAccount;
    }

    public void withdrawCurrent(BigDecimal amount) {
        currentAccount.withdraw(amount);
    }

}
