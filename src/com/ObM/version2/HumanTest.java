package com.ObM.version2;

public class HumanTest {

	public static void main(String[] args) {
		Human human = new Human();
		Human human1 = new Human();
		human.attack(human1);
		System.out.println("Human1 health");
		human1.displayHealth();

	}

}
