package ed03;

/**
 * Representa um relatório em formato PDF, contendo autor e número de páginas.
 */
public class RelatorioPDF implements Imprimivel {
    private String autor;
    private int numeroPaginas;

    /**
     * Construtor do relatório PDF.
     * @param autor Nome do autor do relatório.
     * @param numeroPaginas Número total de páginas do relatório.
     */
    public RelatorioPDF(String autor, int numeroPaginas) {
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * Imprime os detalhes do relatório.
     */
    @Override
    public void imprimir() {
        System.out.println("Autor: " + this.autor);
        System.out.println("Total de páginas: " + this.numeroPaginas);
    }
}

