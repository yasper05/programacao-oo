package ed03.ProgramaFolha;

public class ProgramaFolha {
    public static void main(String[] args) {
        FuncionarioCLT carlos = new FuncionarioCLT("Carlos", 2000);
        FuncionarioTemporario ana = new FuncionarioTemporario("Ana", 2000);

        carlos.exibirDados();
        System.out.println("Salário Final: " + carlos.calcularSalario() + "\n");

        ana.exibirDados();
        System.out.println("Salário Final: " + ana.calcularSalario());
    }
}