package model;

import lombok.Getter;

@Getter
public class Date {

    private int mes;
    private int dia;
    private int ano;

    private static final int JANEIRO = 1;
    private static final int FEVEREIRO = 2;
    private static final int MARCO = 3;
    private static final int ABRIL = 4;
    private static final int MAIO = 5;
    private static final int JUNHO = 6;
    private static final int JULHO = 7;
    private static final int AGOSTO = 8;
    private static final int SETEMBRO = 9;
    private static final int OUTUBRO = 10;
    private static final int NOVEMBRO = 11;
    private static final int DEZEMBRO = 12;


    public Date(int mes, int dia, int ano) {
        if(mes > 0){
            validaDia(mes, dia);
            validaMes(mes);
        }
        validaAno(ano);
    }

    private void validaAno(int ano) {
        if (ano > 0)
            if (ano <= 2024)
                this.ano = ano;
    }

    private void validaMes(int mes) {
        if(mes <= 12) this.mes = mes;
    }

    private void validaDia(int mes, int dia) {
        if(JANEIRO == mes)
            if (isDiaMenorQueDiaMaximoMes(dia, 31)) this.dia = dia;
        if(FEVEREIRO == mes)
            if (isDiaMenorQueDiaMaximoMes(dia, 28)) this.dia = dia;
        if(MARCO == mes)
            if (isDiaMenorQueDiaMaximoMes(dia, 31)) this.dia = dia;
        if(ABRIL == mes)
            if (isDiaMenorQueDiaMaximoMes(dia, 30)) this.dia = dia;
        if(MAIO == mes)
            if (isDiaMenorQueDiaMaximoMes(dia, 31)) this.dia = dia;
        if(JUNHO == mes)
            if (isDiaMenorQueDiaMaximoMes(dia, 30)) this.dia = dia;
        if(JULHO == mes)
            if (isDiaMenorQueDiaMaximoMes(dia, 31)) this.dia = dia;
        if(AGOSTO == mes)
            if (isDiaMenorQueDiaMaximoMes(dia, 31)) this.dia = dia;
        if(SETEMBRO == mes)
            if (isDiaMenorQueDiaMaximoMes(dia, 30)) this.dia = dia;
        if(OUTUBRO == mes)
            if (isDiaMenorQueDiaMaximoMes(dia, 31)) this.dia = dia;
        if(NOVEMBRO == mes)
            if (isDiaMenorQueDiaMaximoMes(dia, 30)) this.dia = dia;
        if(DEZEMBRO == mes)
            if (isDiaMenorQueDiaMaximoMes(dia, 31)) this.dia = dia;
    }


    private boolean isDiaMenorQueDiaMaximoMes(int dia, int diaMaximo){
        return dia <= diaMaximo;
    }

    public static String formataData(int value) {
        String aux = String.valueOf(value);
        if (value <= 9)
            return "0".concat(aux);
        return aux;
    }
}
