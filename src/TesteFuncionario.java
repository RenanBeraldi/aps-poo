import entities.Caixa;
import entities.Gerente;

import java.util.Scanner;

public class TesteFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String cargo, senha;

        Gerente gerente = new Gerente("Joao", "12345678900", 7000.0, "12345", 19);
        Caixa caixa = new Caixa("Daniel", "98765432100", 3000.00);

        System.out.print("Qual o cargo do funcionario? (Gerente/Caixa): ");
        cargo = scanner.nextLine();
        // Se o cargo for "Gerente"
        if (cargo.trim().toLowerCase().equals("gerente")) {
            System.out.print("Qual o senha de acesso? ");
            senha = scanner.nextLine();
            if (gerente.autentica(senha)) {
                System.out.println("O gerente " + gerente.nome +
                        " gerencia " + gerente.funcionariosGerenciados + " funcionarios");
            } else {
                System.out.println("Acesso negado");
            }
        }
        // Se o cargo for "Caixa"
        else if (cargo.trim().toLowerCase().equals("caixa")) {
            System.out.println("O funcionario " + caixa.nome + " esta ativo");
        } else {
            System.out.println("Digite um cargo valido");
        }

        scanner.close();
    }
}
