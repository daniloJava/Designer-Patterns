package br.com.patterns.nullobject.exemplo;

import javax.servlet.http.HttpServletRequest;

/**Fabrica que ilustra alguma informação
 * de carrinho já salvo nos Cookies.
 * 
 * @author Danilo Silva
 *
 */
public class CookieFactory {

	public static Carrinho criarCarrinho(HttpServletRequest request){
		if(request == null)
			return null;
		Carrinho c = new Carrinho();
			
			c.setValor((double) request.getAttribute("valor"));
			c.setTamanho((int) request.getAttribute("qtd"));
			c.setNomeUsuario((String) request.getAttribute("username"));
		
		return c ;
	}
	
}
