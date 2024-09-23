package br.com.fiap.main;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.model.Endereco;
import br.com.fiap.services.viaCepService;

public class TesteAPI {
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	public static void main(String[] args) throws ClientProtocolException, IOException {
		viaCepService viaCep = new viaCepService();
		
		String cep = texto("Inform o número do CEP para busca");
		
		Endereco endereco = viaCep.getEndereco(cep);
		
		System.out.println(endereco);
	}
}
