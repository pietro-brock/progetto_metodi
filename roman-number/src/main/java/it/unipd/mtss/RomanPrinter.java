////////////////////////////////////////////////////////////////////
// PIETRO BROCADELLO 2147994
// RICCARDO CONTE 2145596
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;
import java.util.HashMap;
import java.util.Map;

public class RomanPrinter {

    private static final Map<Character, String[]> ASCII_MAP = new HashMap<>();

    static {
        ASCII_MAP.put('I', new String[]{
            " _____ ",
            "|_   _|",
            "  | |  ",
            " _| |_ ",
            "|_____|"
        });

        ASCII_MAP.put('V', new String[]{
            "__   __",
            "\\  / /",
            "\\ V / ",
            " \\ /  ",
            "  \\/  "
        });

        ASCII_MAP.put('X', new String[]{
            "__  __ ",
            "\\ / / ",
            " \\ /  ",
            " / \\  ",
            "/_/ \\ "
        });

        ASCII_MAP.put('L', new String[]{
            " _     ",
            "| |    ",
            "| |    ",
            "| |___ ",
            "|_____|"
        });

        ASCII_MAP.put('C', new String[]{
            " _____ ",
            "|  __ |",
            "| |    ",
            "| |__  ",
            "|_____|"
        });

        ASCII_MAP.put('D', new String[]{
            " ____  ",
            "|  _\\ ",
            "| | | |",
            "| |_| |",
            "|____/ "
        });

        ASCII_MAP.put('M', new String[]{
            "___  ___",
            "| \\_/ |",
            "| \\_/ |",
            "| |  | |",
            "|_|  |_|"
        });
    }

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        if (romanNumber == null || romanNumber.isEmpty()) {
            return "";
        }

        int height = 5;
        StringBuilder result = new StringBuilder();

        for (int row = 0; row < height; row++) {
            for (char c : romanNumber.toCharArray()) {
                String[] letter = ASCII_MAP.get(c);
                result.append(letter[row]);
                result.append(" ");
            }
            result.append("\n");
        }

        return result.toString();
    }
}