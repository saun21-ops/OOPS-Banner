import java.util.HashMap;
import java.util.Map;

public class UC7 {

    public static void main(String[] args) {

        // Word to display
        String word = "OOPS";

        // Create pattern map
        CharacterPatternMap patternMap = new CharacterPatternMap();

        String[] banner = new String[7];

        // Initialize banner rows
        for (int i = 0; i < 7; i++) {
            banner[i] = "";
        }

        // Build banner dynamically
        for (char ch : word.toCharArray()) {
            String[] pattern = patternMap.getPattern(ch);

            for (int i = 0; i < 7; i++) {
                StringBuilder sb = new StringBuilder(banner[i]);
                sb.append(pattern[i]).append(" ");
                banner[i] = sb.toString();
            }
        }

        // Display banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Static Inner Class for Pattern Management
    static class CharacterPatternMap {

        private final Map<Character, CharacterPattern> patternMap;

        public CharacterPatternMap() {
            patternMap = new HashMap<>();

            patternMap.put('O', new CharacterPattern('O', new String[]{
                    "   ***   ",
                    " **   ** ",
                    "**     **",
                    "**     **",
                    "**     **",
                    " **   ** ",
                    "   ***   "
            }));

            patternMap.put('P', new CharacterPattern('P', new String[]{
                    "******   ",
                    "**   **  ",
                    "**   **  ",
                    "******   ",
                    "**       ",
                    "**       ",
                    "**       "
            }));

            patternMap.put('S', new CharacterPattern('S', new String[]{
                    "  *****  ",
                    " **      ",
                    "**       ",
                    "  *****  ",
                    "      ** ",
                    " **   ** ",
                    "  *****  "
            }));
        }

        public String[] getPattern(char ch) {
            return patternMap.get(ch).getPattern();
        }
    }

    // CharacterPattern Class
    static class CharacterPattern {

        private final char character;
        private final String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }
}
