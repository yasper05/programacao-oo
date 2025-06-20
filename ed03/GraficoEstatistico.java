package ed03;

/**
 * Representa um gráfico estatístico com título e tipo de gráfico.
 */
public class GraficoEstatistico implements Imprimivel {
    private String titulo;
    private String tipoGrafico;

    /**
     * Construtor do gráfico estatístico.
     * @param titulo Título do gráfico.
     * @param tipoGrafico Tipo do gráfico (ex: barra, linha).
     */
    public GraficoEstatistico(String titulo, String tipoGrafico) {
        this.titulo = titulo;
        this.tipoGrafico = tipoGrafico;
    }

    /**
     * Imprime os detalhes do gráfico estatístico.
     */
    @Override
    public void imprimir() {
        System.out.println("Gráfico do tipo: " + this.tipoGrafico.toUpperCase());
        System.out.println("Título: " + this.titulo.toUpperCase());
    }
}

