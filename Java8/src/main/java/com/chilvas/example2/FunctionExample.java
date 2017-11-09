package com.chilvas.example2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionExample {
	
	public static <T, R> List<R> map(List<T> list, Function<T, R> function) {
		List<R> result = new ArrayList<>();
		for (T t : list) {
			result.add(function.apply(t));
		}
		return result;
	}
	
	public static void main(String[] args) {
		List<String> listInput= Arrays.asList("ifi","nttdata","hanoi");
		List<Integer> listOfLengths = map(listInput, (String s)->s.length());
		System.out.println(listOfLengths);
	}
}


