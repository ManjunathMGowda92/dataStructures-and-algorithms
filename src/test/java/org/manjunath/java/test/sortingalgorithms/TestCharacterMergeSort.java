package org.manjunath.java.test.sortingalgorithms;

import org.manjunath.java.documentation.TestCase;
import org.manjunath.java.sortingalgorithms.CharacterMergeSort;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCharacterMergeSort {
	private CharacterMergeSort sort;
	
	@BeforeClass
	public void doInitialization() {
		sort = new CharacterMergeSort();
	}
	
	@Test(testName = "testSortingCharacterArray1")
	@TestCase(Author = "Manjunath",
	testCaseDescription = "to test the getSortedArray() method to return sorted character array",
	expectedResult = "getSortedArray() should return the sorted character array")
	public void testSortingCharacterArray1() {
		Reporter.log("TestCharacterMergeSort: Start of testSortingCharacterArray1() method", true);
		
		try {
			char[] actualArr = {'g', 'a', 'e', 'k', 'i', 'p', 'd', 'b', 'r', 'j'};
			char[] expectedArr = {'a', 'b', 'd', 'e', 'g', 'i', 'j', 'k', 'p', 'r' };
			Assert.assertEquals(sort.getSortedArray(actualArr), expectedArr);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestCharacterMergeSort: End of testSortingCharacterArray1() method", true);
	}
	
	
	@Test(testName = "testSortingCharacterArray2")
	@TestCase(Author = "Manjunath",
	testCaseDescription = "to test the getSortedArray() method to return sorted character array",
	expectedResult = "getSortedArray() should return the sorted character array")
	public void testSortingCharacterArray2() {
		Reporter.log("TestCharacterMergeSort: Start of testSortingCharacterArray2() method", true);
		
		try {
			char[] actualArr = {'l', 'a', 'm', 'k','p', 'd', 'o', 'b', 'r', 'j'};
			char[] expectedArr = {'a', 'b', 'd','j', 'k', 'l','m', 'o', 'p', 'r' };
			Assert.assertEquals(sort.getSortedArray(actualArr), expectedArr);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestCharacterMergeSort: End of testSortingCharacterArray2() method", true);
	}
}
