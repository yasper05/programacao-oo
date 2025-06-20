package ed04;

import java.util.List;
import java.util.Scanner;

/**
 * Classe responsável por interações com o usuário no terminal.
 * Exibe menus, lê entradas e apresenta informações dos contatos.
 */
public class ContatoView {

    /**
     * Exibe o menu principal da agenda.
     */
    public void exibirMenu() {
        System.out.println("=== Agenda ===");
        System.out.println("1. Listar contatos");
        System.out.println("2. Adicionar contato PF");
        System.out.println("3. Adicionar contato PJ");
        System.out.println("4. Remover contato");
        System.out.println("5. Sair");
        System.out.println();
    }

    /**
     * Lê a opção selecionada pelo usuário no menu.
     *
     * @return número da opção escolhida
     */
    public int lerOpcao() {
        Scanner teclado = new Scanner(System.in);

        System.out.println(">: ");
        return teclado.nextInt();
    }

    /**
     * Solicita ao usuário os dados de um novo contato do tipo Pessoa Física.
     *
     * @return objeto PessoaFisica com os dados informados
     */
    public Contato exibirAdicionarPessoaFisica() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== Novo Contato ===");
        System.out.print("Nome........: ");
        String nome = teclado.nextLine();

        System.out.print("Email.......: ");
        String email = teclado.nextLine();

        System.out.print("Telefone....: ");
        String telefone = teclado.nextLine();

        System.out.print("CPF.........: ");
        String cpf = teclado.nextLine();

        return new PessoaFisica(nome, email, telefone, cpf);
    }

    /**
     * Solicita ao usuário os dados de um novo contato do tipo Pessoa Jurídica.
     *
     * @return objeto PessoaJuridica com os dados informados
     */
    public Contato exibirAdicionarPessoaJuridica() {
        Scanner teclado = new Scanner(System.in);
        PessoaJuridica contato = new PessoaJuridica();

        System.out.println("=== Novo Contato ===");
        System.out.print("Nome........: ");
        contato.setNome(teclado.nextLine());

        System.out.print("Email.......: ");
        contato.setEmail(teclado.nextLine());

        System.out.print("Telefone....: ");
        contato.setTelefone(teclado.nextLine());

        System.out.print("CNPJ........: ");
        contato.setCnpj(teclado.nextLine());

        return contato;
    }

    /**
     * Exibe a lista de contatos cadastrados, com nome, email e telefone.
     *
     * @param contatos lista de contatos a serem exibidos
     */
    public void exibirListarContatos(final List<Contato> contatos) {
        System.out.println("=== Contatos ===");

        for (Contato contato : contatos) {
            System.out.printf("| %10s | %10s | %10s |\n", contato.getNome(),
                    contato.getEmail(),
                    contato.getTelefone());
        }
        System.out.println();
    }

    /**
     * Solicita ao usuário o CPF ou CNPJ do contato a ser removido.
     *
     * @return CPF ou CNPJ informado pelo usuário
     */
    public String exibirRemoverContato() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== Remover Contato ===");
        System.out.println("Digite o CPF/CNPJ do contato que deseja remover: ");
        return teclado.nextLine();
    }
}