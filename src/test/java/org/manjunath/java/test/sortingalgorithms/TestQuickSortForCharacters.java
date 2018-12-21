package org.manjunath.java.test.sortingalgorithms;

import org.manjunath.java.documentation.TestCase;
import org.manjunath.java.sortingalgorithms.QuickSortForCharacters;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestQuickSortForCharacters {
	private QuickSortForCharacters sort;
	
	@BeforeClass
	public void doInitialization() {
		sort = new QuickSortForCharacters();
	}
	
	@Test(testName = "testIsCharacterArraySorted1")
	@TestCase(Author = "Manjunath",
	testCaseDescription = "to test the given character array is sorted by getSortedArray() method",
	expectedResult = "getSortedArray() method should return the sorted charcter array")
	public void testIsCharacterArraySorted1() {
		Reporter.log("TestQuickSortForCharacters: Start of testIsCharacterArraySorted1() method", true);
		
		try {
			char[] actualArr = {'d', 'f', 'a', 'c', 'h', 'e', 'g', 'b'};
			char[] expectedArr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
			Assert.assertEquals(sort.getSortedArray(actualArr), expectedArr);
		} catch (AssertionError e) {
			Reporter.log("AssertinError Occurred"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception Occurred"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestQuickSortForCharacters: End of testIsCharacterArraySorted1() method", true);
	}
	
	@Test(testName = "testIsCharacterArraySorted2")
	@TestCase(Author = "Manjunath",
	testCaseDescription = "to test the given character array is sorted by getSortedArray() method",
	expectedResult = "getSortedArray() method should return the sorted charcter array")
	public void testIsCharacterArraySorted2() {
		Reporter.log("TestQuickSortForCharacters: Start of testIsCharacterArraySorted2() method", true);
		
		try {
			char[] actualArr = {'d', 'f', 'x', 'q', 'r', 'l', 'g', 'b', 'k', 'p'};
			char[] expectedArr = {'b', 'd', 'f', 'g', 'k', 'l', 'p' ,'q', 'r','x' };
			Assert.assertEquals(sort.getSortedArray(actualArr), expectedArr);
		} catch (AssertionError e) {
			Reporter.log("AssertinError Occurred"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception Occurred"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestQuickSortForCharacters: End of testIsCharacterArraySorted2() method", true);
	}
}
