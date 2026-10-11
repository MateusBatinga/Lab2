import java.util.Arrays;

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
        String[] baseResumos = new String[conta()];
        for (int i = 0; i < conta(); i++){
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
    public int conta(){
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

    /**
     * Busca uma determinada palavra nos resumos cadastrados
     *
     * @param chaveDeBusca a palavra a ser pesquisada em todos os resumos
     * @return array com os temas que possuem a chave de busca presente no resumo, em ordem lexicográfica.
     */
    public String busca(String chaveDeBusca) {
        int cont = 0;
        String[] saidaTempor = new String[conta()];
        for(int i = 0; i < posicao; i++){
            String[] conteudoTempor = resumos[i].getConteudo().toLowerCase().split(" ");
                    for(String palavra:conteudoTempor){
                        if(palavra.toLowerCase().equals(chaveDeBusca.toLowerCase())) {
                            saidaTempor[i] = resumos[i].getTema();
                            cont++;
                        }
            }
        }
        String[] saidaDefi = new String[cont];
        for(int i = 0; i < cont; i++){
             saidaDefi[i] = saidaTempor[i];
        }
        Arrays.sort(saidaDefi);
        return Arrays.toString(saidaDefi);
    }

}