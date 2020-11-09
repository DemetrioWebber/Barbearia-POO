package Clientes;

public class Profissional extends Pessoa {
	
	private String especializacao;
	private String tempoExperiencia;
	private double valorCorte;
	
	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}

	public String getTempoExperiencia() {
		return tempoExperiencia;
	}

	public void setTempoExperiencia(String tempoExperiencia) {
		this.tempoExperiencia = tempoExperiencia;
	}

	public double getValorCorte() {
		return valorCorte;
	}

	public void setValorCorte(double valorCorte) {
		this.valorCorte = valorCorte;
	}

	public Profissional(String nome, String sexo, String telefone, String especializacao, String tempoExperiencia, double valorCorte) {
		super(nome, sexo, telefone);
		this.nome = nome;
		this.Sexo = sexo;
		this.telefone = telefone;
		this.especializacao = especializacao;
		this.tempoExperiencia = tempoExperiencia;
		this.valorCorte = valorCorte;
	}
	
}
