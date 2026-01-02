public class ReverseNumber {
    public static void main(String[] args) {
        int firstCheck = reverseNumber(123456);
        System.out.print(firstCheck);
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
