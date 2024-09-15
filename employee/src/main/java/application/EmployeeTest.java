/*
(Classe Employee) Crie uma classe chamada Employee que inclua três variáveis de instância — um primeiro nome (tipo String), um
sobrenome (tipo String) e um salário mensal (double). Forneça um construtor que inicializa as três variáveis de instância. Forneça um
método set e um get para cada variável de instância. Se o salário mensal não for positivo, não configure seu valor. Escreva um aplicativo de
teste chamado EmployeeTest que demonstre as capacidades da classe Employee. Crie dois objetos Employee e exiba o salário anual
de cada objeto. Então dê a cada Employee um aumento de 10% e exiba novamente o salário anual de cada Employee.
 */

package application;

import entity.Employee;
import view.EmployeeView;
import java.util.Scanner;
import java.util.Locale;

public class EmployeeTest {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Employee employee1 = new Employee("Michel", "Degreas", 500.00);
        Employee employee2 = new Employee("Junior", "Quirino", 1000.00);

        EmployeeView.displayEmployee(employee1);
        EmployeeView.displayEmployee(employee2);

        System.out.printf("%nIndique uma porcentagem para aumento em relação ao salário anual do funcionário(a) %s %s: ",
                employee1.getPrimeiroNome(), employee1.getSobrenome());
        double porcentagem = input.nextDouble();
        EmployeeView.displayEmployeeSalarioBonus(employee1, porcentagem);

        System.out.printf("%nIndique uma porcentagem para aumento em relação ao salário anual do funcionário(a) %s %s: ",
                employee2.getPrimeiroNome(), employee2.getSobrenome());
        porcentagem = input.nextDouble();
        EmployeeView.displayEmployeeSalarioBonus(employee2, porcentagem);

        input.close();

    }

}
