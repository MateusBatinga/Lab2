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
     * Cria e adiciona os resumos a partir do tema e o conteudo.
     *
     * @param tema tema do resumo.
     * @param conteudo conteudo do tema.
     */
    public void adiciona(String tema, String conteudo){
        this.resumos[posicao % this.resumos.length] = new Resumo(tema, conteudo);

        posicao++;
    }

    /**
     * Retorna resumos cadastrados na forma estruturada de expor;
     *
     * @return tema e conteudo dos resumos, separados por ":".
     */
    public String[] pegaResumos(){
        String[] baseResumos = new String[pegaPosicao()];
        for (int i = 0; i < pegaPosicao(); i++){
            baseResumos[i] = this.resumos[i].getTema() + ": " + this.resumos[i].getConteudo();
        }
        return baseResumos;
    }

    /**
     * organiza a forma de saida dos resumos e os retorna.
     *
     * @return Retorna a quantidade de resumo cadastrados
     */
    public String imprimeResumos(){
        for(int i = 0; i < posicao; i++){
            if(i == 0){this.saidaTemas = this.resumos[i].getTema();}
            else{this.saidaTemas += " | " + this.resumos[i].getTema();}
        }
        return "- " + posicao + " resumo(s) cadastrado(s) \n" + "- " + this.saidaTemas;
    }

    /**
     * Conta a quantidade atual de resumo adicionado.
     *
     * @return a posicao do resumo.
     */
    public int pegaPosicao(){
        if(posicao >= this.resumos.length){return this.resumos.length;}
        else{return posicao;}

    }

    /**
     * Verifica se há resumo ou não.
     *
     * @param tema do resumo verificado.
     * @return True caso tenha o resumo e caso siga "operando" (não tem)! false
     */
    public boolean temResumo(String tema){
        for(int i = 0; i < posicao; i++){
            if(tema.equals(this.resumos[i].getTema())){return true;}
        }
        return false;
    }

}