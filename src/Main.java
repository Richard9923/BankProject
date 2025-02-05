public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        BankAccount account1 = new BankAccount();
        runningApp();
    }

   public static void runningApp() {
        InputUtils inputAccount = new InputUtils();
        BankAccount balanceAccount = new BankAccount();

        while (inputAccount.haveAccount() == false) {
            if (inputAccount.haveAccount() == false) {
                inputAccount.loggingAccount();
            }

        balanceAccount.localizingAccountBalance(inputAccount.account());




        }
    }
}