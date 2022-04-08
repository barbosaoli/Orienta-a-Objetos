package model;

/**
 * Classe-pai de funcionario/cliente
 * @author Lucas & Gustavo
 * @version 1.0 (abril 2022)
 */
public abstract class Person {
	protected String name;
	protected int numID;
	protected String CPF;
	protected Telefone numTel;
	
	/**
	 * Constructor de Person
	 * @param name
	 * @param numID
	 * @param cPF
	 * @param numTel
	 */
	public Person(String name, int numID, String cPF, Telefone numTel) {
		super();
		this.name = name;
		this.numID = numID;
		CPF = cPF;
		this.numTel = numTel;
	}

	public String getName() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
	}

	public int getNumID() {
		return numID;
	}

	public void setNumID(int numID) {
		this.numID = numID;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	/**
	 * Vai validar o CPF que o usuario colocar
	 * @param cpf
	 * @return verdadeiro ou falso
	 */
	public Boolean validaCpf(String cpf) {
		if (cpf.length() == 11 && !CPF.equals("00000000000") && !CPF.equals("11111111111") && !CPF.equals("22222222222")
				&& !CPF.equals("33333333333") && !CPF.equals("44444444444") && !CPF.equals("55555555555")
				&& !CPF.equals("66666666666") && !CPF.equals("77777777777") && !CPF.equals("88888888888")
				&& !CPF.equals("99999999999")) {
			return true;
		} else {
			return false;
		}

	}

	public Telefone getNumTel() {
		return numTel;
	}

	public void setNumTel(Telefone numTel) {
		this.numTel = numTel;
	}

}