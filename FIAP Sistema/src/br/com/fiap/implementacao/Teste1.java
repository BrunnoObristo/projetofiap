package br.com.fiap.implementacao;

import br.com.fiap.modelo.Endereco;
import br.com.fiap.modelo.Professor;

public class Teste1 {

	public static void main(String[] args) {	
		
		Professor churros = new Professor();
		churros.setNome("Rafael");
		churros.setApelido("Ronqui");
		Endereco e = new Endereco();
		e.setLogradouro("Rua J�o");
		e.setBairro("Aclima��o");
		e.setCep("01234-555");
		e.setNumero("2");
		e.setCidade("S�o Paulo");
		e.setUf("SP");
		e.setTudo("", "", "", "", "", "");
		churros.setEndereco(e);		
		System.out.println(churros.getNome());
		System.out.println(churros.getEndereco().getLogradouro());
		
		
	}
	
	

}
