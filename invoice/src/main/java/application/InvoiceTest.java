package application;

import java.util.Locale;
import java.util.Scanner;
import model.InvoiceModel;
import controller.InvoiceController;

public class InvoiceTest {

    public static void main(String[] args) {

        InvoiceModel produto1Model = new InvoiceModel("22", "Geladeira Quatro Portas",
                2, 2500.99);
        InvoiceModel produtoModel2 = new InvoiceModel("54", "Violão Yamaha f310",
                1, 1100.00);

        InvoiceController produto1Controller = new InvoiceController(produto1Model);
        InvoiceController produto2Controller = new InvoiceController(produtoModel2);

        produto1Controller.displayInvoice();
        produto2Controller.displayInvoice();

    }

}
