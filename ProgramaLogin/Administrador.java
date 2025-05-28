package ed03.ProgramaLogin;

public class Administrador extends Usuario implements Autenticavel {
    public Administrador(String login, String senha) {
        super(login, senha);
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}
