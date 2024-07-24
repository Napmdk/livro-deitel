/*
(Tabela de quadrados e cubos) Utilizando apenas as técnicas de programação que aprendeu neste capítulo, escreva um aplicativo que
calcule os quadrados e cubos dos números de 0 a 10 e imprima os valores resultantes em formato de tabela como a seguir:
 number square cube
 0      0      0
 1      1      1
 2      4      8
 3      9      27
 4      16     64
 5      25     125
 6      36     216
 7      49     343
 8      64     512
 9      81     729
 10     100    1000
 */

package application;

public class TabelaQuadradosCubos {

    public static void main(String[] args) {

        System.out.print("Number     Square     Cube");
        System.out.printf("%n%d          %d          %d", 0, (0 * 0), (0 * 0 * 0));
        System.out.printf("%n%d          %d          %d", 1, (1 * 1), (1 * 1 * 1));
        System.out.printf("%n%d          %d          %d", 2, (2 * 2), (2 * 2 * 2));
        System.out.printf("%n%d          %d          %d", 3, (3 * 3), (3 * 3 * 3));
        System.out.printf("%n%d          %d         %d", 4, (4 * 4), (4 * 4 * 4));
        System.out.printf("%n%d          %d         %d", 5, (5 * 5), (5 * 5 * 5));
        System.out.printf("%n%d          %d         %d", 6, (6 * 6), (6 * 6 * 6));
        System.out.printf("%n%d          %d         %d", 7, (7 * 7), (7 * 7 * 7));
        System.out.printf("%n%d          %d         %d", 8, (8 * 8), (8 * 8 * 8));
        System.out.printf("%n%d          %d         %d", 9, (9 * 9), (9 * 9 * 9));
        System.out.printf("%n%d         %d        %d", 10, (10 * 10), (10 * 10 * 10));

    }

}
