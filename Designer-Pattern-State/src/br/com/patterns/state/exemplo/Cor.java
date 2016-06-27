package br.com.patterns.state.exemplo;

import java.util.List;

/**Abastração para para os estados de cada Nó
 * e seus metodos.
 * 
 * @author Danilo Silva
 *
 */
public abstract class Cor {
	void busca(No no, List<No> list){}
	void assumiu(No no, List<No> list){}
}
