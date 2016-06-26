package br.com.patterns.factorymethod.exemplo;

import java.io.IOException;

/**
 * 
 * @author Danilo Silva
 *
 * @param <E>
 */
public abstract class ServicoAbstrato<E> {
	public GeradorArquivo gerador;
	/**Construtor para recuperar um serviço
	 * 
	 * @param gerador - Classe do serviço
	 */
	
	
	public ServicoAbstrato(GeradorArquivo gerador) {
		this.gerador = gerador;
	}

	/**Hook Method para criar um objeto DAO.
	 * precisa implementar
	 * 
	 * @return
	 */
	public abstract DAO<E> getDAO();

	
	/**Recupera uma entidade a partir do identificador
	 * e chama a instancia do Gerador de arquivos, onde pode 
	 * ser qualquer serviço onde é passada no Construtor.
	 * 
	 * @param id - Identificador 
	 * @param nomeArquivo
	 */
	public void gravarEntidadeEmArquivo(Object id, String nomeArquivo) {
		E entidade = getDAO().recuperarPorId(id);
		try {
			gerador.gerarArquivo(nomeArquivo,  ((Entidade) entidade).getMapa());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}