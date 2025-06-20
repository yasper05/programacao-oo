package ed04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por realizar operações de persistência de dados
 * (salvar e carregar contatos) utilizando arquivo de texto.
 */
public class ContatoDAO {

    /**
     * Salva um único contato no arquivo "contatos.txt".
     * O contato é salvo no formato CSV, sendo adicionado ao final do arquivo.
     *
     * @param contato o contato a ser salvo
     */
    public void salvar(Contato contato) {
        List<String> lista = new ArrayList<>();
        lista.add(contato.toCSV()); // Converte o contato para formato CSV

        try {
            Files.write(Paths.get("contatos.txt"), lista, StandardOpenOption.APPEND); // Escreve no arquivo adicionando ao final
        } catch (IOException e) {
            System.out.println("Erro ao salvar contato: " + e.getMessage()); // Exibe mensagem de erro
        }
    }

    /**
     * Salva uma lista completa de contatos no arquivo "contatos.txt".
     * Este método sobrescreve o conteúdo existente do arquivo.
     *
     * @param contatos lista de contatos a serem salvos
     */
    public void salvar(List<Contato> contatos) {
        List<String> linhas = new ArrayList<>(); // Lista com todas as linhas

        for (Contato c : contatos) {
            linhas.add(c.toCSV()); // Converte todos os contatos para CSV
        }

        try {
            Files.write(Paths.get("contatos.txt"), linhas); // Salva todas as linhas no arquivo, substituindo o conteúdo existente
        } catch (IOException e) {
            System.out.println("Erro ao salvar lista de contatos: " + e.getMessage()); // Exibe mensagem de erro
        }
    }

    /**
     * Carrega os contatos do arquivo "contatos.txt".
     * Este metodo ainda não está implementado e retorna uma lista vazia.
     *
     * @return lista vazia de contatos
     */
    public List<Contato> carregar() {
        return new ArrayList<>();
    }
}