/**
 * Representa a rotina de descanso de um(a) aluno(a).
 *
 * @author Mateus Batinga Medeiros.
 */
public class Descanso {
    private int horasDescanso;
    private int numeroSemana;

    /**
     * Constroi o objeto da classe: "Descanso", estado de descanso do aluno referenciado.
     * Começa cansado (0 horas de descanso e 0 semanas).
     *
     */
    public Descanso() {
        this.horasDescanso = 0;
        this.numeroSemana = 0;
    }

    /**
     * Define as horas descansadas.
     *
     * @param valor é a quantidade de horas de descanso.
     */
    public void defineHorasDescanso(int valor) {
        this.horasDescanso = valor;
    }

    /**
     * Define a quantidade de semanas descansadas.
     *
     * @param valor é a quantidade de semanas descansadas.
     */
    public void defineNumeroSemanas(int valor) {
        this.numeroSemana = valor;
    }

    /**
     * Verifica e exibe se o aluno está cansado.
     *
     * @return "cansado" se satisfazer a condição, em caso contrário retorna descansado.
     */
    public String getStatusGeral() {
        if ((this.numeroSemana == 0 ) || ((this.horasDescanso / this.numeroSemana) < 26)){
            return "cansado";
        }else {
            return "descansado";
        }
    }

}
