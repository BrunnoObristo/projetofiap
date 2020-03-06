package br.com.ecommerce.modelo;

public class Cliente {

	private String codigo;
	private String nome;
	private String cpf;
	private String email;
	private Carrinho carrinho;
	private String telefone;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Carrinho getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void setTudo(String pCodigo, String pNome, String pCpf, String pEmail, Carrinho pCarrinho, String pTelefone) {
		this.codigo = pCodigo;
		this.nome = pNome;
		this.cpf = pCpf;
		this.email = pEmail;
		this.carrinho = pCarrinho;
		this.telefone = pTelefone;
	}
	
	public String getTudo() {
		return "Código: " + codigo + "Nome: " + nome + "CPF: " + cpf + "Email: " + email + "Carrinho: " + carrinho + "Telefone: " + telefone;
	}
}
