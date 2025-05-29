package com.Inheritance;

class Animal {
    protected String name;
    protected String habitat;

    public Animal(String name, String habitat) {
        this.name = name;
        this.habitat = habitat;
    }

    public void displayHabitat() {
        System.out.println("Animal: " + name);
        System.out.println("Habitat: " + habitat);
    }
}

class Mammal extends Animal {
    private boolean isWarmBlooded;

    public Mammal(String name, String habitat, boolean isWarmBlooded) {
        super(name, habitat);
        this.isWarmBlooded = isWarmBlooded;
    }

    public void displayMammalInfo() {
        displayHabitat();
        System.out.println("Warm-Blooded: " + (isWarmBlooded ? "True" : "False"));
    }
}

class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, String habitat, boolean canFly) {
        super(name, habitat);
        this.canFly = canFly;
    }

    public void displayBirdInfo() {
        displayHabitat();
        System.out.println("Can Fly: " + (canFly ? "Yes" : "No"));
    }
}

class Reptile extends Animal {
    private boolean isColdBlooded;

    public Reptile(String name, String habitat, boolean isColdBlooded) {
        super(name, habitat);
        this.isColdBlooded = isColdBlooded;
    }

    public void displayReptileInfo() {
        displayHabitat();
        System.out.println("Cold-Blooded: " + (isColdBlooded ? "Yes" : "No"));
    }
}

public class Task4 {
	    public static void main(String[] args) {
	        Mammal mammal = new Mammal("Elephant", "Savannah", true);
	        Bird bird = new Bird("Eagle", "Mountains", true);
	        Reptile reptile = new Reptile("Crocodile", "Swamp", true);

	        System.out.println("---- Mammal ----");
	        mammal.displayMammalInfo();

	        System.out.println("\n---- Bird ----");
	        bird.displayBirdInfo();

	        System.out.println("\n---- Reptile ----");
	        reptile.displayReptileInfo();
	    }
	}



