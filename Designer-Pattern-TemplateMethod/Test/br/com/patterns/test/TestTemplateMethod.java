package br.com.patterns.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import br.com.patterns.TemplateMethod.exemplo.Arquivo;
import br.com.patterns.TemplateMethod.exemplo.GeradorArquivo;
import br.com.patterns.TemplateMethod.exemplo.GeradorXMLCompactado;

public class TestTemplateMethod {

	@Test
	public void test() throws IOException {
		GeradorArquivo gera = new GeradorXMLCompactado();
		Arquivo arq = new Arquivo("titulo ", "descrião marota");
		Arquivo arq1 = new Arquivo("titulo1 ", "descrião marota1");
		Arquivo arq2 = new Arquivo("titulo2 ", "descrião marota2");
		
		Map<String, Object> test = new HashMap<String, Object>();
		test.put("value1", arq);
		test.put("value2", arq1);
		test.put("value3", arq2);
		
		gera.gerarArquivo("TesteShow", test);
		
		
	}

}
