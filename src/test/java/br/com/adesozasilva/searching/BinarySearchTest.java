package br.com.adesozasilva.searching;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void test() {
		String[] nomes = {
				"Alberto",
				"Andressa",
				"Camila",
				"Enzo",
				"Fernando",
				"Maria",
				"Jonas",
				"Junior",
				"Paloma",
				"Paulo"
		};
		BinarySearch busca = new BinarySearch();
		String nome = "Anderson";
		int search = busca.execute(nomes, 0, nomes.length, nome);
		
		if(search != -1) System.out.println(nomes[search]);
	}

}
