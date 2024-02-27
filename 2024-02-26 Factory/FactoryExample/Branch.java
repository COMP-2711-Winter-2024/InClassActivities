package FactoryExample;

public class Branch {

    private BankAccountFactory baf = new BankAccountFactory();

    public BankAccount openAccount(String type) {
        BankAccount bankAccount = baf.createAccount(type);

        bankAccount.validateUserIdentity();
        bankAccount.calculateInterestRate();
        bankAccount.registerAccount();

        return bankAccount;
    }

    public void someLogic() {
        // some complicated business logic
        // already tested
    }

}
