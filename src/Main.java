import entities.Analista;
import entities.Programador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Analista
        float[] valores = new float[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor do " + (i + 1) + "o Projeto: ");
            valores[i] = scanner.nextFloat();
        }

        System.out.print("Qual o nome do(a) Analista? ");
        String nomeAnalista = scanner.next();
        System.out.print("Qual o registro de Matricula do(a) Analista? ");
        String matriculaAnalista = scanner.next();
        // Instanciando o Analista
        Analista analista =  new Analista(nomeAnalista, matriculaAnalista, valores);

        // Programador
        System.out.print("Qual o nome do(a) Programador(a)? ");
        String nomeProgramador = scanner.next();
        System.out.print("Qual o registro de Matricula do(a) Programador(a)? ");
        String matriculaProgramador = scanner.next();
        System.out.print("Quantidade de Horas trabalhadas do(a) Programador(a)? ");
        float horasTrabalhadasProgramador = scanner.nextFloat();
        System.out.print("Valor de Horas do(a) Programador(a)? ");
        float valorHorasProgramador = scanner.nextFloat();
        // Instanciando o Programador
        Programador programador = new Programador(nomeProgramador, matriculaProgramador, horasTrabalhadasProgramador, valorHorasProgramador);

        System.out.println(analista.toString() + " Possui um salario de: " + analista.calculaSalario());
        System.out.println(programador.toString() + " Possui um salario de: " + programador.calculaSalario());

        scanner.close();
    }
}
