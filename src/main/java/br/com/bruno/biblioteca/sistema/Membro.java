package br.com.bruno.biblioteca.sistema;

import br.com.bruno.biblioteca.utilitarios.ValidacaoUtil;

public class Membro {
        ValidacaoUtil valida;

        private String nome;
        private int id;

        public Membro(){

        }

        public String getNome(){
            return this.nome;
        }

        public void setNome(String nome){
            valida.isNullOrEmpty(nome);
            this.nome = nome.trim();
        }

        public int id(){
            return this.id;
        }

        public void setId(int id){
            valida.validacaoId(id);
            this.id = id;
        }
}
