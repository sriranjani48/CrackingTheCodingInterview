import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testReplaceSpace() {
		Solution resultStr = new Solution();
		String inputStr1 = "My name is Sriranjani";
		String expectedStr1 = "My%20name%20is%20Sriranjani";
		String actualStr1 = resultStr.replaceSpace(inputStr1);
		assertEquals(expectedStr1, actualStr1);
		
		String inputStr2 = "Hello World";
		String expectedStr2 = "Hello%20World";
		String actualStr2 = resultStr.replaceSpace(inputStr2);
		assertEquals(expectedStr2, actualStr2);
		
		String inputStr3 = "  My  Name  is     Sri ranjani   ";
		String expectedStr3 = "My%20%20Name%20%20is%20%20%20%20%20Sri%20ranjani";
		String actualStr3 = resultStr.replaceSpace(inputStr3);
		assertEquals(expectedStr3, actualStr3);
	}

}