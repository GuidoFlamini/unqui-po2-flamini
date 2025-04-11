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
}
