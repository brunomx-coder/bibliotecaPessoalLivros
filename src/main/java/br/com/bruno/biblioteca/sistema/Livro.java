package br.com.bruno.biblioteca.sistema;

import br.com.bruno.biblioteca.utilitarios.ValidacaoUtil;

public class Livro {
    ValidacaoUtil valida;
    Membro membro;

    private String titulo;
    private String autor;
    private String isbn;
    private int anoPublicacao;
    private boolean disponivel;



    public Livro(String isbn){
        this.setIsbn(isbn);
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo){
        valida.isNullOrEmpty(titulo);
        this.titulo = titulo.trim();
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String autor){
        valida.isNullOrEmpty(autor);
        this.autor = autor.trim();
    }

    public String getIsbn(){
        return this.isbn;
    }

    public void setIsbn(String isbn){
        valida.isNullOrEmpty(isbn);
        this.isbn = isbn.trim();
    }

    public int getAnoPublicacao(){
        return this.anoPublicacao;
    }

    public void setAnoPublicacao(int ano){
        valida.validacaoAno(ano);
        this.anoPublicacao = ano;
    }

//    public boolean isDisponivel(){
//        return this.membro == null;
//    }
}
