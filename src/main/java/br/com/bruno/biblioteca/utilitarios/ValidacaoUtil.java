package br.com.bruno.biblioteca.utilitarios;

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
}
