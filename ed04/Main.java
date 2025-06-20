package ed04;

/**
 * Classe principal que contém o metodo main para iniciar a aplicação.
 */
public class Main {

    /**
     * Metodo principal que inicia a execução do programa.
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        ContatoController controller = new ContatoController();
        controller.executar();
    }
}
