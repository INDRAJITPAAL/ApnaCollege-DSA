public class SubstringCounter {
    
    // Recursive method to generate substrings and count valid ones
    public static int countSubstrings(String str, int start, int end) {
        // Base case: if start index is greater than the string length, return 0
        if (start == str.length()) {
            return 0;
        }

        // If end index is greater than the string length, move to the next start index
        if (end == str.length()) {
            return countSubstrings(str, start + 1, start + 1);
        }

        // Get the current substring from start to end
        String sub = str.substring(start, end + 1);

        // Check if the substring's first and last character are the same
        int count = 0;
        if (sub.charAt(0) == sub.charAt(sub.length() - 1)) {
            count = 1;
        }

        // Recursive call for next substring by incrementing the end index
        return count + countSubstrings(str, start, end + 1);
    }

    public static void main(String[] args) {
        String str = "abcab";
        int result = countSubstrings(str, 0, 0);  // start and end indices
        System.out.println("Total substrings where first and last character are the same: " + result);
    }
}
