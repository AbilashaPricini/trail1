package com.in28minutes.mockito.mockitodemo.business;

public class SomeBusinessImpl {
	
	private DataService dataService;
	
	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findGreatestFromAllData() {
		int[] data = dataService.retrieveAllData();	
		
		int max = Integer.MIN_VALUE;
		
		for(int value : data) {
			if(value > max) {
				max = value;
			}
		}
		return max;
	}

}

interface DataService{
	int[] retrieveAllData();
}
