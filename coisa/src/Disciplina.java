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
    private int[] pesos;
    private double media;

    /**
     * Constrói um objeto que armazena horas de estudo e notas de determinada disciplina.
     * por padrão quatro notas que iniciam zeradas, e pesos equivalentes por disciplina
     *
     * @param disciplina o nome da disciplina referenciada.
     */
    public Disciplina(String disciplina) {
        this.nomeDisciplina = disciplina;
        this.notas = new double[]{0,0,0,0};
        this.pesos = new int[]{1,1,1,1};
        this.horasEstudo = 0;
    }

    /**
     * Constroi um objeto que armazena notas e horas de estudo, mas uma quantidade definida de notas e pesos equivalentes.
     *
     * @param disciplina nome da materia.
     * @param numNotas quantdades de notas da disciplina
     */
    public Disciplina(String disciplina, int numNotas) {
        nomeDisciplina = disciplina;
        this.notas = new double[numNotas];
        this.pesos = new int[numNotas];
        horasEstudo = 0;
        for(int i = 0; i < numNotas; i++) {
            notas[i] = 0;
            pesos[i] = 1;
        }
    }

    /**
     * Constroi um obejto com as horas estudadas e as notas e seus respectivos pesos.
     *
     * @param disciplina nome da materia.
     * @param numNotas qunatidade de notas.
     * @param pesos das notas.
     */
    public Disciplina(String disciplina, int numNotas, int[] pesos) {
        nomeDisciplina = disciplina;
        this.notas = new double[numNotas];
        this.pesos = pesos;
        for(int i = 0; i < notas.length; i++) {
            this.notas[i] = 0;
        }
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
        total = valorNota * pesos[nota-1];
    }

    /**
     * verifica se o aluno for aprovado.
     *
     * @return true se a media for > ou = a 7
     */
    public boolean aprovado(){
        int pesoTotal = 0;
        for(int i = 0; i < pesos.length; i++){
            pesoTotal += pesos[i];
        }
        this.media = (int) (total/pesoTotal);
        return total/pesoTotal >= 7.0;
    }

    /**
     * Retorna a representação escrita da disciplina.
     *
     * @return nome, horas de estudo, média e notas separadas por espaço e com o array de notas.
     */
    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.horasEstudo + " " + media + " " + Arrays.toString(notas);
    }
}
