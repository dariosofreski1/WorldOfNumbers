public class even {

    public static int Even(int[] arr) { // a method to count the even numbers
        int even = 0;//start the count at 0

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) { //if the number at the index i is divisible by 2 then the count, even++
                even++;
            }
        }
        return even;
    }
}

