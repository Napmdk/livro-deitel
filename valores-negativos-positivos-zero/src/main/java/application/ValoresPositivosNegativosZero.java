/*
(Valores negativos, positivos e zero) Escreva um programa que insira cinco números, além de determinar e imprimir quantos negativos,
quantos positivos e quantos zeros foram inseridos.
 */

package application;

import java.util.Scanner;

public class ValoresPositivosNegativosZero {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira cinco números inteiros abaixo: ");
        int primeiroNumero = input.nextInt();
        int segundoNumero = input.nextInt();
        int terceiroNumero = input.nextInt();
        int quartoNumero = input.nextInt();
        int quintoNumero = input.nextInt();

        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorZeros = 0;

        if (primeiroNumero > 0)
            contadorPositivos = contadorPositivos + 1;
        if (segundoNumero > 0)
            contadorPositivos = contadorPositivos + 1;
        if (terceiroNumero > 0)
            contadorPositivos = contadorPositivos + 1;
        if (quartoNumero > 0)
            contadorPositivos = contadorPositivos + 1;
        if (quintoNumero > 0)
            contadorPositivos = contadorPositivos + 1;

        if (primeiroNumero < 0)
            contadorNegativos = contadorNegativos + 1;
        if (segundoNumero < 0)
            contadorNegativos = contadorNegativos + 1;
        if (terceiroNumero < 0)
            contadorNegativos = contadorNegativos + 1;
        if (quartoNumero < 0)
            contadorNegativos = contadorNegativos + 1;
        if (quintoNumero < 0)
            contadorNegativos = contadorNegativos + 1;

        if (primeiroNumero == 0)
            contadorZeros = contadorZeros + 1;
        if (segundoNumero == 0)
            contadorZeros = contadorZeros + 1;
        if (terceiroNumero == 0)
            contadorZeros = contadorZeros + 1;
        if (quartoNumero == 0)
            contadorZeros = contadorZeros + 1;
        if (quintoNumero == 0)
            contadorZeros = contadorZeros + 1;

        System.out.printf("Quantidade de inteiros positivos inseridos: %d%n", contadorPositivos);
        System.out.printf("Quantidade de inteiros negativos inseridos: %d%n", contadorNegativos);
        System.out.printf("Quantidade de zeros inseridos: %d%n", contadorZeros);

        input.close();

    }

}
