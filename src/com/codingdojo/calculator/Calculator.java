package com.codingdojo.calculator;

import java.util.ArrayList;

public class Calculator {
	private ArrayList<String> operands = new ArrayList<String>();
	private ArrayList<Double> values = new ArrayList<Double>();
	private double result;
	
	public Calculator() {
	}
	
	// build arrays to hold the alternating values and operands
	public void performOperation(String input) {
		operands.add(input);
	}
	
	public void performOperation(double input) {
		values.add(input);
	}
	
	public void adjustArrays(int index, double value) {
		operands.remove(index);
		values.set(index, value);
		values.remove(index + 1);
	}
	
	// actually perform the operations
	public void calculateExpression() {
		for (int i = 0; i < operands.size(); i++) {
			if (operands.get(i) == "*") {
				double newValue = values.get(i) * values.get(i+1);
				adjustArrays(i, newValue);
			}
			if (operands.get(i) == "/") {
				double newValue = values.get(i) / values.get(i+1);
				adjustArrays(i, newValue);
			}
		}
		while (operands.size() > 1) { // until = is the last operand
			if (operands.get(0) == "+") {
				double newValue = values.get(0) + values.get(1);
				adjustArrays(0, newValue);
			}
			if (operands.get(0) == "-") {
				double newValue = values.get(0) - values.get(1);
				adjustArrays(0, newValue);
			}
			if (operands.get(0) == "*") {
				double newValue = values.get(0) * values.get(1);
				adjustArrays(0, newValue);
			}
			if (operands.get(0) == "/") {
				double newValue = values.get(0) / values.get(1);
				adjustArrays(0, newValue);
			}
		}
		result = values.get(0);
	}

	
	public void getResults() {
		calculateExpression();
		System.out.println(result);
	}
}
