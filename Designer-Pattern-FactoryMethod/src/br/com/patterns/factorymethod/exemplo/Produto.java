package br.com.patterns.factorymethod.exemplo;

/**Simulação de um produto simples
 * 
 * @author Danilo Silva
 *
 */
public class Produto {

	private long idProduto;
	private String nomeProduto;
	private double preco;
	
	
	public long getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	

	
	
	
}
