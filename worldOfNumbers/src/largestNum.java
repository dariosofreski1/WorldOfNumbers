public class largestNum {
    public static int largest(int[] arr) {// method for displaying the largest number in the array
        int max = arr[0];// set the max for the base to be the first index
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) { //if statement to check if the current index in the loop is > max then assign that value to max
                max = arr[i];
            }
        }
        return max;
    }
}
