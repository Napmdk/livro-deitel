/*
(Localize o menor valor) Escreva um aplicativo que localiza o menor de vários números inteiros. Suponha que o primeiro valor lido
especifica o número de valores a serem inseridos pelo usuário.
 */

package application;

import java.util.Scanner;

public class LocalizeMenorValorTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite quantos números inteiros deseja inserir: ");
        int quantidadeNumeros = input.nextInt();

        int numero;
        int menorNumero = 0;

        for (int i = 1; i <= quantidadeNumeros; i++) {
            System.out.printf("Digite o %d° número inteiro: ", i);
            numero = input.nextInt();
            if (i == 1)
                menorNumero = numero;
            if (numero < menorNumero)
                menorNumero = numero;
        }

        System.out.print("O menor número é: " + menorNumero);


        input.close();

    }

}
