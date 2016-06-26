package br.com.patterns.factorymethod.exemplo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

/**Mesmos arquivos do Projeto TemplateMethod.
 * 
 * 
 * @author Danilo Silva
 *
 */
public abstract class GeradorArquivo {

	/**metodo base para criação de qualquer arquivo.
	 * sendo Final para não conseguir sobrescrever pelas subClasses.
	 * 
	 * @param nome - Nome do Arquivo
	 * @param propriedades - Todas suas propriedades inseridas
	 * @throws IOException - caso não conseguir escrever o arquivo.
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

	/**Metodo pagrão caso não for sobreescrito por classes filhas
	 * 
	 * @param bytes - os Bytes para rocessamento
	 * @return - Array de Byte
	 * @throws IOException
	 */
	protected byte[] processar(byte[] bytes) throws IOException {
		return bytes;
	}
	
	/**Metodo que precisa ser implementado. para Gerar um conteudo dentro do Arquivo
	 * 
	 * @param propriedades  - suas propriedades de conteudo
	 * @return - String do conteudo preparado.
	 */
	protected abstract String gerarConteudo(Map<String, Object> propriedades);

}
