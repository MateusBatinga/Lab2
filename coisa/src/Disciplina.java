import java.util.*;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;
    private double total;


    public Disciplina(String disciplina) {
        this.nomeDisciplina = disciplina;
        this.notas = new double[]{0,0,0,0};
    }

    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota] = valorNota;
    }

    public boolean aprovado(){
        return this.total/4 >= 7.0;
    }

    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.horasEstudo + "" + (this.total/4) + this.notas;
    }
}
