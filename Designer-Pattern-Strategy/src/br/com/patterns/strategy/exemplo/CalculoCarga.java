package br.com.patterns.strategy.exemplo;


/**Classe para calculo por carga
 * 
 * @author Danilo Silva
 *
 */
public class CalculoCarga implements CalculoValor{

	
	
	private double valorCarga;
	
	public CalculoCarga(double valorCarga) {
		this.valorCarga = valorCarga;
	}
	
	
	@Override
	public double calcular(long pediodo) {
		return valorCarga * 3;
	}

	
	

}
