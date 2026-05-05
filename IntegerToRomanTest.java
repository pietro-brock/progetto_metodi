////////////////////////////////////////////////////////////////////
// [NOME1] [COGNOME1] [MATRICOLA1]
// [NOME2] [COGNOME2] [MATRICOLA2]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerToRomanTest {

    // ---- Valori base ----

    @Test
    public void convertOne_shouldReturnI() {
        // Arrange
        int input = 1;
        // Act
        String result = IntegerToRoman.convert(input);
        // Assert
        assertEquals("I", result);
    }

    @Test
    public void convertFour_shouldReturnIV() {
        assertEquals("IV", IntegerToRoman.convert(4));
    }

    @Test
    public void convertFive_shouldReturnV() {
        assertEquals("V", IntegerToRoman.convert(5));
    }

    @Test
    public void convertNine_shouldReturnIX() {
        assertEquals("IX", IntegerToRoman.convert(9));
    }

    @Test
    public void convertTen_shouldReturnX() {
        assertEquals("X", IntegerToRoman.convert(10));
    }

    @Test
    public void convertForty_shouldReturnXL() {
        assertEquals("XL", IntegerToRoman.convert(40));
    }

    @Test
    public void convertFifty_shouldReturnL() {
        assertEquals("L", IntegerToRoman.convert(50));
    }

    @Test
    public void convertNinety_shouldReturnXC() {
        assertEquals("XC", IntegerToRoman.convert(90));
    }

    @Test
    public void convertOneHundred_shouldReturnC() {
        assertEquals("C", IntegerToRoman.convert(100));
    }

    @Test
    public void convertFourHundred_shouldReturnCD() {
        assertEquals("CD", IntegerToRoman.convert(400));
    }

    @Test
    public void convertFiveHundred_shouldReturnD() {
        assertEquals("D", IntegerToRoman.convert(500));
    }

    @Test
    public void convertNineHundred_shouldReturnCM() {
        assertEquals("CM", IntegerToRoman.convert(900));
    }

    @Test
    public void convertOneThousand_shouldReturnM() {
        assertEquals("M", IntegerToRoman.convert(1000));
    }

    // ---- Valori composti ----

    @Test
    public void convertThree_shouldReturnIII() {
        assertEquals("III", IntegerToRoman.convert(3));
    }

    @Test
    public void convertFourteen_shouldReturnXIV() {
        assertEquals("XIV", IntegerToRoman.convert(14));
    }

    @Test
    public void convertFortyTwo_shouldReturnXLII() {
        assertEquals("XLII", IntegerToRoman.convert(42));
    }

    @Test
    public void convertNinetyNine_shouldReturnXCIX() {
        assertEquals("XCIX", IntegerToRoman.convert(99));
    }

    @Test
    public void convertTwoThousandAndTwentyFour_shouldReturnMMXXIV() {
        assertEquals("CDXLIV", IntegerToRoman.convert(444));
    }

    @Test
    public void convertNineHundredNinetyNine_shouldReturnCMXCIX() {
        assertEquals("CMXCIX", IntegerToRoman.convert(999));
    }

    // ---- Boundary / limiti ----

    @Test
    public void convertZero_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(0);
        });
    }

    @Test
    public void convertNegative_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(-1);
        });
    }

    @Test
    public void convertOverThousand_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(1001);
        });
    }
}