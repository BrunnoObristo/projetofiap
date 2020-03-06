package br.com.ecommerce.modelo;

public class Item {

	private Ebook ebook;
	private String entrega;
	private double valor;
	
	public Ebook getEbook() {
		return ebook;
	}
	public void setEbook(Ebook ebook) {
		this.ebook = ebook;
	}
	public String getEntrega() {
		return entrega;
	}
	public void setEntrega(String entrega) {
		this.entrega = entrega;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getTudo() {
		return "Ebook: " + ebook.getTudo() + "Entrega: " + entrega + "Valor: " + valor;
 	}
	
	public void setTudo(Ebook pEbook, String pEntrega, double pValor){
		this.ebook = pEbook;
		this.entrega = pEntrega;
		this.valor = pValor;
	}
}
