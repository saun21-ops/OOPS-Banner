import java.util.HashMap;
import java.util.Map;

public class UC8 {

    // Centralized Pattern Storage using HashMap
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    // Static block to initialize patterns
    static {
        patternMap.put('O', new String[]{
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        });

        patternMap.put('P', new String[]{
                "******   ",
                "**   **  ",
                "**   **  ",
                "******   ",
                "**       ",
                "**       ",
                "**       "
        });

        patternMap.put('S', new String[]{
                "  *****  ",
                " **      ",
                "**       ",
                "  *****  ",
                "      ** ",
                " **   ** ",
                "  *****  "
        });
    }

    public static void main(String[] args) {

        String word = "OOPS";
        int height = 7;

        StringBuilder[] banner = new StringBuilder[height];

        // Initialize StringBuilder rows
        for (int i = 0; i < height; i++) {
            banner[i] = new StringBuilder();
        }

        // Build banner using nested loops
        for (char ch : word.toCharArray()) {

            String[] pattern = patternMap.get(ch);

            if (pattern != null) {
                for (int i = 0; i < height; i++) {
                    banner[i].append(pattern[i]).append(" ");
                }
            }
        }

        // Render final banner
        for (StringBuilder line : banner) {
            System.out.println(line);
        }
    }
}