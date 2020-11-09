package Agendamento;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import Clientes.Cliente;
import Clientes.Profissional;
import exceçoes.caloteiroException;

public class agendamento{
	private String servico;
	private String observacao;
	private Cliente cliente;
	private Profissional profissional;
	private float horario;
	private String diaSemana;
	private ArrayList<String> caloteiros = new ArrayList<>();
    String arquivo = "arquivoTestes.txt";
    String dir = System.getProperty("user.home");
    String caminhoAbsoluto = dir + File.separator + arquivo;


	public void escolhaServico(Cliente cliente, Profissional profissional) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Olá "+cliente.getNome()+"! Seja bem vindo ao sistema da agendamento Barbearia CCB 24hr.");
			System.out.print("Digite o serviço necessitado, barba ou cabelo?: ");
			this.servico = sc.next();
			System.out.println("Você será atendido pelo nosso Profissional: "+ profissional.getNome());
			System.out.println(profissional.getNome()+" Possui experiencia de "+profissional.getTempoExperiencia()+" anos!");
			System.out.println("O valor do corte vai ficar: R$"+profissional.getValorCorte());
			this.profissional = profissional;
			setServico(servico);
			System.out.print("Quer marcar o/a "+servico+" para qual dia da semana? ");
			diaSemana = sc.next();
			setDia(diaSemana);
			System.out.println("A que horas você quer marcar? ");
			horario = sc.nextFloat();
			setHorario(horario);
			sc.close();
			
			System.out.println("O cliente "+cliente.getNome()+" marcou horario "+getDia()+" às "+getHorario()+" horas!");
	        System.out.println("Escolheu o serviço de: "+getServico()+".");
			try (FileWriter fw = new FileWriter(caminhoAbsoluto, true);
		         BufferedWriter bw = new BufferedWriter(fw);
		         PrintWriter out = new PrintWriter(bw)){
						
		         out.println("O cliente "+cliente.getNome()+" marcou horario "+getDia()+" às "+getHorario()+" horas!");
		         out.println("Escolheu o serviço de: "+getServico()+".");
		         out.println("O profissional escolhido para exercer o serviço foi: "+profissional.getNome());
		    	        
			} catch (IOException e) {
				
		       e.printStackTrace();

		   }
		}
	
	public void adicionaCaloteiro(Cliente cliente) {
		caloteiros.add(cliente.getNome());
	}
	public void testaCaloteiro(Cliente cliente) {
		if (caloteiros.contains(cliente.getNome())){
			System.out.println(cliente.getNome()+" está na lista de caloteiros, tome cuidado!");
			throw new caloteiroException("Sai daí caloteiro");
		}
	}

	
	public String getServico() {
		return servico;
	}
	public void setServico(String servico) {
		this.servico = servico;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public float getHorario() {
		return horario;
	}
	public void setHorario(float horario) {
		this.horario = horario;
	}
	public String getDia() {
		return diaSemana;
	}
	public void setDia(String dia) {
		this.diaSemana = dia;
	}	
	} 

