public class maxOccurrence {
    public static int occurrence(int[] arr) {//method to display the number with the highest occurrence in the array

        int maxCount = 0;//count starts at 0
        int max = arr[0];//making the base to be the first index in the array

    for (int i = 0; i < arr.length; i++) {//goes through every number one by one
        int count = 0;//and sets a count for each number at 0, counts how many times the current number appears in the array
        for (int j = 0; j < arr.length; j++) {//goes through the entire array and compares every element with the current number
            if (arr[j] == arr[i]) {//if a match is found then count++, this checks how many times the current number appears in the array
                count++;
            }
        }
        if (count > maxCount) {//if the count for the current number is > maxCount then
            maxCount = count;//update maxCount to count
            max = arr[i];//update max to the current number
            }
        }
          if (maxCount == 1){//edge case to use in main if all numbers in the array appear only once
              return 1;
          } else {
              return max;//returns the number with the highest
          }
    }
}

