public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;
    private double total;


    public Disciplina(String disciplina) {
        this.nomeDisciplina = disciplina;
        this.notas = new double[]{0,0,0,0};
        this.horasEstudo = 0;
    }

    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota-1] = valorNota;
        total += valorNota;
    }

    public boolean aprovado(){
        return this.total/4 >= 7.0;
    }

    @Override
    public String toString() {
        double media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
        return this.nomeDisciplina + " " + this.horasEstudo + " " + media + " " + "[" + notas[0] + "," + " " + notas[1] + "," + " " + notas[2] + "," + " " + notas[3] + "]";
    }
}
