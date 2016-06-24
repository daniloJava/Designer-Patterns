package br.com.patterns.nullobject.exemplo;

/**Simulador de um carrinho de compras simples
 * 
 * @author Danilo Silva
 *
 */
public class Carrinho {

	private String nomeUsuario;
	private int tamanho;
	private double valor;

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
