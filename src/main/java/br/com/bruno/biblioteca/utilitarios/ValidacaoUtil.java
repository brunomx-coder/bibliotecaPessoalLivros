package br.com.bruno.biblioteca.utilitarios;

import br.com.bruno.biblioteca.sistema.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class ValidacaoUtil {

    /**
     * Verifica se o valor é nulo ou vazio;
     * @param var
     * @return boolean
     */
    public void isNullOrEmpty(String var){
        if(var == null || var.trim().isEmpty()){
            throw new IllegalArgumentException("O valor não pode ser nulo ou vazio!");
        }
    }

    /**
     *  Verifica se o ano digitado está entre 0 e 2025
     * @param ano
     */
    public void validacaoAno(int ano){
        if(ano < 0 && ano > 2025){
            throw new IllegalArgumentException("O numero digirado está incorreto.");
        }
    }

    public boolean validacaoId(int id){
        boolean condicao =  id < 2000 && id > 0001;
        return condicao;
    }

    public boolean validaPrateleira(List<?> prateleira){
        return prateleira.isEmpty();
    }
}
