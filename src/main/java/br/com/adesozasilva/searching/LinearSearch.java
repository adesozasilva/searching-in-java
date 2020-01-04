package br.com.adesozasilva.searching;

public class LinearSearch {

	public int execute(String[] array, int from, int to, String search) {
		for(int i = from; i < to; i++) 
			if(array[i] == search) return i;
		return -1;
	}
}
