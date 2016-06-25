package br.com.patterns.TemplateMethod.exemplo;

import java.io.IOException;
import java.util.Map;

/**Da mesma forma, implementado uma nova funcionalidade
 * sem nenhum problema.
 * 
 * O metodo de Criptografia é usado o conhecido 
 * cifra de César
 * 
 * @author Danilo Silva
 *
 */
public class GeradorPropriedadesCriptografado extends GeradorArquivo {
	
	private int delay;
	
	
	public GeradorPropriedadesCriptografado(int delay) {
		this.delay = delay;
	}
	
	/**Processa de aplicando a criptografia cifra de César
	 * simplismente em que o valor de cada byte é deslocado de acordo
	 * com a variavel delay
	 * @param bytes - Array dos bytes do arquivo gerado
	 * @return Array dos Bytes
	 */
	protected byte[] processar(byte[] bytes) throws IOException {
		byte[] newBytes = new byte[bytes.length];
		for (int i = 0; i < bytes.length; i++) {
			newBytes[i] = (byte) ((bytes[i] + delay) % Byte.MAX_VALUE);
		}
		return newBytes;
	}

	/**Gera o conteudo Criptografado
	 * @param Map<String, Object> - todos os parametros e os conteudo necessarios.
	 * @return String - toda string com o conteudo varrido
	 */
	protected String gerarConteudo(Map<String, Object> props) {
		StringBuilder propFileBuilder = new StringBuilder();
		for (String prop : props.keySet()) {
			propFileBuilder.append(prop + "=" + props.get(prop) + "\n");
		}
		return propFileBuilder.toString();
	}
	
}
