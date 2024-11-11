package dev.personal.my.first.java.clase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;


class AppTest {
    
    @Test
    void testApp() {
        
    }

    @Test
    void testPrintToConsole (){

        ByteArrayOutputStream capturarSalida = new ByteArrayOutputStream();
        PrintStream salida = new PrintStream(capturarSalida); 
        System.setOut(salida);

    Person testPersona = new Person("Bryan", "bazurco", "AZ987654", LocalDate.of(1995, 05, 10), "Colombia", 'H');
    testPersona.printToConsole();

    String expectedOutput = "Name:Bryan" + System.lineSeparator() +
        "Lastname:bazurco" + System.lineSeparator() +
        "Dni:AZ987654" + System.lineSeparator() +
        "Birthdate:1995-05-10" + System.lineSeparator() +
        "Country:Colombia" + System.lineSeparator() + 
        "Gender:H" + System.lineSeparator();
        
    String actualOutput = capturarSalida.toString();

    assertEquals(expectedOutput, actualOutput);
    }
}
