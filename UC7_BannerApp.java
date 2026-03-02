
public class UC7_BannerApp {

    static class CharPatternMap {
        private final char character;
        private final String[] pattern;

        public CharPatternMap(char character, String[] pattern) {
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
    public static void main(String[] args) {
        CharPatternMap[] letters = {
            new CharPatternMap('O', new String[]{" *** ", "*   *", "*   *", "*   *", " *** "}),
            new CharPatternMap('O', new String[]{" *** ", "*   *", "*   *", "*   *", " *** "}),
            new CharPatternMap('P', new String[]{"**** ", "*   *", "**** ", "*    ", "*    "}),
            new CharPatternMap('S', new String[]{" ****", "*    ", " *** ", "    *", "**** "})
        };
        for (int row = 0; row < 5; row++) {
            StringBuilder line = new StringBuilder();
            for (CharPatternMap letter : letters) {
                line.append(letter.getPattern()[row]).append("  ");
            }
            System.out.println(line);
        }
    }
}