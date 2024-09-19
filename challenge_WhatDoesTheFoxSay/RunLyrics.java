/**
 * 
 */
package challenge_WhatDoesTheFoxSay;

/**
 * 
 */
public class RunLyrics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal dog = new Animal();
		dog.setName("Dog");
		dog.setNoise("WOOF");

		Animal cat = new Animal();
		cat.setName("Cat");
		cat.setNoise("MEOW");

		Animal bird = new Animal();
		bird.setName("Bird");
		bird.setNoise("TWEAK");

		Animal mouse = new Animal();
		mouse.setName("Mouse");
		mouse.setNoise("SQUEAK");

		Animal fox = new Animal();
		fox.setNoise("Ring-ding-ding-ding-dingeringeding!");
		fox.setEyeColour("BLUE");
		fox.setNoseType("POINTY");
		fox.setPawSize("TINY");
		fox.setFurColour("RED");

		// Output lyrics

		// Dog

		System.out.print(dog.getName());
		Animal.printGoes();
		dog.makeNoise();

		// Cat

		System.out.print(cat.getName());
		Animal.printGoes();
		cat.makeNoise();

		// Bird

		System.out.print(bird.getName());
		Animal.printGoes();
		bird.makeNoise();

		// Mouse

		System.out.print(mouse.getName());
		Animal.printGoes();
		mouse.makeNoise();

		// But there is one sound...
		fox.printButThereIsOneSound();

		// Fox Chorus
		fox.whatDoesTheFoxSay();
		fox.makeNoise();
		fox.makeNoise();
		fox.makeNoise();

		// Fox

		System.out.println("Big " + fox.getEyeColour() + " eyes");
		System.out.println(fox.getNoseType() + " nose");
		System.out.println(fox.getPawSize() + " paws");
		System.out.println("Your fur is " + fox.getFurColour());

		// Fox Chorus
		fox.whatDoesTheFoxSay();
		fox.makeNoise();
		fox.makeNoise();
		fox.makeNoise();

	}

}
