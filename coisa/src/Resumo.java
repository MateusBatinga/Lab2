/**
 * representa os resumso criados na classe "RegistroResumos".
 *
 * @author Mateus Batinga Medeiros
 */

public class Resumo {
    private String tema;
    private String resumo;

    /**
     * constrói o objeto da classe resumo.
     *
     * @param tema que compõe o resumo.
     * @param resumo conteudo, corpo do resumo.
     */
    public Resumo(String tema, String resumo) {
        this.tema = tema;
        this.resumo = resumo;
    }

    /**
     * Pega o tema do obejto mencionado.
     *
     * @return tema do objeto de Resumo.
     */
    public String getTema() {
        return this.tema;
    }

    /**
     * Pega o conteudo doresumo do objeto.
     *
     * @return o conteudo associado ao resumo solicitado
     */
    public String getConteudo() {
        return resumo;
    }
    //public String[] busca(String chaveDeBusca) {}
}
