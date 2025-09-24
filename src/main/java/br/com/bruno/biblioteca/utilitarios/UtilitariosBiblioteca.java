package br.com.bruno.biblioteca.utilitarios;

import br.com.bruno.biblioteca.sistema.Livro;
import br.com.bruno.biblioteca.sistema.Membro;

import java.util.Scanner;

public class UtilitariosBiblioteca {
    Scanner input = new Scanner(System.in);

    public Livro infoCadastro(){
        String isbn, titulo, autor;
        int ano;

        System.out.println("Cadastro livro");
        System.out.println("Insira o isbn: ");
        isbn = input.nextLine();
        System.out.println("Insira o titulo do livro: ");
        titulo = input.nextLine();
        System.out.println("Insira o autor:");
        autor = input.nextLine();
        System.out.println("Insira o ano de publicação: ");
        ano = input.nextInt();
        input.nextLine();

        return new Livro(isbn, titulo, autor, ano);
    }

    public Membro infoCadastroMembro(){
        String nome;

        System.out.println("Cadastro membro!");
        System.out.println("Insira o nome do membro: ");
        nome = input.nextLine();

        return new Membro(nome);
    }
}
