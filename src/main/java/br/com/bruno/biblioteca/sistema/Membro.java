package br.com.bruno.biblioteca.sistema;

import br.com.bruno.biblioteca.utilitarios.ValidacaoUtil;

public class Membro {
        ValidacaoUtil valida = new ValidacaoUtil();

        private String nome;
        static private int id = 0;

        public Membro(String nome, int id){
            this.setNome(nome);
            this.id +=1;
        }

        public String getNome(){
            return this.nome;
        }

        private void setNome(String nome){
            valida.isNullOrEmpty(nome);
            this.nome = nome.trim();
        }

        public int getId(){
            return this.id;
        }

    @Override
    public String toString() {
        String mensagem = "Nome: " + this.getNome() + "\nId: " + this.getId();
        return mensagem;
    }
}
