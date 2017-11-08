package com.chilvas.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FilteringApples {

	public static List<Apple> filteApples(List<Apple> inventory, String color, int weight, boolean flag) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if ((flag && apple.getColor().equalsIgnoreCase(color)) || (!flag && apple.getWeight() > weight)) {
				result.add(apple);
			}
		}
		return result;
	}

	public interface ApplePredicate {
		boolean test(Apple apple);
	}

	public class AppleHeavyWeightPredicate implements ApplePredicate {

		@Override
		public boolean test(Apple apple) {
			return apple.getWeight() > 150;
		}
	}

	public class AppleGreenColorPredicate implements ApplePredicate {

		@Override
		public boolean test(Apple apple) {
			return "green".equalsIgnoreCase(apple.getColor());
		}
	}

	public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

	public static class AppleRedAndHeadvyPredicate implements ApplePredicate {
		@Override
		public boolean test(Apple apple) {
			return "red".equalsIgnoreCase(apple.getColor()) && apple.getWeight() > 150;
		}
	}
	@FunctionalInterface
	public interface Predicate<T> {
		boolean test(T t);
	}

	public static <T> List<T> filter(List<T> list, Predicate<T> p) {
		List<T> result = new ArrayList<>();
		for (T e : list) {
			if (p.test(e)) {
				result.add(e);
			}
		}
		return result;
	}

	public static void main1(String[] args) {
		List<Apple> apples = Arrays.asList(new Apple(160, "red"), new Apple(30, "red"));

		List<Apple> redAndHeavyApples = filter(apples,
				(Apple apple) -> "red".equals(apple.getColor()) && apple.getWeight() > 150);
	}

	public static void main(String[] args) {
		Comparator<Apple> byWeight = (Apple a1,Apple a2)->((Integer)a1.getWeight()).compareTo((Integer)a2.getWeight());
	}

}
