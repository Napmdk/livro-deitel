/*
Crie um aplicativo de calculadora IMC que leia o peso do usuário em libras e a altura em polegadas (ou, se preferir, o peso em quilogramas
e a altura em metros) e, então, calcule e exiba o índice de massa corporal dele. Além disso, que exiba as seguintes informações do Department
of Health and Human Services/National Institutes of Health, assim o usuário pode avaliar o seu IMC:

BMI VALUES
Underweight: less than 18.5
Normal: between 18.5 and 24.9
Overweight: between 25 and 29.9
Obese: 30 or greater

[Nota: neste capítulo, você aprendeu a utilizar o tipo int para representar números inteiros. Os cálculos de IMC, quando feitos com
valores int, produzirão resultados com números inteiros. No Capítulo 3, você aprenderá a utilizar o tipo double para representar números
com pontos decimais. Quando os cálculos de IMC são realizados com doubles, eles produzirão números com pontos decimais — esses são
chamados de números de “ponto flutuante”.]
 */

package application;

import java.util.Scanner;

public class CalculadoraIndiceMassaCorporal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("BMI VALUES%n" +
                "Underweight: less than 18.5%n" +
                "Normal: between 18.5 and 24.9%n" +
                "Overweight: between 25 and 29.9%n" +
                "Obese: 30 or greater%n");

        System.out.print("Informe seu peso em quilogramas (número inteiro): ");
        int peso = input.nextInt();
        System.out.print("Informe sua altura em centímetros (número inteiro): ");
        int altura = input.nextInt();

        int imc = (peso * 10000) / (altura * altura);

        System.out.printf("IMC: %d%n", imc);

        input.close();

    }

}
