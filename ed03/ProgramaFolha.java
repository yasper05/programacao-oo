package ed03;

/**
 * Classe principal para testar o sistema de folha de pagamento.
 */
public class ProgramaFolha {

    /**
     * Metodo principal que cria e exibe os dados dos funcionários.
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        FuncionarioCLT f1 = new FuncionarioCLT("Carlos", 2000);
        FuncionarioTemporario f2 = new FuncionarioTemporario("Ana", 2000);

        f1.exibirDados();
        System.out.println("Salário Final: " + f1.calcularSalario());

        System.out.println();

        f2.exibirDados();
        System.out.println("Salário Final: " + f2.calcularSalario());
    }
}

