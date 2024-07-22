/*
Escreva um aplicativo que leia a entrada a partir do usuário do raio de um círculo como um inteiro e imprima o diâmetro do círculo,
circunferência e área utilizando o valor do ponto flutuante 3,14159 para 􀁓. Utilize as técnicas mostradas na Figura 2.7. [Observação: você
também pode empregar a constante Math.PI predefinida para o valor de 􀁓. Essa constante é mais precisa que o valor 3,14159. A classe
Math é definida no pacote java.lang. As classes nesse pacote são importadas automaticamente, portanto, você não precisa importar
a classe Math para utilizá-la.]
Não armazene os resultados de cada cálculo em uma variável. Em vez disso, especifique cada cálculo como o valor de saída em uma
instrução System.out.printf. Os valores produzidos pelos cálculos de circunferência e área são números de ponto flutuante. A saída
desses valores pode ser gerada com o especificador de formato %f em uma instrução System.out.printf. Você aprenderá mais sobre
números de pontos flutuantes no Capítulo 3.
 */

package application;

import java.util.Scanner;

public class DiametroCircunferenciaAreaCirculo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insira o valor do raio de um círculo (número inteiro): ");
        int raio = input.nextInt();

        System.out.printf("Diâmetro: %d%nCircunferência: %.2f%nÁrea: %.2f%n",
                (2 * raio), (2 * Math.PI * raio), (Math.PI * raio * raio));

        input.close();

    }

}
