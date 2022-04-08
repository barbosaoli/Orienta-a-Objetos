package controller;

import model.Telefone;

/**
 * Validador do CPF, CEP, Telefone e Data(Respectivamente)
 * @author Lucas & Gustavo
 * @version 1.0 (abril 2022)
 */
public class Validator {

	/**
	 * Validador Cpf
	 * @param cpf
	 * @return
	 */
    public static Boolean validaCpf(String cpf) {
        if (cpf.length() == 11 && !cpf.equals("00000000000") && !cpf.equals("11111111111") && !cpf.equals("22222222222")
                && !cpf.equals("33333333333") && !cpf.equals("44444444444") && !cpf.equals("55555555555")
                && !cpf.equals("66666666666") && !cpf.equals("77777777777") && !cpf.equals("88888888888")
                && !cpf.equals("99999999999")) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Validador Cep
     * @param cep
     * @return
     */
    public static Boolean validaCep(int cep) {
        if (cep < 10000000 || cep >= 99999999 || cep == 11111111 || cep == 22222222 || cep == 33333333
                || cep == 44444444 || cep == 55555555 || cep == 66666666 || cep == 77777777 || cep == 88888888) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Validador Telefone
     * @param telefone
     * @return
     */
    public static Boolean validaTelefone(Telefone telefone) {
        if (telefone.getDDD() <= 0 || telefone.getDDD() > 99 || telefone.getNumero() < 100000000
                || telefone.getNumero() > 999999999) {
            return false;
        } else {
            return true;
        }
    }

   
}