
public class Carrinho {

	private Item itens;
	private int metodoPagamento;
	private Cliente cliente;
	private double total;
	public Item getItens() {
		return itens;
	}
	public void setItens(Item itens) {
		this.itens = itens;
	}
	public int getMetodoPagamento() {
		return metodoPagamento;
	}
	public void setMetodoPagamento(int metodoPagamento) {
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
	
	
}
