package br.com.patterns.state.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.patterns.state.exemplo.No;

public class TesteState {

	@Test
	public void test() {

		No a = new No("A");
		No b = new No("B");
		No c = new No("C");
		No d = new No("D");
		No e = new No("E");
		No f = new No("F");
		No g = new No("G");
		No h = new No("H");

		a.addAdjacentes(b);
		b.addAdjacentes(c);
		c.addAdjacentes(d);
		d.addAdjacentes(b);
		a.addAdjacentes(e);
		e.addAdjacentes(f);
		f.addAdjacentes(c);
		f.addAdjacentes(g);
		f.addAdjacentes(h);
		a.addAdjacentes(h);

		List<No> lista = new ArrayList<>();
		a.buscaProfundidade(lista);
		for (No n : lista)
			System.out.println(n);

	}

}
