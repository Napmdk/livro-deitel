package model;

public class Date {

    private int mes;
    private int dia;
    private int ano;

    public Date(int mes, int dia, int ano) {
        if (mes > 0)
            if (mes == 4)
                if (dia <= 30)
                    this.dia = dia;
        if (mes > 0)
            if (mes == 6)
                if (dia <= 30)
                    this.dia = dia;
        if (mes > 0)
            if (mes == 9)
                if (dia <= 30)
                    this.dia = dia;
        if (mes > 0)
            if (mes == 11)
                if (dia <= 30)
                    this.dia = dia;
        if (mes > 0)
            if (mes == 1)
                if (dia <= 31)
                    this.dia = dia;
        if (mes > 0)
            if (mes == 2)
                if (dia <= 28)
                    this.dia = dia;
        if (mes > 0)
            if (mes == 3)
                if (dia <= 31)
                    this.dia = dia;
        if (mes > 0)
            if (mes == 5)
                if (dia <= 31)
                    this.dia = dia;
        if (mes > 0)
            if (mes == 7)
                if (dia <= 31)
                    this.dia = dia;
        if (mes > 0)
            if (mes == 8)
                if (dia <= 31)
                    this.dia = dia;
        if (mes > 0)
            if (mes == 10)
                if (dia <= 31)
                    this.dia = dia;
        if (mes > 0)
            if (mes == 12)
                if (dia <= 31)
                    this.dia = dia;
        if (mes > 0)
            if (mes <= 12)
                this.mes = mes;
        if (ano > 0)
            if (ano <= 2024)
                this.ano = ano;
    }

    public void setMes(int mes) {
        if (mes > 0)
            if (mes <= 12)
                this.mes = mes;
    }

    public void setDia(int dia) {
        if (mes > 0)
            if (mes == 4)
                if (dia <= 30)
                    this.dia = dia;
        if (mes > 0)
            if (mes == 6)
                if (dia <= 30)
                    this.dia = dia;
        if (mes > 0)
            if (mes == 9)
                if (dia <= 30)
                    this.dia = dia;
        if (mes > 0)
            if (mes == 11)
                if (dia <= 30)
                    this.dia = dia;
        if (mes > 0)
            if (mes == 1)
                if (dia <= 31)
                    this.dia = dia;
        if (mes > 0)
            if (mes == 2)
                if (dia <= 28)
                    this.dia = dia;
        if (mes > 0)
            if (mes == 3)
                if (dia <= 31)
                    this.dia = dia;
        if (mes > 0)
            if (mes == 5)
                if (dia <= 31)
                    this.dia = dia;
        if (mes > 0)
            if (mes == 7)
                if (dia <= 31)
                    this.dia = dia;
        if (mes > 0)
            if (mes == 8)
                if (dia <= 31)
                    this.dia = dia;
        if (mes > 0)
            if (mes == 10)
                if (dia <= 31)
                    this.dia = dia;
        if (mes > 0)
            if (mes == 12)
                if (dia <= 31)
                    this.dia = dia;
    }

    public void setAno(int ano) {
        if (ano > 0)
            if (ano <= 2024)
                this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public int getAno() {
        return ano;
    }

    public static String dateFormatMes(int mes) {
        if (mes <= 9)
            return "0";
        return "";
    }

    public static String dateFormatDia(int dia) {
        if (dia <= 9)
            return "0";
        return "";
    }

}
