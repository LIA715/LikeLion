public class SavingsAccount extends BankAccount{

    boolean isOverdraft;

    SavingsAccount(int bankCode, int accountNo, String owner, int balance, int password, boolean isDormant) {
        super(bankCode, accountNo, owner, balance, password, isDormant);
    }

    void transfer(){};


}
