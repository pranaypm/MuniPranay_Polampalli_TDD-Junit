/**
 * 
 */
package Muni_Pranay_Polampalli.TDD_Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author polampalli
 *
 */
class remove_A_Test_Cases {

	/**
	 * @throws java.lang.Exception
	 */
	
	Remove_A_from_String   class_object;
	
	@BeforeEach
	void setUp() throws Exception {
    class_object =new Remove_A_from_String();
	}

	@Test
	void String_Testcase_1() {
		assertEquals("BCD",class_object.Characters_removing("ABCD"));
	}
	
	@Test
	void String_Testcase_2() {
		assertEquals("CD",class_object.Characters_removing("AACD"));
	}
	@Test
	void String_Testcase_3() {
		assertEquals("BCD",class_object.Characters_removing("BACD"));
	}
	@Test
	void String_Testcase_4() {
		assertEquals("BBAA",class_object.Characters_removing("BBAA"));
	}
	@Test
	void String_Testcase_5() {
		assertEquals("BAA",class_object.Characters_removing("AABAA"));
	}
	@Test
	void String_Testcase_6() {
		assertEquals("PRANAY",class_object.Characters_removing("PRANAY"));
	}

}
