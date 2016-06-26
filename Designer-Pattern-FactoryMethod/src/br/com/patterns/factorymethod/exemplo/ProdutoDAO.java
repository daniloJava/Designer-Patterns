package br.com.patterns.factorymethod.exemplo;

import java.util.List;

/**Implementa todos os metodos do Dao 
 * com a aplicação da generalização Produto.
 * 
 * @author Danilo Silva
 *
 */
public class ProdutoDAO implements DAO<Produto>{

	
	@Override
	public Produto recuperarPorId(Object id) {
		System.out.println("Recuperando Produto por id "+ id );
		return null;
	}

	@Override
	public void salvar(Produto entidade) {
		System.out.println("Dados salvos");
		
	}

	@Override
	public void excluir(Object id) {
		System.out.println("dados excluidos");
	}

	@Override
	public List<Produto> listarTodos() {
		System.out.println("istando doas as paradas");
		return null;
	}
	
	

}
