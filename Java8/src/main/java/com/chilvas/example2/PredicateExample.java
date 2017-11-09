package com.chilvas.example2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	
	public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
		List<T> result = new ArrayList<>();
		for (T t : list) {
			if (predicate.test(t)) {
				result.add(t);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		List<String> usernames = Arrays.asList("ifi","nttdata","ifi 1");
		List<String> usernamesFilterByName = filter(usernames, (String username)-> username.contains("ifi"));
		System.out.println(usernamesFilterByName);
	}
	
}

