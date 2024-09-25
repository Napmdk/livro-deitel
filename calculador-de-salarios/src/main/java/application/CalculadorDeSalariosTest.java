/*
(Calculador de salários) Desenvolva um aplicativo Java que determina o salário bruto de cada um de três empregados. A empresa paga
as horas normais pelas primeiras 40 horas trabalhadas por cada funcionário e 50% a mais por todas as horas trabalhadas além das 40
horas. Você recebe uma lista de empregados, o número de horas trabalhadas por eles na semana passada e o salário-hora de cada um. Seu
programa deve aceitar a entrada dessas informações para cada empregado e, então, determinar e exibir o salário bruto do empregado.
Utilize a classe Scanner para inserir os dados.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import model.Funcionario;

public class CalculadorDeSalariosTest {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int funcionarioLista = 0;
        int contagemLista = 0;

        while (funcionarioLista != -1) {
            System.out.print("Indique um funcionário na lista ou -1 para terminar: ");
            funcionarioLista = input.nextInt();
            if (funcionarioLista != -1) {
                System.out.print("Informe as horas trabalhadas na última semana pelo funcionário: ");
                int horasTrabalhadas = input.nextInt();
                System.out.print("Informe o salário hora do funcionário: ");
                double salarioHora = input.nextDouble();
                Funcionario funcionario = new Funcionario(horasTrabalhadas, salarioHora);
                ++contagemLista;
                System.out.printf("%n~~Id - %d~~%nSalário Bruto: R$%.2f%n%n",
                        contagemLista, funcionario.bonusHorasTrabalhadas(horasTrabalhadas));
            }
        }

        input.close();

    }

}
