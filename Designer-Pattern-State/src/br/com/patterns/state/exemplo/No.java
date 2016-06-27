package br.com.patterns.state.exemplo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/** Classe para classificar todos os Nós 
 * e todas as sua funcionalidades
 * 
 * @author Danilo Silva
 *
 */
public class No {
	private Set<No> adjacentes = new HashSet<>();
	private Cor cor;
	private String name;

	/**
	 * Inicializa o nome de todos os nós
	 * @param name
	 */
	public No(String name) {
		this.name = name;
		cor = new Branco();
	}

	/**Recebe uma lista que deve ser populada com os nós do grafo na ordem que 
	 * terminaram de ser executados.
	 * 
	 * @param list
	 */
	public void buscaProfundidade(List<No> list) {
		cor.busca(this, list);
	}
	
	/**Adiciona uma nova Cor
	 * 
	 * @return
	 */
	public Set<No> getAdjacentes() {
		return adjacentes;
	}
	
	/**
	 * 
	 * @param adj
	 */
	public void addAdjacentes(No adj) {
		adjacentes.add(adj);
	}

	/** Representa configurar uma nova Cor.
	 * 	
	 * @param cor Cor - Estado
	 * @param list - Lista das cores
	 */
	public void setCor(Cor cor, List<No> list) {
		this.cor = cor;
		cor.assumiu(this, list);
	}
	
	/**Nome do estado
	 * 
	 */
	public String toString() {
		return name;
	}
}
