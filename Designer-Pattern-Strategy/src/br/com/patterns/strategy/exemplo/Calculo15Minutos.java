package br.com.patterns.strategy.exemplo;

public class Calculo15Minutos implements CalculoValor{
	
	
	private double valorPeriodo;
	
	public Calculo15Minutos(double valorPeriodo) {
		super();
		this.valorPeriodo = valorPeriodo;
	}

	@Override
	public double calcular(long pediodo) {
		return valorPeriodo;
	}

}
