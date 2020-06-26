package com.Oops.Encapsulation;

public class BookRunner {

	public static void main(String[] args) {
		
		Books artOfJavaProgramming = new Books();
		Books effectiveJava = new Books();
		Books cleanCode = new Books();

		artOfJavaProgramming.open();
		effectiveJava.open();
		cleanCode.open();

		artOfJavaProgramming.setnoOfCopies(10);
		effectiveJava.setnoOfCopies(5);
		cleanCode.setnoOfCopies(2);

		artOfJavaProgramming.incNoOfCopies(5);
		effectiveJava.incNoOfCopies(3);
		cleanCode.incNoOfCopies(2);

		artOfJavaProgramming.decNoOfCopies(5);
		effectiveJava.decNoOfCopies(3);
		cleanCode.decNoOfCopies(2);

		System.out.println(artOfJavaProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
		
	}

}
