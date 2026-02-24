import java.util.*;

public class OOPSBannerApp {

    // CharacterPattern class to store character and its pattern
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter methods
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Static inner class to manage character-pattern mapping
    static class CharacterPatternMap {

        private static final Map<Character, CharacterPattern> patternMap = new HashMap<>();

        static {
            // O Pattern
            patternMap.put('O', new CharacterPattern('O', new String[]{
                    " *** ",
                    "*   *",
                    "*   *",
                    "*   *",
                    " *** "
            }));

            // P Pattern
            patternMap.put('P', new CharacterPattern('P', new String[]{
                    "**** ",
                    "*   *",
                    "**** ",
                    "*    ",
                    "*    "
            }));

            // S Pattern
            patternMap.put('S', new CharacterPattern('S', new String[]{
                    " ****",
                    "*    ",
                    " *** ",
                    "    *",
                    "**** "
            }));
        }

        public static CharacterPattern getPattern(char ch) {
            return patternMap.get(ch);
        }
    }

    public static void main(String[] args) {

        String word = "OOPS";
        int height = 5;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                CharacterPattern cp = CharacterPatternMap.getPattern(ch);

                if (cp != null) {
                    line.append(cp.getPattern()[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }
}
