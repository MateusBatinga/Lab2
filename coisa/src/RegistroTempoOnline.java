public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnline;
    private int tempoOnlineEsperado;

    public RegistroTempoOnline(String materia) {this.nomeDisciplina = materia;}

    public RegistroTempoOnline(String materia, int horas) {
        this.tempoOnlineEsperado = horas;
        this.nomeDisciplina = materia;
    }


    public void adicionaTempoOnline(int tempo) {
        this.tempoOnline += tempo;
    }

    public boolean atingiuMetaTempoOnline() {
        return tempoOnline >= tempoOnlineEsperado;
    }

    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.tempoOnline + "/" + this.tempoOnlineEsperado;
    }
}
