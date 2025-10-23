import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of elements in the array: ");
        int n = sc.nextInt();
        if (n <= 0){
            System.out.println("Invalid Input"); // edge case in case the user doesn't input any number of elements in the array
            return;
        }
            int[] arr = new int[n];

        System.out.print("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();  // everything up to here is initializing the array

        System.out.println("The number of elements in the array is: "+arr.length); // prints the number of elements in the array, +arr.length could also be replaced with +n
        System.out.println();


        int evenNum = even.Even(arr); // calling and storing the return value in a variable called evenNum
        System.out.println("The number of even numbers in the array is: "+evenNum); //prints the number of even numbers in the array
        System.out.println(); // adding a empty line just to be more clean


        int oddNum = odd.ODD(arr); // calling and storing the return value in a variable called oddNum
        System.out.println("The number of odd numbers in the array is: "+oddNum); //prints the number of odd numbers in the array
        System.out.println();


        int diffNum = differentNum.differentNumbers(arr); // calling and storing the return value in a variable called diffNum
        System.out.println("The number of different elements in the array is: "+diffNum); // prints the number of different elements in the array
        System.out.println();

        String freq = frequency.Frequency(arr); // calling and storing the return value in a string variable called freq
        System.out.println("The frequency of the numbers in the array is: ");
        System.out.println(freq); //printing the return value of the method
        System.out.println();


       int Occur = maxOccurrence.occurrence(arr); // calling and storing the return value in a variable called Occur
       if (Occur == 1) { //edge case in case all numbers in the sequence occur once then to print the following message
           System.out.println("The number with the maximum occurrences is: All numbers are equally occurring!");
       } else {
           System.out.println("The number with the maximum occurrences is: " + Occur); // printing the return value of the method
       }
        System.out.println();


        int maxNum = largestNum.largest(arr); // calling and storing the return value in a variable called maxNum
        System.out.println("The largest number is: "+maxNum); //prints the return value of the method
        System.out.println();


        int secondSmallestNum = secondSmallest.secondSmallestNum(arr); // calling and storing the return value in a variable called secondSmallestNum
        if (secondSmallestNum == Integer.MAX_VALUE) { //edge case in case the value of secondSmallestNum after the execution of the method is the base value that is given (Integer.MAX_VALUE) then to print there is no second smallest.
            System.out.println("No second smallest number found!");
        } else {
            System.out.println("The second smallest number is: "+secondSmallestNum); // prints the return value of the method
        }
        System.out.println();


        long avg = arrayAverage.average(arr);// calling and storing the return value in a variable called avg, using long to try and avoid integer overflow if the sum is too big
        if (avg == -1){ //edge case in case the sum is too large and achieves overflow
            System.out.println("Sum too large unable to calculate!");
        } else {
            System.out.println("The average of the numbers in the array is: " + avg); // prints the return value of the method
        }
        System.out.println();


        double deviation = standardDeviation.standardDev(arr);// calling and storing the return value in a variable called deviation, using double since the number can be a decimal
        System.out.println("The standard deviation is: "+deviation);// prints the return value of the method
        System.out.println();


        double med = median.Median(arr); // calling and storing the return value in a variable called med
        System.out.println("The median is: "+med); // prints the return value
        System.out.println();


        long ArraySum = sum.Sum(arr);// calling and storing the return value in a variable called ArraySum, again using long to avoid integer overflow
        if (ArraySum == -1) { //edge case given in case it achieves overflow despite the long type, in the function if  the value is > Long.MAX_VALUE then to return -1, using that to create a edge case to print an error
            System.out.println("Error. Number too large!");
        } else {
            System.out.println("The sum of all numbers is: " + ArraySum); //prints the return value
        }
        System.out.println();


        int Palindrome = countPalindrome.countPal(arr); // calling and storing the return value in a variable called Palindrome
        System.out.println("The number of palindromic numbers is: "+Palindrome); // prints the return value
        System.out.println();


        int largestpal = largestPalindrome.largestPal(arr); // calling and storing the return value in a variable called largestpal
        if (largestpal != -1) {//an edge case in case the return value is -1, which is the base value given in the method then to print an error
            System.out.println("The largest palindrome smaller than the greatest number is: "+largestpal);//prints the return value
        } else {
            System.out.println("No largest palindrome number smaller than the greatest number.");
        }
        System.out.println();


        System.out.println("The array in reverse order is: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);// prints the array in reverse order
            if (i > 0) {
                System.out.print(", "); // this prints a comma at every index in the array other than the last one
            }
        }
    }
}
