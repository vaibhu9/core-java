public class LongestWord {
    final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    final String ALPHABET_UPPER = ALPHABET.toUpperCase();

    String LongestWord(String sen) {
        String[] words = sen.split("\\s");
        String longestWord = null;
        int longestWordLength = 0;

        for (String word : words) {
            int wordLength = getWordLength(word);
            if (longestWord == null || wordLength > longestWordLength) {
                longestWord = word;
                longestWordLength = wordLength;
            }
        }

        return longestWord;
    }

    int getWordLength(String str) {
        int length = 0;

        for (char c : str.toCharArray()) {
            if (ALPHABET.indexOf(c) > -1 || ALPHABET_UPPER.indexOf(c) > -1) {
                length++;
            }
        }
        return length;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        LongestWord c = new LongestWord();
        System.out.print(c.LongestWord(s.nextLine()));
    }
}