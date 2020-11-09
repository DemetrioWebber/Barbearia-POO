package Clientes;

import Agendamento.agendamento;

public class Main {

	public static void main(String[] args) {
		Profissional jairo = new Profissional("Jairo", "M", "3358-1929", "Barba", "10 anos", 30);
		//Profissional robertao = new Profissional("Robertao", "M", "3358-9030", "Cabelo", "18 anos", 40);
		Cliente Gerson = new Cliente("Gerson", "M", "99329833", "919284842");
		//Cliente Joao = new Cliente("João","M","91220063","99965000");
		agendamento ag = new agendamento();
		//ag.adicionaCaloteiro(Joao);
		//ag.testaCaloteiro(Joao);
		ag.testaCaloteiro(Gerson);
		//ag.escolhaServico(Joao, jairo, robertao);
		ag.escolhaServico(Gerson, jairo);
		
		
	}
}
