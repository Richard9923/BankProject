import java.util.*;


public class InputUtils {
    Scanner userInput = new Scanner(System.in);
    Map<String, String> accounts = new HashMap<>();
    Boolean haveAccount = false;
    Boolean endingApp = false;
    String account;

    void loggingAccount() {
        System.out.println("You already have an account? ");
        String inputLogin = userInput.nextLine();
        accounts.put("Rafael", "1234");

        if (inputLogin.equalsIgnoreCase("yes")) {
            System.out.println("What is your account number? ");
            String inputAccountNumber = userInput.nextLine();
            // Loop para verificar se o usuario tem uma conta utilizando map
            for (Map.Entry<String, String> entry : accounts.entrySet()) {
                if (inputAccountNumber.equalsIgnoreCase(entry.getValue())) {
                    System.out.println("Account number: " + inputAccountNumber + " Localized. Welcome " + entry.getKey());
                    haveAccount = true;
                    account = entry.getValue();
                } else {
                    System.out.println("Account number: " + inputAccountNumber + " not localized.");
                }
            }
        } else {
            System.out.println("You need to create an account.");
            System.out.println("You want to create an account? ");
            String newAccountAnswer = userInput.nextLine();
            if (Objects.equals(newAccountAnswer, "yes")) {
                creatingAccount();
            } else {
                System.out.println("Finishing app.");
                endingApp = true;
            }

        }
    }

    void creatingAccount() {
        Random accountGerator = new Random();
        Boolean accountAccepted = false;
        System.out.println("What's your name? ");
        String name = userInput.nextLine();
        String newAccountNumber;

        while (accountAccepted != true) {
            int generatingAccountNumber = 1000 + accountGerator.nextInt(9000);
            newAccountNumber = Integer.toString(generatingAccountNumber);
            for (Map.Entry<String, String> entry : accounts.entrySet()) {
                if (!newAccountNumber.equals(entry.getValue())) {
                    accounts.put(name, newAccountNumber);
                    System.out.println("New account created. Your account number is " + newAccountNumber);
                    accountAccepted = true;
                    loggingAccount();
                };
            }
        }


    }

    String account () {
        return this.account;
    }
    Boolean haveAccount() {
        return this.haveAccount;
    }

}
