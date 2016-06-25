package br.com.patterns.factorymethod.exemplo;

import java.util.List;

/**Interface para Criar um Dao
 * 
 * @author Danilo Silva
 *
 * @param <E>
 */
public interface DAO<E> {
	
	public E recuperarPorId(Object id);
	public void salvar(E entidade);
	public void excluir(Object id);
	public List<E> listarTodos();

}
