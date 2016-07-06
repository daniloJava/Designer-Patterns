package br.com.patterns.observer.exemplo;

/**Observador de mudança SMS
 * 
 * @author Danilo Silva
 *
 */
public class EnviaSMS implements Observador{

	@Override
	public void mudancaQuantidade(String prod, Integer qtd) {
		System.out.println("SMS " + qtd);
	}

}
