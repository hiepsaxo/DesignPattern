package com.chilvas.example2;

import java.util.function.Supplier;

import com.chilvas.example1.Apple;

public class ConstructorExample {
	
	public static void main(String[] args) {
		Supplier<Apple> supplier1 = Apple::new;
		Apple a1 = supplier1.get();
		
		Supplier<Apple> supplier2 = () -> new Apple();
		Apple a2 = supplier2.get();
	}
	
	public static void main1(String[] args) {
		Function<Integer, Apple> function1 = Apple::new;
		Apple a1 = function1.apply(110);
		
		Function<Integer, Apple> function2 = (weight) -> new Apple(weight);
		Apple a2 = function2.apply(110);
	}
}


