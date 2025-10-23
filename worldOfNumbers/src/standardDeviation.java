public class standardDeviation {
    public static double standardDev(int[] arr) {//method to calculate the standard deviation of the numbers in the array
        double sum = 0;
        double sumOfSquares = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // calculating the sum first
        }

        double mean = sum / arr.length; // calculating the mean
        for (int i = 0; i < arr.length; i++) {
            sumOfSquares += (arr[i] - mean) * (arr[i] - mean);
        }
        return Math.sqrt(sumOfSquares / arr.length);//returning result of the formula for standard deviation
    }
}
