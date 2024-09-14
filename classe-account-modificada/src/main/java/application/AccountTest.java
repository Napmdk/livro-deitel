/*
(Removendo código duplicado no método main) Na classe AccountTest da Figura 3.9, o método main contém seis instruções
(linhas 13 e 14, 15 e 16, 28 e 29, 30 e 31, 40 e 41 e 42 e 43) e cada uma exibe name e balance do objeto AccountModel. Estude essas instruções
e você perceberá que elas só diferem no objeto AccountModel sendo manipulado — account1 ou account2. Neste exercício, você
definirá um novo método displayAccount que contém uma cópia dessa instrução de saída. O parâmetro do método será um objeto
AccountModel e o método irá gerar name e balance dele. Então você substituirá as seis instruções duplicadas em main por chamadas para
displayAccount passando como argumento o objeto específico AccountModel para saída.
 */

package application;

import model.AccountModel;
import java.util.Scanner;
import java.util.Locale;
import controller.AccountController;

public class AccountTest {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        AccountModel accountModel1 = new AccountModel("Jane Green", 50.00);
        AccountModel accountModel2 = new AccountModel("John Blue", -7.53);

        AccountController controller1 = new AccountController(accountModel1);
        AccountController controller2 = new AccountController(accountModel2);

        controller1.displayAccount();
        controller2.displayAccount();

        System.out.print("\nEnter deposit amount for accountModel1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nAdding $%.2f to accountModel1 balance%n%n", depositAmount);
        controller1.deposit(depositAmount);

        controller1.displayAccount();
        controller2.displayAccount();

        System.out.print("\nEnter deposit amount for accountModel2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nAdding $%.2f to accountModel2 balance%n%n", depositAmount);
        controller2.deposit(depositAmount);

        controller1.displayAccount();
        controller2.displayAccount();

        System.out.print("\nEnter withdraw amount for accountModel1: ");
        double withdrawAmount = input.nextDouble();
        System.out.printf("%nWithdrawing $%.2f to accountModel1 balance%n%n", withdrawAmount);
        controller1.withdraw(withdrawAmount);

        controller1.displayAccount();
        controller2.displayAccount();

        System.out.print("\nEnter withdraw amount for accountModel2: ");
        withdrawAmount = input.nextDouble();
        System.out.printf("%nWithdrawing $%.2f to accountModel2 balance%n%n", withdrawAmount);
        controller2.withdraw(withdrawAmount);

        controller1.displayAccount();
        controller2.displayAccount();
        
        input.close();

    }

}
