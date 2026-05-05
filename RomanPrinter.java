package it.unipd.mtss;
import java.util.HashMap;
import java.util.Map;

public class Printer {

    private static final Map<Character, String[]> ASCII_MAP = new HashMap<>();

    static {
        ASCII_MAP.put('I', new String[]{
                " _____ ",
                "|_   _|",
                "  | | ",
                "  | | ",
                " _| |_ ",
                "|_____|   "
        });

        ASCII_MAP.put('V', new String[]{
                "__         __",
                "\\ \\     / /",
                " \\ \\   / /",
                "  \\ \\ / /",
                "   \\  / /",
                "    \\  /",
                "     \\/"
        });

        ASCII_MAP.put('X', new String[]{
                "__      __",
                "\\ \\  / /",
                " \\ \\/ /",
                "  >    <",
                " / /\\ \\",
                "/__/ \\__\\",
        });

        // Aggiunte L, C, D, M
        ASCII_MAP.put('L', new String[]{
                " __  ",
                "|  |  ",
                "|  |  ",
                "|  |  ",
                "|  |___  ",
                "|______|"
        });

        ASCII_MAP.put('C', new String[]{
                "  _____",
                " / ____|",
                "|  |  ",
                "|  |  ",
                "|  |___  ",
                " \\____|"
        });

        ASCII_MAP.put('D', new String[]{
                " _____",
                "|  __  \\ ",
                "| |  | |",
                "| |  | |",
                "| |__| /  ",
                "|_____/   "
        });

        ASCII_MAP.put('M', new String[]{
                " __   __",
                "|  \\/  |",
                "| \\  / |",
                "| |\\/| |",
                "| |   | |",
                "|_|   |_|"
        });
    }

    public static void printAscii(String roman) {
        int height = 5;

        for (int row = 0; row < height; row++) {
            for (char c : roman.toCharArray()) {
                String[] letter = ASCII_MAP.get(c);
                System.out.print(letter[row] + " ");
            }
            System.out.println();
        }
    }
}
