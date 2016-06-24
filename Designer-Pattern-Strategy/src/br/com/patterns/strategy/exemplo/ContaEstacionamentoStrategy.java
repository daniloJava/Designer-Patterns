package br.com.patterns.strategy.exemplo;


/**Dessa forma, Toda e qualquer  nova regra de negocio
 *  terá o mesmo metodo de acesso com suas respectivas regras.  
 * 
 * Exemplo é Classe CalculoDiaria, Calculo15Minutos CalculoCarga e assim por diante.
 * 
 * @author Danilo Silva
 *
 */

public class ContaEstacionamentoStrategy {

	private CalculoValor calculo;
	private Veiculo veiculo;
	private long inicio;
	private long fim;

	
	public double valorConta() {
		return calculo.calcular(fim - inicio);
	}
	
	/**Recebe um tipo de regra de negocio.
	 * 
	 * @param calculo CalculoValor - Regra
	 */
	public void setCalculo(CalculoValor calculo) {
		this.calculo = calculo;

	}
}
