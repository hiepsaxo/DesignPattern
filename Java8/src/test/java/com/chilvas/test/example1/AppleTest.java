package com.chilvas.test.example1;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.chilvas.example1.Apple;

public class AppleTest {

	@Test
	public void test() {
		List<Apple> apples = new ArrayList<Apple>();
		Apple apple = new Apple();
		apple.setColor("green");
		apple.setWeight(100);
		apples.add(apple);
		apple = new Apple();
		apple.setColor("red");
		apple.setWeight(160);
		apples.add(apple);
		apple = new Apple();
		apple.setColor("green");
		apple.setWeight(180);
		apples.add(apple);

//		List<Apple> greenApples = AppleUtil.filterApples(apples, AppleUtil::isGreenApple);
//        System.out.println(greenApples);
	}
	
}
