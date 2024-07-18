/*
(Aritmética) Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e imprima sua soma, produto,
diferença e quociente (divisão). Utilize as técnicas mostradas na Figura 2.7.
 */

package application;

import java.util.Scanner;

public class AritmeticaExercicio {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insira o primeiro número inteiro: ");
        int primeiroInteiro = input.nextInt();
        System.out.print("Insira o segundo número inteiro: ");
        int segundoInteiro = input.nextInt();

        int soma = primeiroInteiro + segundoInteiro;
        int produto = primeiroInteiro * segundoInteiro;
        int diferenca = primeiroInteiro - segundoInteiro;
        int quociente = primeiroInteiro / segundoInteiro;

        System.out.printf("Soma: %d%nProduto: %d%nDiferença: %d%nQuociente: %d%n",
                soma, produto, diferenca, quociente);

        input.close();
    }
}
