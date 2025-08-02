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
}
