/*
(Classe Date) Crie uma classe chamada Date que inclua três variáveis de instância — mês (tipo int), dia (tipo int) e ano (tipo int).
Forneça um construtor que inicializa as três variáveis de instância supondo que os valores fornecidos estejam corretos. Ofereça um método
set e um get para cada variável de instância. Apresente um método displayDate que exiba mês, dia e ano separados por barras normais
(/). Escreva um aplicativo de teste chamado DateTest que demonstre as capacidades da classe Date.
 */

package application;

import model.Date;
import view.DateView;
import java.util.Scanner;

public class DateTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("~~Informe uma data (mês/dia/ano)~~");
        System.out.print("Mês: ");
        int mes = input.nextInt();
        System.out.print("Dia: ");
        int dia = input.nextInt();
        System.out.print("Ano: ");
        int ano = input.nextInt();

        Date dateModel = new Date(mes, dia, ano);

        DateView.displayDate(dateModel);

        input.close();

    }

}
