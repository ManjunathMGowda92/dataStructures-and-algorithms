package org.manjunath.java.sortingalgorithms;

public class QuickSortForIntegers {

	private static void quickSort(int[] arr, int start, int end) {
		if (start > end)
			return;
		if (start <= end) {
			int partitionIndex = getPartitionIndex(arr, start, end);
			quickSort(arr, start, partitionIndex-1);
			quickSort(arr, partitionIndex+1, end);
		}
	}
	
	private static int getPartitionIndex(int[] arr, int start, int end) {
		int partitionIndex = start;
		int pivot = arr[end];
		
		for (int i = start; i < end; i++) {
			if (arr[i] < pivot) {
				int temp = arr[i];
				arr[i] = arr[partitionIndex];
				arr[partitionIndex] = temp;
				
				partitionIndex++;
			}
		}
		
		int temp = arr[partitionIndex];
		arr[partitionIndex] = arr[end];
		arr[end] = temp;
		return partitionIndex;
	}
	
	public static int[] getSortedArray(int[] arr) {
		quickSort(arr, 0, arr.length-1);
		return arr;
	}
}
