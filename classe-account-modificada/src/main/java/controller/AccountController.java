package controller;

import model.AccountModel;
import view.AccountView;

public class AccountController {

    AccountModel model;

    public AccountController(AccountModel model) {
        this.model = model;
    }

    public void setAccountName(String accountName) {
        model.setName(accountName);
    }

    public String getAccountName() {
        return model.getName();
    }

    public void deposit(double depositAmount) {
        model.deposit(depositAmount);
    }

    public void withdraw(double withdrawAmount) {
        model.withdraw(withdrawAmount);
    }

    public double getAccountBalance() {
        return model.getBalance();
    }

    public void displayAccount() {
        AccountView.displayAccount(model.getName(), model.getBalance());
    }

}
