package FactoryExample;

public class BankAccountFactory {
    public BankAccount createAccount(String userInput) {
        BankAccount bankAccount = null;
        if (userInput.equals("P")){
            bankAccount = new PersonalAccount();
        } else if (userInput.equals("B")){
            bankAccount = new BusinessAccount();
        } else if (userInput.equals("C")){
            bankAccount = new ChequingAccount();
        } else {
            System.out.println("Invalid type. No account for you.");
        }
        return bankAccount;
    }
}
