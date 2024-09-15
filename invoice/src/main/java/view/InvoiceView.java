package view;

public class InvoiceView {

    public static void InvoiceDisplay(String numero, String descricao, int quantidade, double preco, double valorTotalFatura) {
        System.out.printf("Descrição do produto: %s %nNúmero do produto: %s %n" +
                "Preço (unidade): R$%.2f %nQuantidade: %d %n" +
                "Valor total da fatura: R$%.2f %n%n",
                descricao, numero, preco, quantidade, valorTotalFatura);
    }

}
