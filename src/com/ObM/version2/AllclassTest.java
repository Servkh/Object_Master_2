package com.ObM.version2;

public class AllclassTest {

	public static void main(String[] args) {
		Ninja ninja = new Ninja();
		
		Samurai samurai1 = new Samurai();
		Samurai samurai2 = new Samurai();
		
		Wizard wizard1 = new Wizard();
		Wizard wizard2 = new Wizard();
		
		wizard1.fireball(samurai2);
		wizard1.heal(wizard1);
		wizard1.fireball(samurai1).fireball(samurai1);
		ninja.steal(wizard1).runAway();
		ninja.steal(samurai1);
		samurai1.dealthBlow(wizard2);
		samurai1.meditate();
		samurai2.howMany();
		ninja.displayHealth();
		samurai1.displayHealth();
		samurai2.displayHealth();
		wizard1.displayHealth();
		wizard2.displayHealth();

	}

}
