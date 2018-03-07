package pl.edu.agh.java.exercises.arrays;

/**
 * Given n>=0, create an array length n*n with the following pattern, shown here
 * and in the unit tests: for n=3 : {0, 0, 1, 0, 2, 1, 3, 2, 1}
 * 
 * Dla zadanego n>=0 zwróć tablicę o długości n*n utworzoną wg wzoru podanego
 * tutaj oraz w testach jednostkowych: dla n=3: {0, 0, 1, 0, 2, 1, 3, 2, 1}
 * 
 *
 * @see http://codingbat.com/prob/p155405
 */
public class ArraySquareUp {
	public int[] squareUp(int n) {

//		if (n==0) {
//			int[] table0 = new int[n*n]; 
//			return table0;
//		}else {
			int[] table = new int[n*n];
			for (int i=0; i<table.length; i++) {
				table[i]=0;
			}
			int l=0;
			for (int i=table.length-1; i>=0; i=i-n) {
				int j=i;
				int k=1;
				
				while(j>(i-n+l)) {
					table[j]=k;
					k++;
					j--;
					
				}
				l++;
				
			}
			System.out.println("test: ");
			for (int i=0; i<table.length; i++) {
				System.out.print(table[i]+", ");
			}
			System.out.println();
			return table;
			
	//	}
	}
}
