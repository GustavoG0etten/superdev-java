package br.com.orientacaoObjeto.model;

public class Funcionario extends Pessoa {

	int matricula;
	String setor;
	
	// CONSTRUTORES
	public Funcionario() {
		
	}
	
	public Funcionario(int matricula, String setor) {
		this.matricula = matricula;
		this.setor = setor;
	}
	
	// GETTERS
	public int getMatricula() {
		return this.matricula;
	}
	
	public String getSetor () {
		return this.setor;
	}
	
	// SETTERS
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	
	// ENVIAR PARA O GIT
	
	
}