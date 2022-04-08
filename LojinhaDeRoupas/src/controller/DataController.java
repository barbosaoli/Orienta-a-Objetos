package controller;

import model.*;

/**
 * Controlador de Data 
 * @author Lucas & Gustavo
 * @version 1.0 (abril 2022)
 */
public class DataController {
	private Data d = new Data();

	public DataController() {
		d.fillWithSomeData();
	}

	public Data getData() {
		return d;
	}

	public void setDados(Data d) {
		this.d = d;
	}

	public Client[] getClients() {
		return this.d.getClientes();
	}

	public int getAmountOfClients() {
		return this.d.getAmountOfClients();
	}

	public int getAmountOfEmployees() {
		return this.d.getAmountOfEmployees();
	}

	public Employee[] getEmployees() {
		return this.d.getEmployees();
	}


	public int getAmountOfStores() {
		return this.d.getAmountOfStores();
	}

	public Store[] getStores() {
		return this.d.setStore();
	}

	/**
	 * Cadastrar ou editar funcionarios 
	 * @param dadosFuncionarios
	 * @return Verdadeiro ou Falso
	 */
	public boolean inserirEditarFuncionarios(String[] dadosFuncionarios) {
		if (!dadosFuncionarios[3].matches("[0-9]+") || !dadosFuncionarios[4].matches("[0-9]+")
				|| !dadosFuncionarios[5].matches("[0-9]+") || !dadosFuncionarios[6].matches("[0-9]+")) {
			return false;
		} else {
			if (Validator.validaCpf(dadosFuncionarios[3]) && Validator.validaTelefone(
					new Telefone(Integer.parseInt(dadosFuncionarios[5]), Integer.parseInt(dadosFuncionarios[6])))) {

				Employee p = new Employee(dadosFuncionarios[1], dadosFuncionarios[2],
						Double.parseDouble(dadosFuncionarios[7]), dadosFuncionarios[3],
						Integer.parseInt(dadosFuncionarios[4]),
						new Telefone(Integer.parseInt(dadosFuncionarios[5]), Integer.parseInt(dadosFuncionarios[6])));

				d.insertEmployee(p, Integer.parseInt(dadosFuncionarios[0]));

				return true;
			} else {
				return false;
			}

		}
	}

	/**
	 * Cadastrar ou editar clientes
	 * @param dadosClientes
	 * @return Verdadeiro ou Falso
	 */
	public boolean inserirEditarClientes(String[] dadosClientes) {
		if (!dadosClientes[4].matches("[0-9]+") || !dadosClientes[5].matches("[0-9]+")
				|| !dadosClientes[6].matches("[0-9]+")) {
			return false;
		} else {

			if (Validator.validaCpf(dadosClientes[3]) && Validator.validaTelefone(
					new Telefone(Integer.parseInt(dadosClientes[5]), Integer.parseInt(dadosClientes[6])))) {

				Client c = new Client(dadosClientes[1], dadosClientes[2], dadosClientes[7],
						Integer.parseInt(dadosClientes[4]), dadosClientes[3],
						new Telefone(Integer.parseInt(dadosClientes[5]), Integer.parseInt(dadosClientes[6])));

				d.insertClient(c, Integer.parseInt(dadosClientes[0]));

				return true;
			} else {
				return false;
			}

		}
	}

	
	/**
	 * Removedor de Clientes indesejados
	 * @param i
	 * @return Verdadeiro
	 */
	public boolean removerCliente(int i) {

		String clienteRemovido = d.getClientes()[i].getName();

		if (i == (d.getAmountOfClients() - 1)) { // O Clientes a ser removido est� no final do array
			d.setAmountOfClients(d.getAmountOfClients() - 1);
			d.getClientes()[d.getAmountOfClients()] = null;
			return true;
		} else { // o Cliente a ser removido est� no meio do array
			int cont = 0;
			while (d.getClientes()[cont].getName().compareTo(clienteRemovido) != 0) {
				cont++;
			}
			// Rotina swap
			for (int j = cont; j < d.getAmountOfClients() - 1; j++) {
				d.getClientes()[j] = null;
				d.getClientes()[j] = d.getClientes()[j + 1];
			}
			d.getClientes()[d.getAmountOfClients()] = null;
			d.setAmountOfClients(d.getAmountOfClients() - 1);
			return true;
		}
	}

	/**
	 * Removedor de Funcionarios indesejados
	 * @param i
	 * @return Verdadeiro
	 */
	public boolean removerFuncionarios(int i) {

		String funcionarioRemovido = d.getEmployees()[i].getName();

		if (i == (d.getAmountOfEmployees() - 1)) { // O funcionario a ser removido est� no final do array
			d.setAmountOfEmployees(d.getAmountOfEmployees() - 1);
			d.getEmployees()[d.getAmountOfEmployees()] = null;
			return true;
		} else { // o funcionario a ser removido est� no meio do array
			int cont = 0;
			while (d.getEmployees()[cont].getName().compareTo(funcionarioRemovido) != 0)
				cont++;
			// Rotina swap
			for (int j = cont; j < d.getAmountOfEmployees() - 1; j++) {
				d.getEmployees()[j] = null;
				d.getEmployees()[j] = d.getEmployees()[j + 1];
			}
			d.getEmployees()[d.getAmountOfEmployees()] = null;
			d.setAmountOfEmployees(d.getAmountOfEmployees() - 1);
			return true;
		}
	}

	
	/**
	 * Cadastrar ou editar clientes
	 * @param novoDado
	 * @return Verdadeiro ou Falso
	 */
	public boolean inserirEditarLojas(String[] novoDado) {
		if (!novoDado[3].matches("[0-9]+") || !novoDado[4].matches("[0-9]+") || !novoDado[5].matches("[0-9]+")) {
			return false;
		} else {
			if (Validator.validaCep(Integer.parseInt(novoDado[3])) && Validator
					.validaTelefone(new Telefone(Integer.parseInt(novoDado[4]), Integer.parseInt(novoDado[5])))) {

				Store l = new Store(novoDado[1], novoDado[2], Integer.parseInt(novoDado[3]),
						new Telefone(Integer.parseInt(novoDado[4]), Integer.parseInt(novoDado[5])));

				d.insertStore(l, Integer.parseInt(novoDado[0]));
				return true;
			} else {
				return false;
			}
		}
	}

	public int getAmountOfPurses() {
		return this.d.getAmountOfPurses();
	}

	public Purse[] getPurse() {
		return this.d.getPurse();
	}

	/**
	 * Cadastrar ou editar Bolsa
	 * @param novoDado
	 * @return Verdadeiro ou Falso
	 */
	public boolean insertPurse(String[] novoDado) {
		if (!novoDado[1].matches("[0-9]+") || !novoDado[7].matches("[0-9.]+") ) {
			System.out.println(novoDado[7]);
			return false;
		} else {
			Purse purse = new Purse(Integer.parseInt(novoDado[1]), novoDado[2], novoDado[3],
					novoDado[4], novoDado[5], novoDado[6],Integer.parseInt(novoDado[7]), novoDado[8]);
			
			d.insertPurse(purse, Integer.parseInt(novoDado[0]));
			
			return true;
		}

	}

	/**
	 * Remover Bolsa
	 * @param novoDado
	 * @return Verdadeiro ou Falso
	 */
	public boolean removePurse(int i) {
		String removedPurse = d.getPurse()[i].getNome();

		if (i == (d.getAmountOfPurses() - 1)) { // A lente a ser removida est� no final do array
			d.setAmountOfPurses(d.getAmountOfPurses() - 1);
			d.getPurse()[d.getAmountOfPurses()] = null;
			return true;
		} else { // a lente a ser removido est� no meio do array
			int cont = 0;

			while (d.getPurse()[cont].getNome().compareTo(removedPurse) != 0) {
				cont++;
			}
			// Rotina swap
			for (int j = cont; j < d.getAmountOfPurses() - 1; j++) {
				d.getPurse()[j] = null;
				d.getPurse()[j] = d.getPurse()[j + 1];
			}
			d.getPurse()[d.getAmountOfPurses()] = null;
			d.setAmountOfPurses(d.getAmountOfPurses() - 1);
			return true;
		}
	}

	public Sale[] getSales() {
		return this.d.getSales();
	}

	public int getAmountOfSales() {
		return this.d.getAmountOfSales();
	}

	public boolean insertSale(String[] novoDado) {
		
		
		
		if (!novoDado[1].matches("[0-9.]+") || !novoDado[6].matches("[0-9.]+")) {
			

			return false;
		} else {
			
			Sale v = new Sale(Integer.parseInt(novoDado[1]), novoDado[2], novoDado[3], 
					novoDado[4], novoDado[5],Integer.parseInt(novoDado[6]));
			
			

			d.insertSale(v, Integer.parseInt(novoDado[0]));
			
			System.out.println(novoDado[1]);
			System.out.println(novoDado[2]);
			System.out.println(novoDado[3]);
			System.out.println(novoDado[4]);
			System.out.println(novoDado[5]);
			return true;
		}
	}

	public boolean removerVenda(int posicao) {
		
			return true;
		
	}

}