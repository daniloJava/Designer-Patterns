package br.com.patterns.TemplateMethod.exemplo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

/**Casse abstrata para Gerar um arquivo
 * 
 * @author Danilo Silva
 *
 */
public abstract class GeradorArquivo {

	/**metodo base para criação de qualquer arquivo.
	 * sendo Final para não conseguir sobrescrever pelas subClasses.
	 * 
	 * @param nome
	 * @param propriedades
	 * @throws IOException
	 */
	public final void gerarArquivo(String nome, Map<String, Object> propriedades)
			throws IOException {
		
		//chama o metodo sobrescrito da classe filho.
		String conteudo = gerarConteudo(propriedades);
		byte[] bytes = conteudo.getBytes();
		//processa.
		bytes = processar(bytes);
		FileOutputStream fileout = new FileOutputStream(nome);
		fileout.write(bytes);
		fileout.close();
		
	}

	/**
	 * 
	 * @param bytes
	 * @return
	 * @throws IOException
	 */
	protected byte[] processar(byte[] bytes) throws IOException {
		return bytes;
	}
	
	/**Metodo que precisa ser implementado.
	 * 
	 * @param propriedades 
	 * @return
	 */
	protected abstract String gerarConteudo(Map<String, Object> propriedades);

}
