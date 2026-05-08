////////////////////////////////////////////////////////////////////
// PIETRO BROCADELLO 2147994
// RICCARDO CONTE 2145596
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanPrinterTest {

    @Test
    public void printOne_shouldContainAsciiI() {
        // Arrange
        int input = 1;
        // Act
        String result = RomanPrinter.print(input);
        // Assert
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void printFive_shouldContainAsciiV() {
        String result = RomanPrinter.print(5);
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void printTen_shouldContainAsciiX() {
        String result = RomanPrinter.print(10);
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void printFifty_shouldContainAsciiL() {
        String result = RomanPrinter.print(50);
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void printOneHundred_shouldContainAsciiC() {
        String result = RomanPrinter.print(100);
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void printFiveHundred_shouldContainAsciiD() {
        String result = RomanPrinter.print(500);
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void printOneThousand_shouldContainAsciiM() {
        String result = RomanPrinter.print(1000);
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void printResult_shouldHaveFiveLines() {
        // Arrange
        int input = 1;
        // Act
        String result = RomanPrinter.print(input);
        // Assert
        assertEquals(5, result.split("\n").length);
    }

    @Test
    public void printInvalidNumber_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            RomanPrinter.print(0);
        });
    }

    @Test
    public void printOneThousand_shouldHaveFiveLines() {
        String result = RomanPrinter.print(1000);
        assertEquals(5, result.split("\n").length);
    }

    @Test
    public void printNinetyNine_shouldNotBeNull() {
        String result = RomanPrinter.print(99);
        assertNotNull(result);
    }
}