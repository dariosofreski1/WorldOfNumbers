public class odd {

    public static int ODD(int[] arr) {//method for counting the odd numbers in the array
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {//if it is not divisible by 2 then the count, odd++
                odd++;
            }
        }
        return odd;
    }
}
