

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Lab2Tester {

// sum
	
	@Test
	public void testSum1() {
		int start = 0;
		int end = 5; 
		int  sum= 0;
		for (int i = start ; i <= end ; i++) 
			sum  += i;	
		assertEquals("Failed at sum (" + start + ", " + end + ")", sum, Lab2.sum(start, end));	
	}
	
	@Test
	public void testSum2() {
		int start = 0;
		int end = 0; 
		int  sum= 0;
		for (int i = start ; i <= end ; i++) 
			sum  += i;
		assertEquals("Failed at sum (" + start + ", " + end + ")", sum, Lab2.sum(start, end));	
	}
	
	@Test
	public void testSum3() {
		int start = 1;
		int end = 1; 
		int  sum= 0;
		for (int i = start ; i <= end ; i++) 
			sum  += i;
		assertEquals("Failed at sum (" + start + ", " + end + ")", sum, Lab2.sum(start, end));	
	}
	
//MakeString

	@Test
	public void testMakeString1() {
		char init = '*'; 
		int n = 5;
		String result = ""; 
		for (int i = 0 ; i < n ; i++)
			result += init;
		assertEquals("Failed at makeString(" + init + ", " + n + ")", result, Lab2.makeString(init, n));	
	}
	
	@Test
	public void testMakeString2() {
		char init = '*'; 
		int n = 0;
		String result = ""; 
		for (int i = 0 ; i < n ; i++)
			result += init;
		assertEquals("Failed at makeString(" + init + ", " + n + ")", result, Lab2.makeString(init, n));	
	}
	
	@Test
	public void testMakeString3() {
		char init = '*'; 
		int n = 1;
		String result = ""; 
		for (int i = 0 ; i < n ; i++)
			result += init;
		assertEquals("Failed at makeString(" + init + ", " + n + ")", result, Lab2.makeString(init, n));	
	}
	
//Interlace
	
	@Test
	public void testInterlace1() {
		String str = "";
		assertEquals("Failed: interlace(\"a\",\"b\",0)", str, Lab2.interlace("a","b",0));
	}
	
	@Test
	public void testInterlace2() {
		String str = "*";
		assertEquals("Failed: interlace(\"*\",\"-\",1)", str, Lab2.interlace("*","-",1));
	}
	
	@Test
	public void testInterlace3() {
		String str = "ababab";
		assertEquals("Failed: interlace(\"a\",\"b\",6)", str, Lab2.interlace("a","b",6));
	}
	
	@Test
	public void testInterlace4() {
		String str = "ababa";
		assertEquals("Failed: interlace(\"a\",\"b\",5)", str, Lab2.interlace("a","b",5));
	}
	
//GetSubstring

	@Test
	public void testGetSubstring1() {
		//String str1 = "x + y + z - ( y * z) / 3 * n ";
		//char open = '(';
		//char close = ')';
		String result = " y * z";
		assertEquals("Failed: getSubstring(\"x + y + z - ( y * z) / 3 * n \", \"(\", \")\")", result, Lab2.getSubstring("x + y + z - ( y * z) / 3 * n ", '(', ')'));
	}

	@Test
	public void testGetSubstring2() {
		//String str1 = "(a)";
		//char open = '(';
		//char close = ')';
		String result = "a";
		assertEquals("Failed: getSubstring(\"(a)\")", result, Lab2.getSubstring("(a)", '(', ')'));
	}
	
	@Test
	public void testGetSubstring3() {
		//String str1 = "()";
		//char open = '(';
		//char close = ')';
		String result = "";
		assertEquals("Failed: getSubstring(\"()\")", result, Lab2.getSubstring("()", '(', ')'));
	}
	
//DecimalToBinary

	@Test
	public void testDecimalToBinary1() {
		//decimal = 23; 
		String binary = "10111";
		assertEquals("Failed: decimalToBinary(23)", binary, Lab2.decimalToBinary(23));
	}
	
	@Test
	public void testDecimalToBinary2() {
		//decimal = 1; 
		String binary = "1";
		assertEquals("Failed: decimalToBinary(1)", binary, Lab2.decimalToBinary(1));
	}
	
	@Test
	public void testDecimalToBinary3() {
		//decimal = 0; 
		String binary = "0";
		assertEquals("Failed: decimalToBinary(0)", binary, Lab2.decimalToBinary(0));
	}
	
	@Test
	public void testDecimalToBinary4() {
		//decimal = 2; 
		String binary = "10";
		assertEquals("Failed: decimalToBinary(2)", binary, Lab2.decimalToBinary(2));
	}


}