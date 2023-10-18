public class pangram {
    public static boolean isPangram(String input) {
        input = input.toLowerCase();
        
        boolean[] lettersPresent = new boolean[26];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            if ('a' <= ch && ch <= 'z') {
                lettersPresent[ch - 'a'] = true;
            }
        }

        for (boolean present : lettersPresent) {
            if (!present) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
