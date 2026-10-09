/**
 * Representa o registro de tempo online para disciplinas de um(a) aluno(a).
 *
 * @author Mateus Batinga Medeiros.
 */

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnline;
    private int tempoOnlineEsperado;

    /**
     * Constrói um objeto com as diciplinas de tempo padrão de 120 horas.
     *
     * @param materia nome da disciplina.
     */
    public RegistroTempoOnline(String materia) {
        this.nomeDisciplina = materia;
        this.tempoOnline = 0;
        this.tempoOnlineEsperado = 120;
    }

    /**
     * Constrói um objeto para registro de disciplina de tempo não padronizado.
     *
     * @param materia nome da disciplina.
     * @param horas horas totais da disciplina.
     */
    public RegistroTempoOnline(String materia, int horas) {
        this.tempoOnlineEsperado = horas;
        this.tempoOnline = 0;
        this.nomeDisciplina = materia;
    }

    /**
     * Adiciona tempo total gasto online na disciplina.
     *
     * @param tempo online gasto com a disciplina
     */
    public void adicionaTempoOnline(int tempo) {
        this.tempoOnline += tempo;
    }

    /**
     * Verifica se o tempo online foi esparado.
     *
     * @return True caso o tempo passado seja maior ou igual ao que é esparado.
     */
    public boolean atingiuMetaTempoOnline() {
        return tempoOnline >= tempoOnlineEsperado;
    }

    /**
     * Exibe a representação do tempo online registrado.
     *
     * @return nome da disciplina, tempo online e tempo online esperado; com espaços e "/".
     */
    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.tempoOnline + "/" + this.tempoOnlineEsperado;
    }
}
