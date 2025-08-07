package br.com.bruno.biblioteca.sistema;

import java.util.HashMap;

public class Emprestimo {
    HashMap<Livro, Membro> emprestimos =  new HashMap();
    private boolean disponivel;

    public Emprestimo(){

    }

    /**
     * Verifica a disponibilidade do livro
     * @param livro
     * @return
     */
    public boolean isDisponivel(Livro livro){
        return !emprestimos.containsKey(livro);
    }

    public Membro getComodatario(Livro livro){
        return emprestimos.get(livro);
    }

    public void setEmprestimos(Livro livro, Membro membro){
        this.emprestimos.put(livro, membro);
    }

    public void setDevolucao(Livro livro){
        if(this.emprestimos.containsKey(livro)){
            this.emprestimos.remove(livro);
        }
    }

    @Override
    public String toString() {
        if(emprestimos.isEmpty()) System.out.println("Não existem empréstimos!");

        StringBuilder sb = new StringBuilder();
        for(Livro livro : emprestimos.keySet()){
            sb.append("Livro: ").append(livro.getTitulo()).append(" ,emprestado para: ").append(emprestimos.get(livro).getNome()).append("\n");
        }
        return sb.toString();
    }
}
