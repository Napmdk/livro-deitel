package view;

import entity.Employee;

public class EmployeeView {

    public static void displayEmployee(Employee employee) {
        System.out.printf("Salário Anual do(a) funcionário(a) %s %s: R$%.2f%n",
                employee.getPrimeiroNome(), employee.getSobrenome(),
                employee.getSalarioAnual());
    }

    public static void displayEmployeeSalarioBonus(Employee employee, double porcentagem) {
        System.out.printf("Salário Anual com bônus de %.2f%% do(a) funcionário(a) %s %s: R$%.2f%n",
                porcentagem,
                employee.getPrimeiroNome(), employee.getSobrenome(),
                employee.aumentarSalarioAnualPorcentagem(porcentagem));
    }

}
