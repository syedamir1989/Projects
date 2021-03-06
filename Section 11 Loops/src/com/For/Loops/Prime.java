package com.For.Loops;

public class Prime {

	private int number;

	public Prime(int number) {
		super();
		this.number = number;
	}

	public boolean prime() {
		for(int i = 2; i <= number-1; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int sumUptoN() {
		int sum = 0;
		for(int i = 1; i<=number; i++) {
			sum = sum + i;
		}
		return sum;
	}
	
}
