public class countPalindrome {
    public static boolean palindrome (int n) {//creating first a function to check if a number is a palindrome
        int original = n;
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }
        return original == reversed;
    }
    public static int countPal (int[] arr) {//then creating a different function to count the palindromic numbers
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (palindrome(arr[i])){ // calling the above function to check for every index in the array if it is a palindrome, if true then count++
                count++;
            }
        }
        return count;
    }
}
