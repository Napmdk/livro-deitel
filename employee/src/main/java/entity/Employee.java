package entity;

public class Employee {

    private String primeiroNome;
    private String sobrenome;
    private double salarioMensal;

    public Employee(String primeiroNome, String sobrenome, double salarioMensal) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        if (salarioMensal > 0.0)
            this.salarioMensal = salarioMensal;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal > 0.0)
            this.salarioMensal = salarioMensal;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public double getSalarioAnual() {
        return salarioMensal * 12;
    }

    public double aumentarSalarioAnualPorcentagem(double porcentagem) {
        return (porcentagem / 100.00 + 1) * getSalarioAnual();
    }

}
