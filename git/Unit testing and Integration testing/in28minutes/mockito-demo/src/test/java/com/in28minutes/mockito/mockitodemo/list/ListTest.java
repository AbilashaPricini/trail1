package com.in28minutes.mockito.mockitodemo.list;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ListTest {

	@Test
	void simpleReturns() {
		
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(5);
		assertEquals(5, listMock.size());
	}
	
	@Test
	void multipleReturns() {
		
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(5).thenReturn(8);
		assertEquals(5, listMock.size());
		assertEquals(8, listMock.size());
	
	}
	
	@Test
	void specificParameters() {
		
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("SomeString");
		assertEquals("SomeString", listMock.get(0));
		assertEquals(null, listMock.get(1));
	
	}
	
	@Test
	void genericReturns() {
		
		List listMock = mock(List.class);
		when(listMock.get(Mockito.anyInt())).thenReturn("SomeOtherString");
		assertEquals("SomeOtherString", listMock.get(0));
		assertEquals("SomeOtherString", listMock.get(1));
	
	}
	
	

}
