package com.thirteen;

public class TestAbstractio {
 public static void main(String[] args) {
		/*
		 * Canine c = new Canine("Lilah", "Grey/White", 5, 'F'); You cann't
		 * instantiate abstraction class. You will get error like error: Canine
		 * is abstract; cannot be instantiated. This type of class is only meant
		 * to serve as a base or blueprint for connecting the subclasses that
		 * inherit (extend) it. While we can't instantiate Canine, we can
		 * instantiate its subclasses, KleeKai and SiberianHusky.
		 */
	 Canine c = new KleeKai("Lilah", "Grey/White", 5, 'F');
	 Canine d = new SiberianHusky("Alaska", "Grey/Black/White", 18, 'F');
	 c.printInfo();
	 d.printInfo();
 }
}
