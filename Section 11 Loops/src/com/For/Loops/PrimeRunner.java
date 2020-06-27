package com.For.Loops;

public class PrimeRunner {

	public static void main(String[] args) {
		
		Prime isPrime = new Prime(5);
		
		boolean prime = isPrime.prime();
		System.out.println(" " +prime);
		
		int sum = isPrime.sumUptoN();
		System.out.println(" " +sum);
	
		
	}

}
