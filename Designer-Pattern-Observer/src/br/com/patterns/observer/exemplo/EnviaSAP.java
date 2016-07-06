package br.com.patterns.observer.exemplo;

/**Observador de mudança Sap
 * 
 * @author Danilo Silva
 *
 */
public class EnviaSAP implements Observador{

	@Override
	public void mudancaQuantidade(String prod, Integer qtd) {
		System.out.println("SAP " + qtd);
	}

}
