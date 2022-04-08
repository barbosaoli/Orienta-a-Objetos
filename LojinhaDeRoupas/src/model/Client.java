package model;

/**
 * Estender(Heran�a) ao Client da classe pai(Person)
 * @author Lucas & Gustavo
 * @version 1.0 (Abril 2022)
 */
public class Client extends Person {
	private String dataPrimC;
	private String endereco;
	

	/**
	 * Construtor de Client
	 * @param name
	 * @param endereco
	 * @param dataPrimC
	 * @param numID
	 * @param cPF
	 * @param numTel
	 */
	public Client(String name, String endereco, String dataPrimC, int numID, String cPF, Telefone numTel) {
		super(name, numID, cPF, numTel);
		this.dataPrimC = dataPrimC;
		this.endereco = endereco;
	}

	public String getDataPrimC() {
		return dataPrimC;
	}

	public void setDataPrimC(String dataPrimC) {
		this.dataPrimC = dataPrimC;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	

	
}