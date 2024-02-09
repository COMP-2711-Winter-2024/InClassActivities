import java.math.BigDecimal;

public class FixedTermDepositAccount implements DepositAccount {
    
    BigDecimal balance;

    public void withdraw(BigDecimal amount) {
        throw new UnsupportedOperationException("You can't withdraw!");
    }

    public void deposit(BigDecimal amount) {
        balance.add(amount);
    }

}
