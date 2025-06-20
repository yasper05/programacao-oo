//package ed03;
//
//public class ProgramaImpressao {
//    public static void main(String[] args) {
//        DocumentoTexto documento = new DocumentoTexto("DOCUMENTO DE APRESENTAÇÃO", "Este é o conteúdo do documento.");
//        ImagemDigital imagem = new ImagemDigital("paisagem.jpg", "1920x1080");
//        GraficoEstatistico grafico = new GraficoEstatistico("distribuição de vendas", "barra");
//        RelatorioPDF relatorio = new RelatorioPDF("João Silva", 12);
//
//        documento.imprimir();
//        System.out.println();
//        imagem.imprimir();
//        System.out.println();
//        grafico.imprimir();
//        System.out.println();
//        relatorio.imprimir();
//    }
//}

package ed03;

/**
 * Classe principal que realiza a impressão de diferentes tipos de conteúdos.
 * Instancia objetos que implementam a interface {@code Imprimivel} e chama seus métodos de impressão.
 */
public class ProgramaImpressao {

    /**
     * Metodo principal que executa o programa.
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        DocumentoTexto documento = new DocumentoTexto("DOCUMENTO DE APRESENTAÇÃO", "Este é o conteúdo do documento.");
        ImagemDigital imagem = new ImagemDigital("paisagem.jpg", "1920x1080");
        GraficoEstatistico grafico = new GraficoEstatistico("distribuição de vendas", "barra");
        RelatorioPDF relatorio = new RelatorioPDF("João Silva", 12);

        documento.imprimir();
        System.out.println();
        imagem.imprimir();
        System.out.println();
        grafico.imprimir();
        System.out.println();
        relatorio.imprimir();
    }
}

