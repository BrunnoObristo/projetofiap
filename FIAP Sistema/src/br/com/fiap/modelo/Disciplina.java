package br.com.fiap.modelo;

public class Disciplina {
	private String nome;
	private String cargaHoraria;
	private String ementa;
	private Professor professor;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getEmenta() {
		return ementa;
	}
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public void setTudo(String pNome, String pCargaHoraria, String pEmenta, Professor pProfessor) {
		this.nome = pNome;
		this.cargaHoraria = pCargaHoraria;
		this.ementa = pEmenta;
		this.professor = pProfessor;
	}
	
	public String getTudo() {
		return "Nome:" + nome + "Carga Horaria:" + cargaHoraria + "Ementa:" +  ementa + "Professor" + professor;
	}
}
