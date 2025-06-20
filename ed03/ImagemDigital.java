package ed03;

/**
 * Representa uma imagem digital com nome de arquivo e resolução.
 */
public class ImagemDigital implements Imprimivel {
    private String nomeArquivo;
    private String resolucao;

    /**
     * Construtor da imagem digital.
     * @param nomeArquivo Nome do arquivo da imagem.
     * @param resolucao Resolução da imagem (ex: 1920x1080).
     */
    public ImagemDigital(String nomeArquivo, String resolucao) {
        this.nomeArquivo = nomeArquivo;
        this.resolucao = resolucao;
    }

    /**
     * Imprime os detalhes da imagem digital.
     */
    @Override
    public void imprimir() {
        System.out.println("Arquivo: " + this.nomeArquivo);
        System.out.println("Resolução: " + this.resolucao);
    }
}

