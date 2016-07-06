package br.com.patterns.observer.exemplo;

/**Interface para receber notificações,
 * deve ser implementada pelas classes que desejam 
 * receber os eventos de mu dança na quantidade das ações.
 * 
 * @author Danilo Silva
 *
 */
public interface Observador {
	
	void mudancaQuantidade(String prod, Integer qtd);
}
