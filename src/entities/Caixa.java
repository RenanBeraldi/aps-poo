package entities;

import java.time.LocalDate;

public class Caixa extends Funcionario{
    public Caixa(){
    }

    public Caixa(String nome, String cpf, double salario){
        super(nome, cpf, salario);
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    /**
     * Calcula a bonificação do empregado. Se a data atual for 31 de dezembro,
     * o salário do empregado será aumentado em 10%.
     *
     * @return O salário atualizado, com o acréscimo de 10% caso seja 31 de dezembro, ou o salário original se não for essa data.
     */
    public double bonificacao(){
        LocalDate today = LocalDate.now();
        if (today.getDayOfMonth() == 31 && today.getMonthValue() == 12) {
            this.salario += this.salario * 0.1;
        }
        return this.salario;
    }
}
