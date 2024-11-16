package entities;

public class Empregado {
    String nome;
    String matricula;

    public Empregado() {
    }

    public Empregado(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public float calculaSalario(){
        return 1F;
    }
}
