package br.com.patterns.observer.exemplo;

/**Observador de mudança Email
 * 
 * @author Danilo Silva
 *
 */
public class EnviaEmail implements Observador{

	@Override
	public void mudancaQuantidade(String prod, Integer qtd) {
		System.out.println("Email " + qtd);
	}
	
	
}
