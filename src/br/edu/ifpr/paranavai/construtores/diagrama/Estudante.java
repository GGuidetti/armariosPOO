package br.edu.ifpr.paranavai.construtores.diagrama;

import java.util.Scanner;

public class Estudante {
	// atributos
	public String nome;
	public String cpf;
	// m�todos
	//Construtores tem o mesmo nome da classe e n�o tem retorno
	public Estudante() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do estudante");
		nome = teclado.nextLine();
	}
	
	public Estudante(String nome) {
		//apontar para o atributo com o prefixo 'this.'
		this.nome = nome;
	}
}
