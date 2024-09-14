package view;

public class AccountView {

    public static void displayAccount(String name, double balance) {
        System.out.printf("%s balance: $%.2f %n", name, balance);
    }

}
