package controller;

import model.InvoiceModel;
import view.InvoiceView;

public class InvoiceController {

    InvoiceModel model;

    public InvoiceController(InvoiceModel model) {
        this.model = model;
    }

    public void setModelNumero(String numero) {
        model.setNumero(numero);
    }

    public void setModelDescricao(String descricao) {
        model.setDescricao(descricao);
    }

    public void setModelQuantidade(int quantidade) {
        model.setQuantidade(quantidade);
    }

    public void setModelPreco(double preco) {
        model.setPreco(preco);
    }

    public String getModelNumero() {
        return model.getNumero();
    }

    public String getModelDescricao() {
        return model.getDescricao();
    }

    public int getModelQuantidade() {
        return model.getQuantidade();
    }

    public double getModelPreco() {
        return model.getPreco();
    }

    public double getModelInvoiceAmount() {
        return model.getInvoiceAmount();
    }

    public void displayInvoice() {
        InvoiceView.InvoiceDisplay(model.getNumero(), model.getDescricao(),
                model.getQuantidade(), model.getPreco(),
                model.getInvoiceAmount());
    }

}
