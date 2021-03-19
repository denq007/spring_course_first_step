package org.example;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callYouPet()
    {
        System.out.println("Hi");
        pet.say();
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Person(Pet pet) {
        System.out.println("Create Person");
        this.pet = pet;
    }
    public Person() {
        System.out.println("Create Person");
    }
}
