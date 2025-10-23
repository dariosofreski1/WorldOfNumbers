public class arrayAverage {
    public static long average(int[] arr) { //using long to avoid integer overflow
        long sum = 0;
        long result = -1; // giving this to create an edge case in main
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];//calculates the sum first
        }
        if (sum > Long.MAX_VALUE) {//edge case to use in main if we achieve overflow
            return result;
        } else {
            return sum / arr.length;
        }
    }
}
