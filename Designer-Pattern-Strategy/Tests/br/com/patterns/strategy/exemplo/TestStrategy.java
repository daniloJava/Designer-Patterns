package br.com.patterns.strategy.exemplo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStrategy {


	@Test
	public void verificaSeTodasAsRegrasFunciona(){
		ContaEstacionamentoStrategy conta = new ContaEstacionamentoStrategy();
		
		conta.setCalculo(new CalculoCarga(2.0));
		
		
		assertEquals(6.0, conta.valorConta(),0.0001);
		conta.setCalculo(new CalculoDiaria(2.0));
		assertEquals(0, conta.valorConta(),0.0001);
		conta.setCalculo(new Calculo15Minutos(2.0));
		assertEquals(2.0, conta.valorConta(), 0.0001);
		
	}
	
}
