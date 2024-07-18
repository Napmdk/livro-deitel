/*
(Inteiros maiores e menores) Escreva um aplicativo que leia cinco inteiros, além de determinar e imprimir o maior e o menor inteiro
no grupo. Utilize somente as técnicas de programação que você aprendeu neste capítulo.
 */

package application;

import java.util.Scanner;

public class InteirosMaioresMenores {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insira o primeiro número inteiro: ");
        int primeiroInteiro = input.nextInt();
        System.out.print("Insira o segundo número inteiro: ");
        int segundoInteiro = input.nextInt();
        System.out.print("Insira o terceiro número inteiro: ");
        int terceiroInteiro = input.nextInt();
        System.out.print("Insira o quarto número inteiro: ");
        int quartoInteiro = input.nextInt();
        System.out.print("Insira o quinto número inteiro: ");
        int quintoInteiro = input.nextInt();

        if (primeiroInteiro > segundoInteiro)
            if (primeiroInteiro > terceiroInteiro)
                if (primeiroInteiro > quartoInteiro)
                    if (primeiroInteiro > quintoInteiro)
                        System.out.println("Maior número: " + primeiroInteiro);
        if (segundoInteiro > primeiroInteiro)
            if (segundoInteiro > terceiroInteiro)
                if (segundoInteiro > quartoInteiro)
                    if (segundoInteiro > quintoInteiro)
                        System.out.println("Maior número: " + segundoInteiro);
        if (terceiroInteiro > primeiroInteiro)
            if (terceiroInteiro > segundoInteiro)
                if (terceiroInteiro > quartoInteiro)
                    if (terceiroInteiro > quintoInteiro)
                        System.out.println("Maior número: " + terceiroInteiro);
        if (quartoInteiro > primeiroInteiro)
            if (quartoInteiro > segundoInteiro)
                if (quartoInteiro > terceiroInteiro)
                    if (quartoInteiro > quintoInteiro)
                        System.out.println("Maior número : " + quartoInteiro);
        if (quintoInteiro > primeiroInteiro)
            if (quintoInteiro > segundoInteiro)
                if (quintoInteiro > terceiroInteiro)
                    if (quintoInteiro > quartoInteiro)
                        System.out.println("Maior número: " + quintoInteiro);

        if (primeiroInteiro < segundoInteiro)
            if (primeiroInteiro < terceiroInteiro)
                if (primeiroInteiro < quartoInteiro)
                    if (primeiroInteiro < quintoInteiro)
                        System.out.println("Menor número: " + primeiroInteiro);
        if (segundoInteiro < primeiroInteiro)
            if (segundoInteiro < terceiroInteiro)
                if (segundoInteiro < quartoInteiro)
                    if (segundoInteiro < quintoInteiro)
                        System.out.println("Menor número: " + segundoInteiro);
        if (terceiroInteiro < primeiroInteiro)
            if (terceiroInteiro < segundoInteiro)
                if (terceiroInteiro < quartoInteiro)
                    if (terceiroInteiro < quintoInteiro)
                        System.out.println("Menor número: " + terceiroInteiro);
        if (quartoInteiro < primeiroInteiro)
            if (quartoInteiro < segundoInteiro)
                if (quartoInteiro < terceiroInteiro)
                    if (quartoInteiro < quintoInteiro)
                        System.out.println("Menor número : " + quartoInteiro);
        if (quintoInteiro < primeiroInteiro)
            if (quintoInteiro < segundoInteiro)
                if (quintoInteiro < terceiroInteiro)
                    if (quintoInteiro < quartoInteiro)
                        System.out.println("Menor número: " + quintoInteiro);

        input.close();

    }

}
