package br.com.patterns.state.exemplo;

import java.util.List;

/**Classe de estado inicial BRANCO
 * 
 * @author Danilo Silva
 *
 */
public class Branco extends Cor {
	
	/**Metodo que recebe o estado inicial
	 * chamando o stado de cinza, repassando a lista de NÓ
	 * 
	 */
	public void busca(No no, List<No> list) {
		no.setCor(new Cinza(), list);
		
	}
}