package br.com.patterns.factorymethod.exemplo;

/**Exemplo de uma palicação da Classe ServicoAbstrato.
 * mas especificamente com uma palicação para lasse Produto.
 * 
 * @author Danilo Silva
 *
 */
public class ServicoProduto extends ServicoAbstrato<Produto> {
	
	private DAO<Produto> dao;
	
	/**passa o serviço para a classe pai.
	 * 
	 */
	public ServicoProduto(GeradorArquivo gerador) {
		super(gerador);
	}

	/**Inicializa a variavel Dao de acordo com sua regra
	 * 
	 */
	public DAO<Produto> getDAO() {
		if (dao == null) {
			dao = new ProdutoDAO();
		}
		return dao;
	}

	// Funcionalidade específica
	public double getPrecoProduto(Object produtoId) {
		Produto p = getDAO().recuperarPorId(produtoId);
		return p.getPreco();
	}
	
}