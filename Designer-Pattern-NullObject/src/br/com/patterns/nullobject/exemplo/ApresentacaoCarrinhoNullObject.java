package br.com.patterns.nullobject.exemplo;

import javax.servlet.http.HttpServletRequest;

/**Apresenta o Carrinho recuperado.
 * 
 * @author Danilo Silva
 *
 */
public class ApresentacaoCarrinhoNullObject {
	
	/**Com a mesma funcionalidae, porem mais limpo.
	 * Sabendo que a Factory, vai retornar um Carrinho corretamente.
	 * 
	 * @param req HttpServletRequest - Servlet do sistema.
	 */
	public void colocaInformaçõesCarrinho(HttpServletRequest req) {
		
		Carrinho c = CookieFactory.criarCarrinho(req);
		
			req.setAttribute("valor", c.getValor());
			req.setAttribute("qtd", c.getTamanho());
		
		if (req.getAttribute("username") == null) {
			req.setAttribute("userCarrinho", c.getNomeUsuario());
		
		} else {
			req.setAttribute("userCarrinho", req.getAttribute("username"));
		
		}
		
	}

	
		
}
