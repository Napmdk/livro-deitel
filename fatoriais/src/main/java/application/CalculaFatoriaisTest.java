/*
(Fatoriais) Fatoriais costumam ser utilizados em problemas de probabilidade. O fatorial de um inteiro positivo n (escrito como n! e pronunciado
como “fatorial de n”) é igual ao produto dos números inteiros positivos de 1 a n. Escreva um aplicativo que calcula os fatoriais
de 1 a 20. Utilize o tipo long. Exiba os resultados em formato tabular. Que dificuldade poderia impedir você de calcular o fatorial de 100?
 */

package application;

public class CalculaFatoriaisTest {

    public static void main(String[] args) {

        long produto = 1;
        for (int i = 1; i <= 20; i++) {
            produto *= i;
            System.out.printf("%d!: %,d%n", i, produto);
        }

    }

}
