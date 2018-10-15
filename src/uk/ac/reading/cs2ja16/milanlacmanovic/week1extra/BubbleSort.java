package uk.ac.reading.cs2ja16.milanlacmanovic.week1extra;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args){
		int[] arr = {6,1,2,3,4,5};
		boolean swapped = true;
	      int j = 0;
	      int tmp;
	      while (swapped) {
	            swapped = false;
	            j++;
	            for (int i = 0; i < arr.length - j; i++) {                                       
	                  if (arr[i] > arr[i + 1]) {                          
	                        tmp = arr[i];
	                        arr[i] = arr[i + 1];
	                        arr[i + 1] = tmp;
	                        swapped = true;
	                  }
	            }                
	      }
	      System.out.println(Arrays.toString(arr));
	}
}
