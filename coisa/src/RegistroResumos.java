/**
 * Representa o registro dos resumos do aluno.
 *
 * @author Mateus Batinga Medeiros.
 */
public class RegistroResumos {

    private Resumo[] resumos;
    private int posicao;
    private String saidaTemas;

    /**
     * Constrói o registrador de resumos.
     *
     * @param numeroDeResumos quantidade de resumos maximos.
     */
    public RegistroResumos(int numeroDeResumos){
        this.resumos = new Resumo[numeroDeResumos];
        this.posicao = 0;
    }

    /**
     * Cria e adiciona os resumos a partri do tema e o resumo.
     *
     * @param tema tema do resumo.
     * @param conteudo conteudo do tema.
     */
    public void adiciona(String tema, String conteudo){
        this.resumos[posicao % this.resumos.length] = new Resumo(tema, conteudo);

        posicao++;
    }

    /**
     *
     *
     * @return
     */
    public String[] pegaResumos(){
        String[] baseResumos = new String[conta()];
        for (int i = 0; i < conta(); i++){
            baseResumos[i] = this.resumos[i].getTema() + ": " + this.resumos[i].getConteudo();
        }
        return baseResumos;
    }
    public String imprimeResumos(){
        for(int i = 0; i < posicao; i++){
            if(i == 0){this.saidaTemas = this.resumos[i].getTema();}
            else{this.saidaTemas += " | " + this.resumos[i].getTema();}
        }
        return "- " + posicao + " resumo(s) cadastrado(s) \n" + "- " + this.saidaTemas;
    }
    public int conta(){
        if(posicao >= this.resumos.length){return this.resumos.length;}
        else{return posicao;}

    }
    public boolean temResumo(String tema){
        for(int i = 0; i < posicao; i++){
            if(tema.equals(this.resumos[i].getTema())){return true;}
        }
        return false;
    }

}