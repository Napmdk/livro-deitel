/*
(Gráfico de barras do programa de impressão) Uma aplicação interessante dos computadores é exibir diagramas e gráficos de barras.
Escreva um aplicativo que leia cinco números entre 1 e 30. Para cada número que é lido, seu programa deve exibir o mesmo número de
asteriscos adjacentes. Por exemplo, se seu programa lê o número 7, ele deve exibir *******. Exiba as barras dos asteriscos depois de ler
os cinco números.
 */

package application;

import java.util.Scanner;

public class ImpressaoGraficoBarrasTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.printf("%nInsira o %d° número: ", i);
            int numero = input.nextInt();

            if (numero >= 1 && numero <= 30) {
                for (int j = 1; j <= numero; j++)
                    System.out.print('*');
            } else {
                System.out.print("O número inserido é menor do que 1 ou maior do que 30");
            }

        }

        input.close();

    }

}
