package kr.ac.inje.comsi.aop.calc;

public class RecCalculator implements Calculator {

	public long factorial(long num) {
		if (num == 0) return 1;
		else 
		return num * factorial(num-1);

	}

}