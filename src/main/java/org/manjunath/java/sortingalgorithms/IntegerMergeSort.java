package org.manjunath.java.sortingalgorithms;

public class IntegerMergeSort {

	private void merge(int[] left, int[] right, int[] main) {
		int leftLength = left.length;
		int rightLength = right.length;
		int i = 0, j = 0, k = 0;
		
		while (i < leftLength && j < rightLength) {
			if (left[i] <= right[j]) {
				main[k] = left[i];
				i++;
			} else {
				main[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i < leftLength) {
			main[k] = left[i];
			i++;
			k++;
		}
		
		while(j < rightLength) {
			main[k] = right[j];
			j++;
			k++;
		}
	}
	
	private void mergeSort(int[] main) {
		if (main == null)
			return;
		
		if (main.length > 1) {
			int mid = main.length /2;
			int[] left = new int[mid];
			int[] right = new int[main.length - mid];
			
			for (int i = 0; i < mid; i++)
				left[i] = main[i];
			for (int i = mid; i < main.length; i++)
				right[i-mid] = main[i];
			
			mergeSort(left);
			mergeSort(right);
			merge(left, right, main);
		}
	}
	
	public int[] getSortedArray(int[] arr) {
		mergeSort(arr);
		return arr;
	}
}
