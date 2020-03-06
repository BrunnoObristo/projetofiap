package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Ebook;
import br.com.ecommerce.modelo.Item;

public class Teste01 {

	public static void main(String[] args) {
		
		Item i = new Item();
		Ebook e = new Ebook();
		i.setEbook(JOptionPane.showInputDialog("Digite o ebook: "));
		i.setEntrega(JOptionPane.showInputDialog("Digite o modo de entrega: "));
		i.setValor(JOptionPane.showInputDialog(""));

	}

}
