/*
(Múltiplos) Escreva um aplicativo que leia dois inteiros, além de determinar se o primeiro é um múltiplo do segundo e imprimir o resultado.
[Dica: utilize o operador de resto.]
 */

package application;

import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insira o primeiro número inteiro: ");
        int primeiroInteiro = input.nextInt();
        System.out.print("Insira o segundo número inteiro: ");
        int segundoInteiro = input.nextInt();

        int primeiroInteiroMultiplo = primeiroInteiro % segundoInteiro;

        if (primeiroInteiroMultiplo == 0)
            System.out.println("O primeiro número inteiro é múltiplo do segundo número inteiro");
        if (primeiroInteiroMultiplo != 0)
            System.out.println("O primeiro número inteiro não é múltiplo do segundo número inteiro");

        input.close();

    }

}
