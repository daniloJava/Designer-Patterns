package br.com.patterns.nullobject;

import static org.junit.Assert.*;

import javax.servlet.http.HttpServletRequest;

import org.junit.Test;

import br.com.patterns.nullobject.exemplo.ApresentacaoCarrinho;

/**Teste muito desaficado, 
 * 
 *Preciso ver como eu simulo um Servlet. XD
 * 
 * 
 * @author Danilo Silva
 *
 */
public class TestNullObject {

	@SuppressWarnings("null")
	@Test
	public void verificaCarrinhoSeEleEstaInicializado(HttpServletRequest request) {
		
		ApresentacaoCarrinho carrinho = new ApresentacaoCarrinho();
		// achei que passando um null no metodo iria dar certo.
		HttpServletRequest req = null;
		
		carrinho.colocaInformaçõesCarrinho(req);
		
		
		assertEquals(0.0, (double) req.getAttribute("valor"), 0.0000);
	}

}
