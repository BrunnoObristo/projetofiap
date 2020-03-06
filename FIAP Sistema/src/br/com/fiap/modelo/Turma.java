package br.com.fiap.modelo;

public class Turma {

	private String nome;
	private String rm;
	private String sala;
	private String periodo;
	private Curso curso;
	private Aluno alunos;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRm() {
		return rm;
	}
	public void setRm(String rm) {
		this.rm = rm;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Aluno getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno alunos) {
		this.alunos = alunos;
	}
	
	public void setTudo(String pNome, String pRm, String pSala, String pPeriodo, Curso pCurso, Aluno pAluno) {
		this.nome = pNome;
		this.rm = pRm;
		this.sala = pSala;
		this.periodo = pPeriodo;
		this.curso = pCurso;
		this.alunos = pAluno;
	}
	
	public String getTudo() {
		return "Nome:" + nome + "RM:" + rm + "Sala:" + sala + "Período:" + periodo + "Curso" + curso + "Aluno" + alunos;
	}
	
}
