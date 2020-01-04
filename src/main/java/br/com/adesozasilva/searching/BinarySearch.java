package br.com.adesozasilva.searching;

public class BinarySearch {

	public int execute(String[] array, int from, int to, String search) {
		if(from > to) return -1;
		
	    int half = (from + to) / 2;
	    
	    if(array[half].compareTo(search) == 0) 
	    	return half;
	    
	    if(search.compareTo(array[half]) < 0) 
	    	return execute(array, from, half-1, search);
	    	
	    return execute(array, half + 1, to, search);
	}
}
