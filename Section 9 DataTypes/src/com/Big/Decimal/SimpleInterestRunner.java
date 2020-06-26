package com.Big.Decimal;

import java.math.BigDecimal;

public class SimpleInterestRunner {

	public static void main(String[] args) {
		
		SimpleInterest calculator = new SimpleInterest("6000.00", "10.00");
		BigDecimal totalValue = calculator.calculateTotalValue(5);
		System.out.println(totalValue);
		
	}

}
