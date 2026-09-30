public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;

    public Disciplina(String disciplina) {
        this.nomeDisciplina = disciplina;
        this.notas = new double[]{0,0,0,0};
        this.horasEstudo = 0;
    }

    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota] = valorNota;
    }

    public boolean aprovado(){
    }

    public String toString() {
    }

}
