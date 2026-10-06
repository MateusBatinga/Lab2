public class Descanso {
    private int horasDescanso;
    private int numeroSemana;

    /* Construtor do objeto "Descanso".
     *
     */
    public Descanso() {
        this.horasDescanso = 0;
        this.numeroSemana = 1;
    }
    public void defineHorasDescanso(int valor) {
        this.horasDescanso = valor;
    }

    public void defineNumeroSemanas(int valor) {
        this.numeroSemana = valor;
    }

    public String getStatusGeral() {
        if ((this.horasDescanso / this.numeroSemana) < 26){
            return "cansado";
        }else {
            return "descansado";
        }
    }

}
// Falta fazer apenas o javadoc, se elas pedirem.