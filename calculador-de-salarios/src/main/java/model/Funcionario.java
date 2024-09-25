package model;

public class Funcionario {

    private int horasTrabalhadas;
    private double salarioHora;

    public Funcionario(int horasTrabalhadas, double salarioHora) {
        if (horasTrabalhadas >= 40) {                //O programa inicializa as variáveis de instância
            this.horasTrabalhadas = horasTrabalhadas;//da classe se horasTrabalhadas for menor do que 40.
            if (salarioHora > 0.0)
                this.salarioHora = salarioHora;
        }
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        if (horasTrabalhadas >= 40)
            this.horasTrabalhadas = horasTrabalhadas;
    }

    public void setSalarioHora(double salarioHora) {
        if (salarioHora > 0.0)
            this.salarioHora = salarioHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public double bonusHorasTrabalhadas(int horasTrabalhadas) {
        if (horasTrabalhadas > 40) {
            return getSalarioHora() * 1.5;
        } else {
            return getSalarioHora();
        }
    }

}
