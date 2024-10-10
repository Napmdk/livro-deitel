/*
(Programa de juros compostos modificado) Modifique o aplicativo de juros compostos da Figura 5.6 para repetir os passos para taxas
de juros de 5%, 6%, 7%, 8%, 9% e 10%. Utilize um loop for para variar a taxa de juros.
 */

package application;

public class InterestTest {

    public static void main(String[] args) {

        double amount; // quantia em depósito ao fim de cada ano
        double principal = 1000.0; // quantidade inicial antes dos juros

        // calcula quantidade de depósito para cada um dos dez anos e exibe os resultados na tela
        for (int year = 1; year <= 10; ++year) {

            System.out.printf("%s%4d%23s %n", "Year", year, "Amount on deposit");
            for (int i = 5; i <= 10; i++) {
                amount = principal * Math.pow(1.0 + ((double) i / 100.0), year);
                System.out.printf("Rate - %2d%%%,15.2f%n", i, amount);
            }

        }

    }

}
