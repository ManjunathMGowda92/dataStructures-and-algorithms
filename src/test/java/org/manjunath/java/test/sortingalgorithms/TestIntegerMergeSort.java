package org.manjunath.java.test.sortingalgorithms;

import org.manjunath.java.documentation.TestCase;
import org.manjunath.java.sortingalgorithms.IntegerMergeSort;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestIntegerMergeSort {
	private IntegerMergeSort sort;
	
	@BeforeClass
	public void doInitialization() {
		sort = new IntegerMergeSort();
	}
	
	@Test(testName = "testSortIntegerArray")
	@TestCase(Author = "Manjunath",
	testCaseDescription = "to test the resulted Array is sorted or not",
	expectedResult = "getSortedArray() method should return sorted Integer array")
	public void testSortIntegerArray1() {
		Reporter.log("TestIntegerMergeSort: Start of testSortIntegerArray1() method", true);		
		try {
			int[] actualArr = {5, 4, 7, 2, 8, 1, 9, 3, 6};
			int[] expectedArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
			Assert.assertEquals(sort.getSortedArray(actualArr), expectedArr);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestIntegerMergeSort: End of testSortIntegerArray1() method", true);
	}
	
	@Test(testName = "testSortIntegerArray2")
	@TestCase(Author = "Manjunath",
	testCaseDescription = "to test the resulted Array is sorted or not",
	expectedResult = "getSortedArray() method should return sorted Integer array")
	public void testSortIntegerArray2() {
		Reporter.log("TestIntegerMergeSort: Start of testSortIntegerArray2() method", true);		
		try {
			int[] actualArr = {55, 44, 67, 33, 12, 88, 77, 99, 34};
			int[] expectedArr = {12, 33, 34, 44, 55, 67, 77, 88, 99};
			Assert.assertEquals(sort.getSortedArray(actualArr), expectedArr);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestIntegerMergeSort: End of testSortIntegerArray2() method", true);
	}
}
