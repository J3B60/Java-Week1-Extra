package uk.ac.reading.cs2ja16.milanlacmanovic.week1extra;

import java.util.Arrays;

public class Eratosthenes {
	
	public static int[] array = new int[50];
	public int sieveCount = 0;
	public int[] sieve;
	public static int[] arrayofprimes;
	public static void sieveTask(){
		arrayofprimes = new int[array.length];
		arrayofprimes = Arrays.copyOf(array, array.length);
		for (int i = 0; i < array.length; i++){
			if (arrayofprimes[i] == 0){
				// NEED SOMETHING TO DELETE ITEMS ArrayUtils.remove(arrayofprimes, i);
				
			}
			//check if prime by dividing by smaller numbers (find factors [maybe there is a library function to help with this])
			//then find multiples and delete them from arrayofprimes and repeat
		}
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 50; i++){
			array[i] = i;
		}
		sieveTask();
	}
}
