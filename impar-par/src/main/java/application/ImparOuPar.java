/*
(Ímpar ou par) Escreva um aplicativo que leia um inteiro, além de determinar e imprimir se ele é ímpar ou par. [Dica: utilize o operador
de resto. Um número par é um múltiplo de 2. Qualquer múltiplo de 2 deixa um resto 0 quando dividido por 2.]
 */

package application;

import java.util.Scanner;

public class ImparOuPar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int numeroInteiro = input.nextInt();

        if (numeroInteiro % 2 == 0)
            System.out.println("Par");
        if (numeroInteiro % 2 != 0)
            System.out.println("Ímpar");

        input.close();

    }

}
