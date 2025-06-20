package ed03;

/**
 * Representa um usuário do tipo administrador, com permissões de autenticação,
 * gerenciamento e registro de log no sistema.
 */
public class Administrador extends Usuario implements Autenticavel, Gerenciavel, Logavel {

    /**
     * Construtor da classe Administrador.
     * @param login Nome de login do administrador.
     * @param senha Senha do administrador.
     */
    public Administrador(String login, String senha) {
        super(login, senha);
    }

    /**
     * Autentica o administrador comparando a senha fornecida com a senha atual.
     * @param senha Senha fornecida para autenticação.
     * @return {@code true} se a senha for correta, {@code false} caso contrário.
     */
    @Override
    public boolean autenticar(String senha) {
        return senha.equals(getSenha());
    }

    /**
     * Altera a senha atual do administrador.
     * @param novaSenha Nova senha a ser definida.
     */
    @Override
    public void alterarSenha(String novaSenha) {
        setSenha(novaSenha);
    }

    /**
     * Bloqueia o usuário administrador.
     * Exibe uma mensagem de bloqueio no console.
     */
    @Override
    public void bloquearUsuario() {
        System.out.println("Usuário bloqueado com sucesso.");
    }

    /**
     * Registra uma operação realizada pelo administrador.
     * @param operacao Descrição da operação realizada.
     */
    @Override
    public void registrarLog(String operacao) {
        System.out.println("Log registrado: " + operacao);
    }
}
