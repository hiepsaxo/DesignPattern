package com.chilvas.example2;

public class MyMath {

	public static int action(int a, int b, MyFunction function) {
		return function.doSomething(a, b);
	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public int max(int a, int b) {
		return a > b ? a : b;
	}

	public static void main(String[] args) {
		int a = 100;
		int b = 30;

		int sum = action(a, b, MyMath::sum);
		int max = action(a, b, new MyMath()::max);
		System.out.println("Sum: " + sum + ", Max: " + max);
	}
}


