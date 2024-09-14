/*
(Classe AccountModel modificada) Modifique a classe AccountModel (Figura 3.8) para fornecer um método chamado withdraw que retira dinheiro
de uma AccountModel. Assegure que o valor de débito não exceda o saldo de AccountModel. Se exceder, o saldo deve ser deixado inalterado
e o método deve imprimir uma mensagem que indica "Withdrawal amount exceeded account balance" [Valor de débito
excedeu o saldo da conta]. Modifique a classe AccountTest (Figura 3.9) para testar o método withdraw.
 */

package model;

public class AccountModel {

    private String name;
    private double balance;

    public AccountModel(String name, double balance) {
        this.name = name;

        if (balance > 0.0)
            this.balance = balance;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0)
            balance = balance + depositAmount;
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > 0.0)
            if (withdrawAmount < balance)
                balance = balance - withdrawAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
