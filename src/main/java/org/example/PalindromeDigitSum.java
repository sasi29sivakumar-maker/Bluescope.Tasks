public class PalindromeDigitSum {
    static boolean isPalindrome(int n) {
        int rev = 0, temp = n;
        while (temp > 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }
        return n == rev;
    }

    public static void main(String[] args) {
        int num = 56; // Example input
        int sum = 0, temp = num;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (isPalindrome(sum)) {
            System.out.println("The digit sum " + sum + " is a palindrome.");
        } else {
            System.out.println("The digit sum " + sum + " is not a palindrome.");
        }
    }
}
