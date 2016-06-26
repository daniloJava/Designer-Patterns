package br.com.patterns.bridge;

import java.util.Map;


/**Agora é uma classe que gera um somente um arquivo XML
 * podendo ter diversas ações.
 * 
 * @author Danilo Silva
 *
 */
public class GeradorXML extends GeradorArquivo {
	
	
	/**Cria um arquivo XML que existe uma tag 
	 * <properties> para cada propriedade é um elemento.
	 * 
	 */
	protected String gerarConteudo(Map<String, Object> props) {
		StringBuilder propFileBuilder = new StringBuilder();
		propFileBuilder.append("<properties>");
		for (String prop : props.keySet()) {
			propFileBuilder.append("<" + prop + ">" + props.get(prop) + "</"
					+ prop + ">");
		}
		propFileBuilder.append("</properties>");
		return propFileBuilder.toString();
	}
	
}