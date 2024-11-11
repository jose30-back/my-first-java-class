package dev.personal.my.first.java.clase;

import java.time.LocalDate;

public class Person {

    String name;
    String lastName;
    String dni;
    LocalDate birthdate;
    String country; 
    char gender;

    public Person(String name, String lastName, String dni, LocalDate birthdate, String country, char gender) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.birthdate = birthdate;
        this.country = country; 
        this.gender = gender;
    }

    public void printToConsole() {
        System.out.println("Name:" + name + System.lineSeparator() +
        "Lastname:" + lastName + System.lineSeparator() +
        "Dni:" + dni + System.lineSeparator() +
        "Birthdate:" + birthdate + System.lineSeparator() +
        "Country:" + country + System.lineSeparator() + 
        "Gender:" + gender);
    } 
}
