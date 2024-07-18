/*
(Comparando inteiros) Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e exiba o número
maior seguido pelas palavras “is larger". Se os números forem iguais, imprima a mensagem “These numbers are equal". Utilize
as técnicas mostradas na Figura 2.15.
 */

package application;

import java.util.Scanner;

public class ComparandoInteiros {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insira o primeiro número inteiro: ");
        int primeiroInteiro = input.nextInt();
        System.out.print("Insira o segundo número inteiro: ");
        int segundoInteiro = input.nextInt();

        if (primeiroInteiro > segundoInteiro)
            System.out.printf("%d is larger.%n", primeiroInteiro);
        if (segundoInteiro > primeiroInteiro)
            System.out.printf("%d is larger.%n", segundoInteiro);
        if (primeiroInteiro == segundoInteiro)
            System.out.println("These numbers are equal.");

        input.close();

    }
}
