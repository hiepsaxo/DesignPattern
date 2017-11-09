package com.chilvas.example2;

@FunctionalInterface
public interface Function<T, R> {
	
	R apply(T t);
	
}

