package br.com.bruno.testes;

import br.com.bruno.biblioteca.sistema.Livro;

public class LivroTest {
    public static void main(String[] args) {
        //1º teste: Verificar atributos
        //Verificacao com dados corretos
        Livro livro = new Livro("1234687546", "O nome do vento", "Patrick Rothfuss", 1997);

        livro.toString();
        //Testes métodos
        System.out.println(livro.getTitulo());
        System.out.println(livro.getAutor());
        System.out.println(livro.getIsbn());
        System.out.println(livro.getAnoPublicacao());

    }

}
