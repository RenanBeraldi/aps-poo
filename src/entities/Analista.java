package entities;

public class Analista extends Empregado{
    private float[] valorPorProjeto = new float[5];

    public Analista(){
    }

    public Analista(String nome, String matricula, float[] valorPorProjeto) {
        super(nome, matricula);
        this.nome = nome;
        this.matricula = matricula;
        this.valorPorProjeto = valorPorProjeto;
    }

    @Override
    public String toString() {
        return "Analista " + nome + " de Registro " + matricula;
    }

    /**
     * Este metodo calcula o salario do Analista, com base no valor de todos os projetos concluídos
     *
     * @return O valor total do analista
     */
    public float calculaSalario() {
        float valorTotalProjetos = 0;
        for (int i = 0; i < valorPorProjeto.length; i++) {
            valorTotalProjetos += valorPorProjeto[i];
        }

        return valorTotalProjetos;
    }
}
