package br.com.ecommerce.modelo;

public class Ebook {

	private String titulo;
	private String autor;
	private double valor;
	private String editora;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public void setTudo(String pTitulo, String pAutor, double pValor, String pEditora) {
		this.titulo = pTitulo;
		this.autor = pAutor;
		this.valor = pValor;
		this.editora = pEditora;
	}
	
	public String getTudo() {
		return "T�tulo: " + titulo + "Autor: " + autor + "Valor: " + valor + "Editora: " + editora;
	}
	
}
