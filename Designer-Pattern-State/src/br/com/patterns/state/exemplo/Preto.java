package br.com.patterns.state.exemplo;

import java.util.List;

public class Preto extends Cor {
	void assumiu(No no, List<No> list) {
		list.add(no);
	}
}