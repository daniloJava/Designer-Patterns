package br.com.patterns.bridge;

/**Nova classe que somente Criptografa, qualquer tipo de arquivo.
 * que implementa o PosProcessador.
 * 
 * @author Danilo Silva
 *
 */
public class Criptografador implements PosProcessador{

	private  byte delay;
	
	public Criptografador(byte delay) {
		this.delay = delay;
	}

	public byte[] processar(byte[] bytes) {
		byte[] newBytes = new byte[bytes.length];
		for (int i = 0; i < bytes.length; i++) {
			newBytes[i] = (byte) ((bytes[i] + delay) % Byte.MAX_VALUE);
		}
		return newBytes;
	}

}
