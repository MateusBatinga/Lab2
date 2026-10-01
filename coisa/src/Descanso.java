public class Descanso {
    private int horasDescanso;
    private int numeroSemana;

    public Descanso() {
        this.horasDescanso = 0;
        this.numeroSemana = 0;
    }
    public static void defineHorasDescanso(int valor) {
        this.horasDescanso = valor;
    }

    public void defineNumeroSemanas(int valor) {
        this.numeroSemana = valor;
    }

    public String getStatusGeral() {
        if (horasDescanso/numeroSemana >= 26) {
            return "Descansado";
        } else {
            return "Cansado";
        }
    }

}
