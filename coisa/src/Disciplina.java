import java.util.Arrays;

/**
 * Representa o conjunto de notas e relações com horas de estudo
 * e aprovação para as disciplinas de determinado(a) aluno(a).
 *
 * @author Mateus Batinga Medeiros.
 */

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;
    private double total;

    /**
     * Constrói um objeto que armazena horas de estudo e notas de determinada disciplina.
     *
     * @param disciplina o nome da disciplina referenciada.
     */
    public Disciplina(String disciplina) {
        this.nomeDisciplina = disciplina;
        this.notas = new double[]{0,0,0,0};
        this.horasEstudo = 0;
    }

    /**
     * Cadastra as horas de estudo para a disciplina.
     *
     * @param horas a serem cadastradas no total de horas der estudo.
     */
    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }

    /**
     * Cadastra notas referentes a disciplina.
     *
     * @param nota ordem da nota a ser cadastrada.
     * @param valorNota nota a ser cadatsrada.
     */
    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota-1] = valorNota;
        total += valorNota;
    }

    /**
     * verifica se o aluno for aprovado.
     *
     * @return true se a media for > ou = a 7
     */
    public boolean aprovado(){
        return this.total/4 >= 7.0;
    }

    /**
     * Retorna a representação escrita da disciplina.
     *
     * @return nome, horas de estudo, média e notas separadas por espaço e com o array de notas.
     */
    @Override
    public String toString() {
        double media = total / 4;
        return this.nomeDisciplina + " " + this.horasEstudo + " " + media + " " + Arrays.toString(notas);
    }
}
