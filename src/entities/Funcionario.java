package entities;
// Entidade para o exercicio 1 - APS

public class Funcionario {
    private int cracha;
    private float salario;
    private String cargo;

    public Funcionario() {
    }

    public Funcionario(int cracha, float salario, String cargo) {
        this.cracha = cracha;
        this.salario = salario;
        this.cargo = cargo;
    }

    public void calculaAumento(float porcentagem) {
        this.salario += (this.salario * porcentagem) / 100;
    }

    // Considera-se que o tempo sera passado em dias.
    // A cada ano, o Salario do funcionario sera aumentado em 150.
    public void calculaAumento(int tempo) {
        if (tempo > 364 && tempo < (365 * 2)) {
            this.salario += 150.0;
        }
    }
}

