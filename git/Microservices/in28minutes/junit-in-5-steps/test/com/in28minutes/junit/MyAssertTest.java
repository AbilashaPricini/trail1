package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {
	
	List<String> todos = Arrays.asList("AWS", "Azure", "DevOps");

	@Test
	void test() {
		boolean test = todos.contains("DevOps");
		//assertEquals(true, test);
		assertTrue(test);
		//assertNull, assertNotNull
		assertArrayEquals(new int[] {1,2}, new int[] {1,2});
	
	}

}
