/*
(Separando os dígitos em um inteiro) Escreva um aplicativo que insira um número consistindo em cinco dígitos a partir do usuário,
separe o número em seus dígitos individuais e imprima os dígitos separados uns dos outros por três espaços. Por exemplo, se o usuário
digitar o número 42339, o programa deve imprimir:

4 2 3 3 9

Suponha que o usuário insira o número correto de dígitos. O que acontece quando você insere um número com mais de cinco dígitos?
O que acontece quando você insere um número com menos de cinco dígitos?
 */

package application;

import java.util.Scanner;

public class SeparandoDigitosInteiro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insira um número inteiro contendo 5 dígitos: ");
        int numeroInteiro = input.nextInt();

        if (numeroInteiro <= 99999)
            if (numeroInteiro >= 10000) {
                int primeiroDigito = numeroInteiro / 10000;
                int segundoDigito = numeroInteiro / 1000 % 10;
                int terceiroInteiro = numeroInteiro / 100 % 10;
                int quartoInteiro = numeroInteiro / 10 % 10;
                int quintoInteiro = numeroInteiro % 10;

                System.out.printf("%d  %d  %d  %d  %d", primeiroDigito, segundoDigito,
                        terceiroInteiro, quartoInteiro, quintoInteiro);
            }

        if (numeroInteiro > 99999)
            System.out.println("Valor inválido (maior do que 5 dígitos)");
        if (numeroInteiro < 10000)
            System.out.println("Valor inválido (menor do que 5 dígitos)");

        input.close();

    }

}
