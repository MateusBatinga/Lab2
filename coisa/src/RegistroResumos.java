public class RegistroResumos {

    private Resumo[] resumos;
    private int proximo;
    private String saidaTemas;

    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new Resumo[numeroDeResumos];
        this.proximo = 0;
    }
    public void adicionaResumo (String tema, String conteudo) {
    }

    public String[] pegaresumos () {}
    public String imprimeResumos () {}
    public int contaResumos () {}
    public boolean temResumo (String tema) {     }
}
