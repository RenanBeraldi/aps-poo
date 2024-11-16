package entities;

import java.time.LocalDate;

public class Gerente extends Funcionario{
    public String senha = "12345";
    public int funcionariosGerenciados;

    public Gerente(){
    }

    public Gerente(String nome, String cpf, Double salario, String senha, int funcionariosGerenciados){
        super(nome, cpf, salario);
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.senha = senha;
        this.funcionariosGerenciados = funcionariosGerenciados;
    }

    /**
     * Calcula a bonificação do empregado. Se a data atual for 31 de dezembro,
     * o salário do empregado será aumentado em 15%.
     *
     * @return O salário atualizado, com o acréscimo de 15% caso seja 31 de dezembro, ou o salário original se não for essa data.
     */
    public double bonificacao(){
        LocalDate today = LocalDate.now();
        if (today.getDayOfMonth() == 31 && today.getMonthValue() == 12) {
            this.salario += this.salario * 0.15;
        }
        return this.salario;
    }

    /**
     * Esse metodo faz a autenticacao do usuario, caso ele seja gerente
     *
     * @param senha Senha digitada pelo usuário
     *
     * @return true caso as senhas sejam compativeis, se nao bloqueia o acesso
     */
    public boolean autentica(String senha) {
        if (this.senha.equals(senha)){
            return true;
        } else {
            return false;
        }
    }
}
