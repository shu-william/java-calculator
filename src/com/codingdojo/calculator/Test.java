package com.codingdojo.calculator;

public class Test {

	public static void main(String[] args) {
		Calculator C1 = new Calculator();
		C1.performOperation(10.5);
		C1.performOperation("+");
		C1.performOperation(5.2);
		C1.performOperation("*");
		C1.performOperation(10);
		C1.performOperation("/");
		C1.performOperation(13);
		C1.performOperation("-");
		C1.performOperation(14);
		C1.performOperation("=");
		C1.getResults();
	}

}
