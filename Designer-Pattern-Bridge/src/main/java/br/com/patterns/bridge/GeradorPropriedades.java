package br.com.patterns.bridge;


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
public class GeradorPropriedades extends GeradorArquivo {
	
	

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
