package org.example;

public class Main {
    public static void main(String[] args) {
        @Important
        @SuppressWarnings("unused")
        Cat cat = new Cat("Petro");

        @VeryImportant
        Dog dog = new Dog("Yulia");

        @NotImportant
        Parrot parrot = new Parrot("Volodya");
    }
}