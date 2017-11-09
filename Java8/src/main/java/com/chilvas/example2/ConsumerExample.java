package com.chilvas.example2;

import java.util.Arrays;
import java.util.List;

public class ConsumerExample {

	public static <T> void forEach(List<T> list, Consumer<T> consumer) {
		for (T t : list) {
			consumer.accept(t);
		}
	}

	public static void main(String[] args) {
		List<String> users = Arrays.asList("ifi", "nttdata");
		forEach(users, (String user) -> System.out.println(user));
	}
	
}

