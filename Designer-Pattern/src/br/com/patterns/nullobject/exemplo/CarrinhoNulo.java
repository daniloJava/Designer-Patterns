package br.com.patterns.nullobject.exemplo;

/**Carrinho Nulo.
 * inicializa todos os atributos de Carrinho.
 * 
 * @author Danilo Silva
 *
 */
public class CarrinhoNulo extends Carrinho {
	
	@Override
	public double getValor() {
		return 0.0;
	}
	
	@Override
	public int getTamanho() {
		return 0;
	}

	@Override
	public String getNomeUsuario() {
		return "<a href=login.jsp>Login</a>";
	}
}
