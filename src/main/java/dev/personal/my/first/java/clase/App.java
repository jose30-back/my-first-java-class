package dev.personal.my.first.java.clase;

import java.time.LocalDate;

/**
 * Hello world!
 */
public final class App {
    private App() {
    

    }

    public static void main(String[] args) {
        
        Person person1 = new Person("Jose", "Arango", "AY634600", LocalDate.of(1994, 01, 04), "Colombia", 'H');
        person1.printToConsole();

        Person person2 = new Person("Karol", "Muñoz", "AB567879", LocalDate.of(2000, 06, 25), "Colombia",'M');
        person2.printToConsole();

    }

}
