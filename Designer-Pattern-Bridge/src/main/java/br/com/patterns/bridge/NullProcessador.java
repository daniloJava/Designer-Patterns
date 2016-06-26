package br.com.patterns.bridge;

/**Implementação do Padrão Null Object.
 * Apenas para mostrar que é possivel alicar em qualquer parte de codigo.
 * 
 * @author Danilo Silva
 *
 */
public class NullProcessador implements PosProcessador{

	
	public byte[] processar(byte[] bytes) {
		return bytes;
	}

	
}
