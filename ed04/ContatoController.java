package ed04;

import java.util.ArrayList;
import java.util.List;


/**
 * Controlador principal da aplicação que gerencia os contatos.
 */
public class ContatoController {

    /**
     * Executa o loop principal da aplicação, exibindo o menu e manipulando ações do usuário.
     */
    public void executar() {
        List<Contato> contatos = new ArrayList<>();

        ContatoView view = new ContatoView();

        boolean saida = false;
        do {
            view.exibirMenu();
            int opt = view.lerOpcao();

            switch (opt) {
                case 1:
                    view.exibirListarContatos(contatos);
                    break;

                case 2:
                    Contato contatoPF = view.exibirAdicionarPessoaFisica();
                    contatos.add(contatoPF);
                    break;

                case 3:
                    Contato contatoPJ = view.exibirAdicionarPessoaJuridica();
                    contatos.add(contatoPJ);
                    break;

                case 4:
                    String identificador = view.exibirRemoverContato();
                    boolean removido = false;

                    for (Contato c : contatos) {

                        if (c instanceof PessoaFisica && ((PessoaFisica) c).getCpf().equals(identificador)) {  // - Se for Pessoa Física e CPF for igual ao informado
                            contatos.remove(c);
                            removido = true;
                            break;
                        }

                        else if (c instanceof PessoaJuridica && ((PessoaJuridica) c).getCnpj().equals(identificador)) { // - Se for Pessoa Jurídica e CNPJ for igual ao informado
                            contatos.remove(c);
                            removido = true;
                            break;
                        }
                    }

                    if (removido) {
                        System.out.println("Contato removido com sucesso!");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 5:
                    saida = true;
                    break;

                default:
                    //view.exibirMensagemErro();
            }
        } while (!saida);
    }


}
