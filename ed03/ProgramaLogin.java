package ed03;

/**
 * Classe principal que simula operações de login, autenticação, alteração de senha e registro de log
 * para diferentes tipos de usuários.
 */
public class ProgramaLogin {

    /**
     * Metodo principal que executa a simulação de login e ações dos usuários.
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        Administrador adm = new Administrador("admin", "admin123");
        Visitante vis = new Visitante("guest", "qualquer");
        Cliente cli = new Cliente("joao", "segredo123");

        adm.exibirLogin();
        if (adm.autenticar("admin123")) {
            System.out.println("Autenticação com 'admin123': true");
        }
        if (!adm.autenticar("errada")) {
            System.out.println("Autenticação com 'errada': false");
        }

        adm.alterarSenha("dkoaskd");
        System.out.println("Senha alterada com sucesso");
        adm.bloquearUsuario();
        adm.registrarLog("Exclusão de conta");
        System.out.println();

        vis.exibirLogin();
        System.out.println();

        cli.exibirLogin();
        if (cli.autenticar("segredo123")) {
            System.out.println("Autenticação com 'segredo123': true");
        }
        if (!cli.autenticar("12345")) {
            System.out.println("Autenticação com '12345': false");
        }
    }
}