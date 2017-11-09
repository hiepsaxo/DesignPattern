package com.chilvas.example2;

import java.util.Comparator;

import com.chilvas.example1.Apple;

public class TypeInferenceExample {
	
	public static void main(String[] args) {
		Comparator<Apple> comparator = (Apple a1,Apple a2)->((Integer)a1.getWeight()).compareTo((Integer)a2.getWeight());
		
		Comparator<Apple> comparatorTypeInference = (a1,a2)->((Integer)a1.getWeight()).compareTo((Integer)a2.getWeight());
	}
	
}

