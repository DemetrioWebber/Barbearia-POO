package Clientes;

import java.sql.Date;

public abstract class Pessoa {
	protected String nome;
	protected String Sexo;
	protected Date dataNascimento;
	protected String telefone;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Pessoa(String nome, String sexo, String telefone) {
		super();
		this.nome = nome;
		Sexo = sexo;
		this.telefone = telefone;
	}
	
}
