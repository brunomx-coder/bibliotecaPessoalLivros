package br.com.bruno.biblioteca.sistema;

import br.com.bruno.biblioteca.utilitarios.ValidacaoUtil;

public class Membro {
        ValidacaoUtil valida;

        private String nome;
        private int id;

        public Membro(String nome, int id){
            this.setNome(nome);
            this.setId(id);
        }

        public String getNome(){
            return this.nome;
        }

        private void setNome(String nome){
            valida.isNullOrEmpty(nome);
            this.nome = nome.trim();
        }

        public int id(){
            return this.id;
        }

        private void setId(int id){
            valida.validacaoId(id);
            this.id = id;
        }
}
