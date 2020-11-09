package Clientes;

public class Cliente extends Pessoa {
	private String cep;
	
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public Cliente(String nome, String sexo, String telefone,String cep) {
		super(nome, sexo, telefone);
		this.cep = cep;
		
		
		
	}
}