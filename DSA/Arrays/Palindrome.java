package DSA.Arrays;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        str = str.replace("\\s+", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String string = "wow";
        if (isPalindrome(string)) {
            System.out.println(string + " is a palindrome");
        } else {
            System.out.println(string + " is not a palindrome");
        }
    }
}
