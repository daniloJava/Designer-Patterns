package br.com.patterns.bridge;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

/**Mesmo contexto porem ele tem com composição
 * a implementação PosProcessador onde o processador
 * pode ser configurado  independentemente da subclasse
 * permitindo qualquer configuração.  
 * 
 * 
 * @author Danilo Silva
 *
 */
public abstract class GeradorArquivo {
	
	
	private PosProcessador processador;
	
	
	public void setProcessador(PosProcessador processador){
		this.processador = processador;
		}	
	
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

		if(processador == null)
			processador = new NullProcessador();
		
		//processa apartir da variavel da interface
		bytes = processador.processar(bytes);
		FileOutputStream fileout = new FileOutputStream(nome);
		fileout.write(bytes);
		fileout.close();
		
	}

	
	/**Metodo que precisa ser implementado. para Gerar um conteudo dentro do Arquivo
	 * 
	 * @param propriedades  - suas propriedades de conteudo
	 * @return - String do conteudo preparado.
	 */
	protected abstract String gerarConteudo(Map<String, Object> propriedades);

}
