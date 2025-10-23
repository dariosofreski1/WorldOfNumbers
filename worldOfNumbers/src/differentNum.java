public class differentNum {
    public static int differentNumbers(int[] arr) {//creating a method to count the different numbers in the array
        int count = 1; // the count starts at one since even if all the numbers are the same it means that there is 1 unique number

        for (int i = 0; i < arr.length-1; i++) {// the loop goes until i < arr.length - 1, because if it went to arr.length then it would try to access a position outside the array since we are comparing arr[i] with arr[i+1]
            if (arr[i] != arr[i+1]) { // checking if the first index is equal to the next if not then count++
                count++;
            }
        }
        return count;
    }
}
