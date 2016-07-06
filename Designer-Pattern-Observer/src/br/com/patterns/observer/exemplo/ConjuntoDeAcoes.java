package br.com.patterns.observer.exemplo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**Classe onde os dados podem ser observados
 * por qualquer outra classe
 * 
 * @author Danilo Silva
 *
 */
public class ConjuntoDeAcoes {
	
	private Map<String, Integer> acoes = new HashMap<>();
	private List<Observador> obs = new ArrayList<>();

	/**Adiciona uma ação
	 * 
	 * @param prod String - Nome da ação
	 * @param qtd int - quantidade
	 */ 
	public void adicionaAcoes(String prod, Integer qtd) {
		if (acoes.containsKey(prod)) {
			qtd += acoes.get(prod);
		}
		acoes.put(prod, qtd);
		notificar(prod, qtd);
	}
	
	/**Responsavel por chamar o metodo da Interface metodo privado,
	 * que cada vez que for adicionado uma nova ação o notifica será chamado.
	 * 
	 * @param acao acao String - Nome da ação
	 * @param qtd int - quantidade
	 */
	private void notificar(String acao, Integer qtd) {
		for (Observador o : obs)
			o.mudancaQuantidade(acao, qtd);
	}
	
	/**Registro de todas as ações em uma lista
	 * 
	 * @param o Observador - Classes que implementam a Interface.
	 */
	public void addObservador(Observador o) {
		obs.add(o);
	}
}
