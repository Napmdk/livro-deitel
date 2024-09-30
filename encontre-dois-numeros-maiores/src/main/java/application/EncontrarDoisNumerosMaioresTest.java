/*
(Encontre os dois números maiores) Utilizando uma abordagem semelhante àquela do Exercício 4.21, encontre os dois maiores valores
entre os 10 valores inseridos.
 */

package application;

import java.util.Scanner;

public class EncontrarDoisNumerosMaioresTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = 1;
        int number;
        int largest1 = 0;
        int largest2 = 0;



        while (counter <= 10) {
            System.out.print("Insira um número inteiro: ");
            number = input.nextInt();

            if (number > largest1) {
                largest2 = largest1;
                largest1 = number;
            }
            else if (number > largest2)
                largest2 = number;

            ++counter;
        }

        System.out.printf("Primeiro maior valor: %d %n" +
                "Segundo maior valor: %d %n",
                largest1, largest2);

        input.close();

    }

}
