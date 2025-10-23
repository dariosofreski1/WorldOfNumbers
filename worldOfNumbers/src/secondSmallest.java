public class secondSmallest {
    public static int secondSmallestNum(int[] arr){//method for displaying the second smallest number in the array
        int smallest = Integer.MAX_VALUE; //making the base for the smallest number to be the maximum value of integer
        int secondsmallest = Integer.MAX_VALUE; // same with the second smallest

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondsmallest = smallest;//if the number at i is < smallest then let secondsmallest be equal to smallest
                smallest = arr[i];// and let smallest be equal to the value of i
            } else if (arr[i] != smallest && arr[i] < secondsmallest) {//now if the number at i isn't equal to smallest and is less than second smallest let that value be second smallest
                secondsmallest = arr[i];
            }
        }
       return secondsmallest;
    }
}
