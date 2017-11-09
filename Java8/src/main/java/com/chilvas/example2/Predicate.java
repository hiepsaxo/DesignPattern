package com.chilvas.example2;

@FunctionalInterface
public interface Predicate<T> {
	boolean test(T t);
}

