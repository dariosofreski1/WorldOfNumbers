public class sum {
    public static long Sum(int[] arr) {//method for calculating the sum of all numbers in the array, using long to avoid integer overflow

        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum > Long.MAX_VALUE) {//making a edge case to use in main
            return -1;
        } else {
            return sum;
        }
    }
}
