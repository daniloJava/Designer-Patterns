package br.com.patterns.state.exemplo;

import java.util.List;

/**Classe da statos da cor PRETA
 *  
 * 
 * @author Danilo Silva
 *
 */
public class Preto extends Cor {
	
	/**Aplicando o Status da cor preta, e adicionando a lista de conteudo.
	 * 
	 */
	void assumiu(No no, List<No> list) {
		list.add(no);
		System.out.println(no.toString() + " Estado PRETO");
	}
}