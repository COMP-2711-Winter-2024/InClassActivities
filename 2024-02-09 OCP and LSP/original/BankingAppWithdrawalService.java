/*
 * COPYRIGHT (c) 2023, Laurie Ricker and COMP 2711 Teaching Team. All rights reserved.
 * DO NOT ALTER OR REMOVE THIS FILE HEADER.
 */

import java.math.BigDecimal;

public class BankingAppWithdrawalService {
    private SavingsAccount sAccount;
    private CurrentAccount cAccount;

    public BankingAppWithdrawalService(SavingsAccount sAccount, CurrentAccount cAccount) {
        this.sAccount = sAccount;
        this.cAccount = cAccount;
    }

    public void withdrawCurrent(BigDecimal amount) {
        cAccount.withdraw(amount);
    }

    public void withdrawSavings(BigDecimal amount) {
        sAccount.withdraw(amount);
    }
}
