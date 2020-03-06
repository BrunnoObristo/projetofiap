package br.com.ecommerce.modelo;

public class Carrinho {

	private Item itens;
	private String metodoPagamento;
	private Cliente cliente;
	private double total;
	public Item getItens() {
		return itens;
	}
	public void setItens(Item itens) {
		this.itens = itens;
	}
	public String getMetodoPagamento() {
		return metodoPagamento;
	}
	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	public void setTudo(Item pItens, String pMetodoPagamento, Cliente pCliente, double pTotal) {
		this.itens = pItens;
		this.metodoPagamento = pMetodoPagamento;
		this.cliente = pCliente;
		this.total = pTotal;		
	}
	
	public String getTudo() {
		return "Itens: " + itens + "Método de pagamento: " + metodoPagamento + "Cliente: " + cliente + "Total: " + total; 
 	}
	
}
