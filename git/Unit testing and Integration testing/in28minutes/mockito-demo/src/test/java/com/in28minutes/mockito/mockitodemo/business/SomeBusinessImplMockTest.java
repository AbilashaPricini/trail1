package com.in28minutes.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {
	
	@Mock
	private DataService dataServiceMock;
	
	@InjectMocks
	private SomeBusinessImpl businessImpl;
	
	//DataService dataServiceMock = mock(DataService.class);

	@Test
	void findGreatestFromAllData_basicScenario() {
	
		//dataServiceMock.retrieveAllData() => new int[] {25,15,19)
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {25,15,19});
		
		//SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int max = businessImpl.findGreatestFromAllData();
		assertEquals(25, max);
	}
	
	@Test
	void findGreatestFromAllData_OneValue() {
	
		//dataServiceMock.retrieveAllData() => new int[] {25,15,19)
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {25});
		
		//SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int max = businessImpl.findGreatestFromAllData();
		assertEquals(25, max);
	}
	
	@Test
	void findGreatestFromAllData_emptyArray() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int [] {});
		assertEquals(Integer.MIN_VALUE, businessImpl.findGreatestFromAllData());
	
	}
	
}
