package entities;

public class Programador extends Empregado {
    private float qtdeHoras;
    private float valorHora;

    public Programador() {
    }

    public Programador(String nome, String matricula, float qtdeHoras, float valorHora) {
        super(nome, matricula);
        this.nome = nome;
        this.matricula = matricula;
        this.qtdeHoras = qtdeHoras;
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "Programador(a) " + nome + " de Registro " + matricula;
    }

    /**
     * Esse metodo calcula salario do Programador fazendo a multiplicacao de valor de Horas por
     * quantidade de Horas trabalhadas
     *
     * @return O valor do Salario
     */
    public float calculaSalario() {
        return valorHora * qtdeHoras;
    }
}
