package class19;

public class Pet {
    String name;
    String breed;
    String color;
    int age;

    // Constructor to initialize pet attributes
    public Pet(String name, String breed, String color, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }
}

class Dog extends Pet {
    // Constructor chaining using super() to call the superclass constructor
    public Dog(String name, String breed, String color, int age) {
        super(name, breed, color, age);
    }

    // Method to print the name of the dog
    public void printName() {
        System.out.println(name);
    }
}

class Cat extends Pet {
    // Constructor chaining using super() to call the superclass constructor
    public Cat(String name, String breed, String color, int age) {
        super(name, breed, color, age);
    }

    // Method to print the age of the cat
    public void printAge() {
        System.out.println(age);
    }
}
