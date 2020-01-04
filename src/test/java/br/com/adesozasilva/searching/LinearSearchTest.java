package br.com.adesozasilva.searching;

import org.junit.Test;

public class LinearSearchTest {

	@Test
	public void test() {
		String[] nomes = {
				"Andressa",
				"Camila",
				"Enzo",
				"Fernando",
				"Maria",
				"Alberto",
				"Jonas",
				"Junior",
				"Paloma",
				"Paulo"
		};
		LinearSearch buscaLinear = new LinearSearch();
		String nome = "Paulo";
		int search = buscaLinear.execute(nomes, 0, nomes.length, nome);
		System.out.println(nomes[search]);
	}

}
