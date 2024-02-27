package FactoryExample;

public abstract class BankAccount {

    private String accountName;


    public boolean validateUserIdentity() {
        // implementation goes here
        return false;
    }

    public double calculateInterestRate() {
        // implementation goes here
        return 1;
    }

    public void registerAccount() {
        //implementation goes here
    }

}
