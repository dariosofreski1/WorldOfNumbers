public class largestPalindrome {
    public static int largestPal (int[] arr) {//method for displaying the largest palindromic number smaller than the largest number in the array
        int max = Integer.MIN_VALUE; // assigning the minimum integer value as a base for the largest number
        int largestPal = -1;// assigning -1 as the base for largestPal to create an edge case in main, if there isn't any largestPal
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // finding the largest number first
            }
        }

        for (int i = 0; i < arr.length; i++) { //making another loop to find the palindrome
            if (countPalindrome.palindrome(arr[i]) && arr[i] < max && arr[i] > largestPal) { //calling the function palindrome from the countPalindrome class to check if the number is a palindrome, if it is < max and > -1(largestPal)
                largestPal = arr[i]; //if it satisfies the above then assign that value to largestPal instead of -1
            }
        }
        return largestPal;
    }
}
