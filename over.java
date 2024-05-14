package cscorner;
class Animal {
    void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    // Method Overriding
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }

    // Method Overloading
    void makeSound(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Woof!");
        }
    }
}

public class over {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        // Method Overriding
        System.out.println("Calling makeSound() on Animal:");
        animal.makeSound();

        System.out.println("\nCalling makeSound() on Dog:");
        dog.makeSound();

        // Method Overloading
        System.out.println("\nCalling makeSound(int count) on Dog:");
        dog.makeSound(3);
    }
}

