package it.unipd.mtss;
import java.util.HashMap;
import java.util.Map;

public class Printer {

    private static final Map<Character, String[]> ASCII_MAP = new HashMap<>();

    static {
        ASCII_MAP.put('I', new String[]{
                "  |  ",
                "  |  ",
                "  |  ",
                "  |  ",
                "  |  "
        });

        ASCII_MAP.put('V', new String[]{
                "\\   /",
                " \\ / ",
                "  V  ",
                "     ",
                "     "
        });

        ASCII_MAP.put('X', new String[]{
                "\\   /",
                " \\ / ",
                "  X  ",
                " / \\ ",
                "/   \\"
        });

        // TODO: aggiungi L, C, D, M
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