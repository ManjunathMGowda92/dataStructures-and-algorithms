package org.manjunath.java.test.sortingalgorithms;

import org.manjunath.java.documentation.TestCase;
import org.manjunath.java.sortingalgorithms.QuickSortForIntegers;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestQuickSortForIntegers {
	private QuickSortForIntegers sortIntegers;
	
	@BeforeClass
	public void doInitialization() {
		sortIntegers = new QuickSortForIntegers();
	}
	
	@Test(testName = "testIsArraySortedOrNot1")
	@TestCase(Author = "Manjunath HM",
	testCaseDescription = "To test getSortedArray() method returns sorted Array or not",
	expectedResult = "getSortedArray() method should return sorted Array")
	public void testIsArraySortedOrNot1() {
		Reporter.log("TestQuickSortForIntegers: Start of testIsArraySortedOrNot1() method", true);
		
		try {
			int[] inputArr = {7, 4, 3, 2, 6, 8, 9, 5, 1};
			int[] expectedArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
			
			Assert.assertEquals(sortIntegers.getSortedArray(inputArr), expectedArr);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestQuickSortForIntegers: Start of testIsArraySortedOrNot1() method", true);
	}
	
	
	@Test(testName = "testIsArraySortedOrNot2")
	@TestCase(Author = "Manjunath HM",
	testCaseDescription = "To test getSortedArray() method returns sorted Array or not",
	expectedResult = "getSortedArray() method should return sorted Array")
	public void testIsArraySortedOrNot2() {
		Reporter.log("TestQuickSortForIntegers: Start of testIsArraySortedOrNot2() method", true);
		
		try {
			int[] inputArr = {70, 40, 30, 20, 60, 80, 90, 50, 10};
			int[] expectedArr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
			
			Assert.assertEquals(sortIntegers.getSortedArray(inputArr), expectedArr);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestQuickSortForIntegers: Start of testIsArraySortedOrNot2() method", true);
	}
}
