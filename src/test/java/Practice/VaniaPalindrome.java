package Practice;

public class VaniaPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome1("sosmmsos"));
    }

    public static boolean isPalindrome1(String string) {
        int n = string.length();
        for (int i = 0; i < n / 2; i++) {
            if (string.charAt(i) != string.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;

    }

}
