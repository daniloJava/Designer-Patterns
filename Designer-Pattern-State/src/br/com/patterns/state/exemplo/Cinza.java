package br.com.patterns.state.exemplo;

import java.util.List;

/**Classe de estado CINZA que indica o processo de processamento,
 * iniciando tambem todas as verificações dos procimos Nós.
 * e claro assumindo a cor preta.
 * 
 * @author Danilo Silva
 *
 */
public class Cinza extends Cor {
	
	/**Repassa o Nó atual e a novamente a mesma lista.
	 * Verifica todos os proximos nós repassando a lista
	 */
	void assumiu(No no, List<No> list) {
		for (No adj : no.getAdjacentes())
			adj.buscaProfundidade(list);
		no.setCor(new Preto(), list);
	}
}