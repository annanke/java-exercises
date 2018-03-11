package pl.edu.agh.java.exercises.arrays;

import java.util.Arrays;

/**
 * Given an array, return true if there is a place to split the array so that
 * the sum of the numbers on one side is equal to the sum of the numbers on the
 * other side.
 * 
 * Dla zadanej tablicy zwróć true, jeśli da się tak rozmieścić jej elementy, że
 * suma jej elementów w lewej i w prawej połowie będzie równa.
 * 
 * @see http://codingbat.com/prob/p158767
 */
public class ArrayBalance {
	public boolean canBalance(int[] array) {
		
		int length = array.length;
		int[] array1 = new int[length / 2];
		int[] array2 = new int[length / 2];
		Arrays.sort(array);
		
		for (int i = 0; i < length / 2; i = i + 1) {

			int smallerElem = 0;
			int biggerElem = 0;
			if (array[(length - 1 - 2 * i)] < array[(length - 1 - 2 * i) - 1]) {
				smallerElem = array[(length - 1 - 2 * i)];
				biggerElem = array[(length - 1 - 2 * i) - 1];
			} else {
				smallerElem = array[(length - 1 - 2 * i) - 1];
				biggerElem = array[(length - 1 - 2 * i)];
			}
			if (sumArrayElements(array1) > sumArrayElements(array2)) {
				array1[i] = smallerElem;
				array2[i] = biggerElem;
			} else {
				array1[i] = biggerElem;
				array2[i] = smallerElem;
			}
		}

		int sumA = sumArrayElements(array1);
		int sumB = sumArrayElements(array2);

		if (sumA == sumB) {
			return true;

		} else if (sumA != sumB && length % 2 != 0) {
			int arrayFirstElem = array[0];
			boolean isEqual=false;
			for (int i = 0; i < array1.length; i++) {
				if (sumA + arrayFirstElem - array1[i] == sumB) {
					isEqual=true;
					break;
				}
			}return isEqual;
			
		} else {
			return false;
		}
	}

	private int sumArrayElements(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				sum = sum + array[i];
			}
		}
		return sum;
	}
}
