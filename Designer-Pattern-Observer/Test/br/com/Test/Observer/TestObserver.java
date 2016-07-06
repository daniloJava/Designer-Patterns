package br.com.Test.Observer;

import org.junit.Assert;
import org.junit.Test;

import br.com.patterns.observer.exemplo.EnviaEmail;
import br.com.patterns.observer.exemplo.ConjuntoDeAcoes;
import br.com.patterns.observer.exemplo.EnviaSAP;
import br.com.patterns.observer.exemplo.EnviaSMS;


public class TestObserver {

	@Test
	public void test() {
		ConjuntoDeAcoes acoes = new ConjuntoDeAcoes();
		acoes.addObservador(new EnviaEmail());
		acoes.addObservador(new EnviaSMS());
		acoes.addObservador(new EnviaSMS());
		acoes.addObservador(new EnviaSAP());
		
		acoes.adicionaAcoes("Envia", 2);
		acoes.adicionaAcoes("recebe", 4);
		
		
	}

}
