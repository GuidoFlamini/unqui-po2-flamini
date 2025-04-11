package ar.edu.unq.po2.tp3;
import java.util.ArrayList;

public class Counter {
	private ArrayList<Integer> nums = new ArrayList<>();	
	
	public void addNumber(int x) {
		nums.add(x);
	}
	
	public int getEvenOcurrences() {
		int i = 0;
		for (int num:nums ) {
			if((num % 2) == 0) {
				i++;
			}
		}
		return i;
	}
	
	public int getUnevenOcurrences() {
		int j = 0;
		for (int num:nums ) {
			if((num % 2) != 0) {
				j++;
			}
		}
		return j;
	}
	
	public int cantDeMultiplosDe(int x) {
		int i = 0;
		for (int num : nums) {
            if (num % x == 0) {
                i++;
            }
        }
		return i;
	}
	
	private int digitosParesDe(int numero) {
		int x = numero;
		int i = 0;
		while(x != 0) {
			if((x % 10) % 2 == 0 ) {
				i++;
			}
			x = x / 10;
		}
		return i;
	}
	
	private boolean tieneMayorCantidadDeDígitosPares(int x, int y) {
		return(digitosParesDe(x) > digitosParesDe(y));
	}
	
	public int elQueTieneMayorCantidadDeDígitosPares() {
		int x = nums.get(0);
		for(int num:nums) {
			if(tieneMayorCantidadDeDígitosPares(num, x)) {
				x = num;
			}
		}
		return x;
	}
	
	public int multiploMasAltoDe_Y_(int x, int y) {
		for (int i=1000; i>-1 ; i--) {
			if((i % x == 0) && (i % y == 0)){
				return i;
			}
		}
		return -1;
	}
	
}
