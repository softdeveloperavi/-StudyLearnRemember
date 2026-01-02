public class PalindromeNumber {
    public static void main(String[] args) {
        boolean isPalindrome = checkPalindromeNumber(1332);
        System.out.print(isPalindrome);

    }

    public static boolean checkPalindromeNumber(int num) {
        int reverseNumberTemp = reverseNumber(num);
        return num == reverseNumberTemp;

    }

    public static int reverseNumber(int number) {
        int ans = 0;
        while (number != 0) {
            int rem = number % 10;
            ans = ans * 10;
            ans = ans + rem;
            number = number / 10;

        }
        return ans;

    }

}
