/*
(Aritmética, menor e maior) Escreva um aplicativo que insira três inteiros digitados pelo usuário e exiba a soma, média, produto e os
números menores e maiores. Utilize as técnicas mostradas na Figura 2.15. [Observação: o cálculo da média neste exercício deve resultar
em uma representação de inteiro. Assim, se a soma dos valores for 7, a média deverá ser 2, não 2,3333...]
 */

package application;

import java.util.Scanner;

public class AritmeticaMenorMaior {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insira o primeiro número inteiro: ");
        int primeiroInteiro = input.nextInt();
        System.out.print("Insira o segundo número inteiro: ");
        int segundoInteiro = input.nextInt();
        System.out.print("Insira o terceiro número inteiro: ");
        int terceiroInteiro = input.nextInt();

        int soma = primeiroInteiro + segundoInteiro + terceiroInteiro;
        int media = soma / 3;
        int produto = primeiroInteiro * segundoInteiro * terceiroInteiro;

        System.out.printf("Soma: %d%nMédia: %d%nProduto: %d%n", soma, media, produto);

        if (primeiroInteiro > segundoInteiro)
            if (primeiroInteiro > terceiroInteiro)
                System.out.println("Maior número: " + primeiroInteiro);
        if (segundoInteiro > primeiroInteiro)
            if (segundoInteiro > terceiroInteiro)
                System.out.println("Maior número: " + segundoInteiro);
        if (terceiroInteiro > primeiroInteiro)
            if (terceiroInteiro > segundoInteiro)
                System.out.println("Maior número: " + terceiroInteiro);

        input.close();

    }

}
