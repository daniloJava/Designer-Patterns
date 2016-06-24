package br.com.patterns.nullobject.exemplo;

import javax.servlet.http.HttpServletRequest;

/**Fabrica que ilustra alguma informação
 * de carrinho já salvo nos Cookies.
 * 
 * @author Danilo Silva
 *
 */
public class CookieFactoryNullObject {
	
	/** A diferença desse metodo para o outro,
	 * é o fato de que se estiver nulo, ele devolve um Carrinho Nulo
	 * 
	 * @param request
	 * @return - CarrinhoNulo se não tiver um Request. Carrinho.
	 */
	public static Carrinho criarCarrinho(HttpServletRequest request){
		if(request == null)
			return new CarrinhoNulo();
		Carrinho c = new Carrinho();
			
			c.setValor((double) request.getAttribute("valor"));
			c.setTamanho((int) request.getAttribute("qtd"));
			c.setNomeUsuario((String) request.getAttribute("username"));
		
		return c ;
	}
	
}
