/*
Utilizando instruções semelhantes àquela mostrada anteriormente neste exercício, escreva um aplicativo que exiba os equivalentes
inteiros de algumas letras maiúsculas, minúsculas, dígitos e símbolos especiais. Mostre os equivalentes inteiros do seguinte: A B C a b c
0 1 2 $ * + / e o caractere em branco.
 */

package application;

public class ValorInteiroCaractere {

    public static void main(String[] args) {

        char aM = 'A';
        char bM = 'B';
        char cM = 'C';
        char a = 'a';
        char b = 'b';
        char c = 'c';
        char zero = '0';
        char um = '1';
        char dois = '2';
        char cifrao = '$';
        char asterisco = '*';
        char barra = '/';

        System.out.printf("Equivalente inteiro de '%c' é %d%nEquivalente inteiro de '%c' é %d%n" +
                "Equivalente inteiro de '%c' é %d%nEquivalente inteiro de '%c' é %d%n" +
                "Equivalente inteiro de '%c' é %d%nEquivalente inteiro de '%c' é %d%n" +
                "Equivalente inteiro de '%c' é %d%nEquivalente inteiro de '%c' é %d%n" +
                "Equivalente inteiro de '%c' é %d%nEquivalente inteiro de '%c' é %d%n" +
                "Equivalente inteiro de '%c' é %d%nEquivalente inteiro de '%c' é %d%n",
                aM, (int) aM, bM, (int) bM, cM, (int) cM, a , (int) a, b, (int) b, c, (int) c,
                zero, (int) zero, um, (int) um, dois, (int) dois,
                cifrao, (int) cifrao, asterisco, (int) asterisco, barra, (int) barra);

    }

}
