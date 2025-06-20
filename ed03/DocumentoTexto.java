package ed03;

/**
 * Representa um documento de texto com título e conteúdo.
 */
public class DocumentoTexto implements Imprimivel {
    private String titulo;
    private String conteudo;

    /**
     * Construtor do documento de texto.
     * @param titulo Título do documento.
     * @param conteudo Conteúdo textual do documento.
     */
    public DocumentoTexto(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    /**
     * Imprime os detalhes do documento.
     */
    @Override
    public void imprimir() {
        System.out.println(this.titulo);
        System.out.println(this.conteudo);
    }
}

