package br.com.patterns.strategy.exemplo;


/**Exemplo de codigo com dificuldade de Aplicação e manutenção
 * com a tendencia de almentar as codições de Ifs ao aplicar uma nova 
 * regra de negocio.
 * 
 * @author Danilo Silva
 *
 */
public class ContaEstacionamento {

	
	private final int HORA = 0;
	private final int DIA = 0;
	private final long MES = 0;
	
	
	private Veiculo veiculo;
	private long inicio, fim;
	
	public double valorConta() {
		
		long atual = (fim == 0) ? System.currentTimeMillis() : fim;
		long periodo = inicio - atual;
		if (veiculo instanceof Passeio) {
			if (periodo < 12 * HORA) {
				return 2.0 * Math.ceil(periodo / HORA);
			} else if (periodo > 12 * HORA && periodo < 15 * DIA) {
				return 26.0 * Math.ceil(periodo / DIA);
			} else {
				return 300.0 * Math.ceil(periodo / MES);
			}
		} else if (veiculo instanceof Carga) {
			// outras regras para veículos de carga
		}
		// outras regras para outros tipos de veículo
		return 0.0;
	}
}
