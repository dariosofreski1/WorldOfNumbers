public class median {//method for calculating the median of the elements in the array
    public static double Median (int[] arr) {
        sort(arr); //sorting the array first
        if (arr.length % 2 == 0) { //now using the standard formula for finding the median
            return (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0;
        } else {
            return arr[arr.length / 2];
        }
    }
    private static void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) { // creating a simple bubble sort method to sort the array to calculate the median
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temporary = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temporary;
                }
            }
        }
    }
}
