package org.manjunath.java.sortingalgorithms;

public class CharacterMergeSort {
	
	private void merge (char[] left, char[] right, char[] arr) {
		int leftLength = left.length;
		int rightLength = right.length;
		int i = 0, j = 0, k = 0;
		
		while (i < leftLength && j < rightLength) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		
		while (i < leftLength) {
			arr[k] = left[i];
			i++;
			k++;
		}
		
		while (j < rightLength) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}
	
	private void mergeSort(char[] arr) {
		if (arr == null)
			return;
		
		if (arr.length > 1) {
			int mid = arr.length / 2;
			
			char[] left = new char[mid];
			char[] right = new char[arr.length - mid];
			
			for (int i = 0; i < mid; i++)
				left[i] = arr[i];
			for (int i = mid; i < arr.length; i++)
				right[i-mid] = arr[i];
			
			
			mergeSort(left);
			mergeSort(right);
			merge(left, right, arr);			
		}
	}
	
	public char[] getSortedArray(char[] arr) {
		mergeSort(arr);
		
		return arr;
	}
}
