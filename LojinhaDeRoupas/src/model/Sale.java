package model;

public class Sale {
	private int idSale;
    private int value;
    private String name, productName, clientName,  employeeName;
    
    
    

    public Sale(int idSale, String clientName, String employeeName,  String name, String productName, int value) {
		super();
		this.value = value;
		this.name = name;
		this.productName = productName;
		this.clientName = clientName;
		this.employeeName = employeeName;
		this.idSale = idSale;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdSale() {
        return idSale;
    }

    public void setIdSale(int idSale) {
        this.idSale = idSale;
    }

    public double getValue() {
        return value;
    }

    public void setValorFinal(int valorFinal) {
        this.value = valorFinal;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    

    // metodo de busca
    public boolean buscaVendaID(int vendaidbuscado) {

        if (idSale == vendaidbuscado)
            return true;
        else
            return false;
    }

}