package br.com.patterns.strategy.exemplo;

import java.io.SequenceInputStream;

public class CalculoDiaria implements CalculoValor {
	
	private static final long HORA = 1;
	private double valorDiaria;

	public CalculoDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	@Override
	public double calcular(long pediodo) {
		// TODO Auto-generated method stub
		return valorDiaria * Math.ceil(pediodo / HORA);
		
	}


}