
import java.util.HashMap;
import java.util.Map;

public class BankAccount extends InputUtils {

    String accountNumber;
    int accountBalance;

    Map<String, Integer> accountBalances = new HashMap<>();

    void localizingAccountBalance (String accountNumber) {
        accountBalances.put(accountNumber, 20);
        for (Map.Entry<String, Integer> entry : accountBalances.entrySet()) {
            if (accountNumber.equalsIgnoreCase(entry.getKey())) {
                System.out.println("Your balance is " + entry.getValue() + "$");
            } else {
                System.out.println("Something went wrong.");
            }

        }

    }

    void balanceSpecificAccount(int accountNumber) {

    }

    void withdrawal (int amount) {
            if (this.accountBalance >= amount) {
                accountBalance -= amount;
                System.out.println("Transaction succeed");
            } else {
                throw new RuntimeException("You don't have enough money. " + accountNumber + "$.");

            }
    }

    void deposit (int amount) {
        accountBalance += amount;
        System.out.println("You deposited " + amount + "$ in your account.");
    }

    int getBalance() {
        return accountBalance;
    }


}
