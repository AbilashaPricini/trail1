package com.in28minutes.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessImplStubTest {

	@Test
	void findGreatestFromAllData_basicScenario() {
		DataService dataServiceStub = new DataServiceStub1();
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
		int max = businessImpl.findGreatestFromAllData();
		assertEquals(25, max);
	}
	
	@Test
	void findGreatestFromAllData_withOneValue() {
		DataService dataServiceStub = new DataServiceStub2();
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
		int max = businessImpl.findGreatestFromAllData();
		assertEquals(35, max);
	}

}

class DataServiceStub1 implements DataService{

	@Override
	public int[] retrieveAllData() {
		return new int[]{25,15,5};
	}
	
}

class DataServiceStub2 implements DataService{

	@Override
	public int[] retrieveAllData() {
		return new int[]{35};
	}
	
}
