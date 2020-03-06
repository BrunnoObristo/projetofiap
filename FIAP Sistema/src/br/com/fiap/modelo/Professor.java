package br.com.fiap.modelo;

public class Professor {
 private String nome;
 private String apelido;
 private Endereco endereco;
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getApelido() {
	return apelido;
}
public void setApelido(String apelido) {
	this.apelido = apelido;
}
public Endereco getEndereco() {
	return endereco;
}
public void setEndereco(Endereco endereco) {
	this.endereco = endereco;
}
 
public String getTudo() {
	return "Nome......:" + nome + "\n" + 
			"Apelido..:" + apelido + "\n" + 
			"Endereço.:" + endereco.getTudo();
			
}

public void setTudo(String pNome, String pApelido, Endereco pEndereco) {
	this.nome = pNome;
	this.apelido = pApelido;
	this.endereco = pEndereco;
}
}
