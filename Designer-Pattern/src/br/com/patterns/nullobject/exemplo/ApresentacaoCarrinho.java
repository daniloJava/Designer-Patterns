package br.com.patterns.nullobject.exemplo;

import javax.servlet.http.HttpServletRequest;

/**Apresenta o Carrinho recuperado.
 * 
 * @author Danilo Silva
 *
 */
public class ApresentacaoCarrinho {
	
	/**Atravez de um Servlet, esse metodo verifica
	 * se existe qualquer valor no carrinho, caso contrário ele inicializa
	 * com o carrinho no servlet. 
	 * Antes mesmo ele verifica toda vez se o carrinho esta inicializado para não 
	 * ocorrer um NullPointerException
	 * 
	 * @param req HttpServletRequest - Servlet do sistema.
	 */
	public void colocaInformaçõesCarrinho(HttpServletRequest req) {
		
		Carrinho c = CookieFactory.criarCarrinho(req);
		if (c != null) {
			req.setAttribute("valor", c.getValor());
			req.setAttribute("qtd", c.getTamanho());
		} else {
			req.setAttribute("valor", 0.0);
			req.setAttribute("qtd", 0);
		}
		if (req.getAttribute("username") == null) {
			if (c != null) {
				req.setAttribute("userCarrinho", c.getNomeUsuario());
			} else {
				req.setAttribute("userCarrinho",
						"<a href=login.jsp>Login</a>");
			}
		} else {
			req.setAttribute("userCarrinho",
					req.getAttribute("username"));
		}
		
	}

	
		
}
