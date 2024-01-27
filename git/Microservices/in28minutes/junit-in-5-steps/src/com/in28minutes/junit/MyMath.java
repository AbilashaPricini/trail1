package com.in28minutes.junit;

public class MyMath {
	
	//{1,2,3} => 1+2+3 = 6
	public int calculateSum(int[] numbers) {
		int sum = 0;
		for(int num : numbers) {
			sum += num;
		}
		return sum;
	}
	
	

}
