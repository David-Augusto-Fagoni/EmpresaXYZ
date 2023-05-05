package model;

public class Cliente {
	String cpf = "";
	String nome = "";
	int idade;
	int limitcredito;
	
	public void Cliente (String cpf, String nome, int idade, int limitcredito){
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.limitcredito = limitcredito;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public int getLimitcredito() {
		return limitcredito;
	}
	
	
}
