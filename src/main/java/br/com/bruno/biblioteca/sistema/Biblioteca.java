package br.com.bruno.biblioteca.sistema;

import br.com.bruno.biblioteca.utilitarios.UtilitariosBiblioteca;
import br.com.bruno.biblioteca.utilitarios.ValidacaoUtil;

import java.util.List;
import java.util.ArrayList;
import java .util.Scanner;

public class Biblioteca extends UtilitariosBiblioteca{
    Scanner input = new Scanner(System.in);
    ValidacaoUtil valida;
    List<Livro> prateleira;
    List<Membro> membros;
    Livro novoLivro;
    Livro livroAtual = null;
    Membro novoMembro;
    Emprestimo sistemaEmprestimo;

    public Biblioteca(){
        prateleira = new ArrayList<>();
        this.valida = new ValidacaoUtil();
        this.sistemaEmprestimo = new Emprestimo();
    }

    public void adicionarLivro(){
        novoLivro = infoCadastro();
        prateleira.add(novoLivro);
        System.out.println("Livro adicionado com sucesso!!");
    }

    public void cadastrarMembro(){
        novoMembro = infoCadastroMembro();
        this.membros.add(novoMembro);
        System.out.println("Membro adicionbado!");
    }

    public void listarMembors(){
        if(valida.validaPrateleira(membros)){
            System.out.println("Não existem membros cadastrados!!");
        }

        for(Membro membro: membros){
            System.out.println(membro.toString());
        }
    }

    public void listarLivros(){
        if(valida.validaPrateleira(prateleira)) {
            System.out.println("A prateleira ainda não possui livros!!");
        }

        for(Livro livro: prateleira){
            System.out.println(livro.toString());
        }
    }

    public void buscarLivroPorTitulo(String titulo){
        if(valida.validaPrateleira(prateleira)) System.out.println("A prateleira está vazia!");

        for(Livro livro: prateleira){
            if(livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println(livro.toString());
            }
        }
    }

    public void buscarPorAutor(String autor){
        boolean livroEncontrado = false;
        if(valida.validaPrateleira(prateleira)) {
            System.out.println("A prateleira está vazia!");
            return;
        }

        for(Livro livro: prateleira){
            if(livro.getAutor().equalsIgnoreCase(autor)){
                System.out.println(livro.toString());
                livroEncontrado = true;
            }
        }
        if(!livroEncontrado){
            System.out.println("Nenhum livro encontrado para o autor!");
        }
    }

    public Livro buscarPorIsbn(String isbn){
        if(valida.validaPrateleira(prateleira)) {
            System.out.println("A prateleira está vazia!");
            return null;
        };

        for(Livro livro: prateleira){
            if(livro.getTitulo().equalsIgnoreCase(isbn)) {
                return livro;
            }
        }

        System.out.println("Livro com isbn: " + isbn + " não encontrado");
        return null;
    }

    public void emprestarLivro(String isbn){
        livroAtual = buscarPorIsbn(isbn);

        if(livroAtual == null){
            System.out.println("O livro não foi encontrado!");
            return;
        }
        if(!sistemaEmprestimo.isDisponivel(livroAtual)){
            System.out.println("O livro não está disponível!!");
            return;
        }

        System.out.println("Insira o nome do membro pra quem deseja emprestar: ");
        String nomeMembro = input.nextLine();

        Membro membroEncontrado = null;
        for (Membro membro : this.membros) {
            if (membro.getNome().equalsIgnoreCase(nomeMembro)) {
                membroEncontrado = membro;
                break;
            }
        }

        if (membroEncontrado == null) {
            System.out.println("Membro não encontrado. Adicionando novo membro...");
            membroEncontrado = new Membro(nomeMembro);
            this.membros.add(membroEncontrado);
        }

        sistemaEmprestimo.setEmprestimos(livroAtual, membroEncontrado);
        System.out.println("Empréstimo realizado com sucesso para " + membroEncontrado.getNome() + ".");

    }

    public void devolverLivro(String isbn){
        livroAtual = buscarPorIsbn(isbn);

        if(livroAtual == null){
            System.out.println("O livro não foi encontrado!");
            return;
        }

        sistemaEmprestimo.setDevolucao(livroAtual);


    }

    public void removerLivro(String isbn){
        livroAtual = buscarPorIsbn(isbn);
        if(livroAtual == null){
            System.out.println("O livro não foi encontrado!");
        }

        if(prateleira.remove(livroAtual)){
            System.out.println("Livro removido com sucesso.");
        }else{
            System.out.println("Livro não encontrado na prateleira.");
        }
    }

}
