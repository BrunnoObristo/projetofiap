package br.com.fiap.modelo;

public class Aluno {
	private String nome;
	private String rm;
	private Endereco endereco;
	private String cpf;
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
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setTudo(String pNome, String pRm, Endereco pEndereco, String pCpf) {
		this.nome= pNome;
		this.rm = pRm;
		this.endereco = pEndereco;
		this.cpf = pCpf;
	}
	
	public String getTudo() {
		return "Nome:" + nome + "Rm:" + rm + "Endereco" + endereco + "CPF:" + cpf;
	}
}
