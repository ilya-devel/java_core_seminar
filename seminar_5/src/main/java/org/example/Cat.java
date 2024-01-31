package org.example;

import java.io.Serializable;
import java.util.Objects;

public class Cat implements Serializable {
    private String name;
    private int age;
    private String color;
    private Character gender;
    private String breed;

    public Cat(String name, int age, String color, Character gender, String breed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.gender = gender;
        this.breed = breed;
    }

    public void getVoice() {
        System.out.println("Мяу!!!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(color, cat.color) && Objects.equals(gender, cat.gender) && Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color, gender, breed);
    }
}
