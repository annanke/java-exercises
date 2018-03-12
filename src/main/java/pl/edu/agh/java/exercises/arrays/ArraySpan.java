package pl.edu.agh.java.exercises.arrays;

/**
 * Consider the leftmost and righmost appearances of some value in an array.
 * We'll say that the "span" is the number of elements between the two
 * inclusive. A single value has a span of 1. Returns the largest span found in
 * the given array. (Efficiency is not a priority.)
 * 
 * Przyjmijmy, że odstęp "span" danej wartości w tablicy to liczba elementów
 * pomiędzy pierwszym i ostatniem jej wystąpieniem, włączając je same. Jeśli
 * wartość pojawia się w tablicy tylko raz, jej "span" jest równe 1. Metoda
 * maxSpan powinna zwracać największy istniejący odstęp w zadanej tablicy.
 * 
 * @see http://codingbat.com/prob/p189576
 */
public class ArraySpan {
	public int maxSpan(int[] array) {

		int maxSpanValue=0;
		String stringFromArray="";
		for (int element : array) {
			stringFromArray=stringFromArray+element;
		}
		for(int i=0; i<array.length; i++) {
			int firstIndex=stringFromArray.indexOf(Integer.toString(array[i]));
			int lastIndex=stringFromArray.lastIndexOf(Integer.toString(array[i]));
			if ((lastIndex-firstIndex)>=maxSpanValue) {
				maxSpanValue=lastIndex-firstIndex+1;
				System.out.println(maxSpanValue);
			}
		}
		return maxSpanValue;
	}
}
