package entities;

public class Funcionario {
    public String nome;
    public String cpf;
    public double salario;

    public Funcionario(){
    }

    public Funcionario(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public boolean autentica(){
        return false;
    }

    public double bonificacao(){
        return 0;
    }
}

