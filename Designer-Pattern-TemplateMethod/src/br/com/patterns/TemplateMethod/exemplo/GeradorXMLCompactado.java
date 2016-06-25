package br.com.patterns.TemplateMethod.exemplo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**Classe que gera um arquivo compactado,
 * com a implementação clara da classe abstrata FeradorArquivo.
 * 
 * @author Danilo Silva
 *
 */
public class GeradorXMLCompactado extends GeradorArquivo {
	
	/**Processa um arquivo compactado.
	 * 
	 */
	protected byte[] processar(byte[] bytes) throws IOException {
		ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
		ZipOutputStream out = new ZipOutputStream(byteOut);
		out.putNextEntry(new ZipEntry("internal"));
		out.write(bytes);
		out.closeEntry();
		out.close();
		return byteOut.toByteArray();
	}
	
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