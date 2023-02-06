public class Palindrome {
    public static Deque<Character> wordToDeque(String word) {
        Deque<Character> transform = new LinkedListDeque<>();
        for (int i = 0; i < word.length(); i++) {
            transform.addLast(word.charAt(i));
        }
        return transform;
    }

    public static boolean isPalindrome(String word, CharacterComparator cc) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (!cc.equalChars(word.charAt(i), word.charAt(word.length() - i - 1))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length() / 2 + 1; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(Deque<Character> deque) {
        if (deque.size() == 0 || deque.size() == 1) {
            return true;
        }
        if (deque.removeFirst() == deque.removeLast()) {
            return (isPalindrome(deque));
        } else {
            return false;
        }
    }
}
