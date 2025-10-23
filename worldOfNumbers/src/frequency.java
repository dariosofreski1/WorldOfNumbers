public class frequency {

    public static String Frequency(int[] arr){// Making the method for the frequency of repetition for each number

        StringBuilder result = new StringBuilder(); // the only way i found it to work to print for every number if I made the given result in a string and make it return the value as a string

        for (int i = 0; i < arr.length; i++){//first loop picks each number one by one and sets isCounted to false for each number
            boolean isCounted = false;

            for (int j = 0; j < i; j++){//second loop checks if the current number [i] isn't already counted if it is the outer loop skips it
                if (arr[i] == arr[j]){
                    isCounted = true;
                    break;
                }
            }
            if (isCounted == false){
                int count = 1;

                for (int j = i+1; j < arr.length; j++){//third loop goes to the end of the array and counts how may more times the current number appears
                    if (arr[j] == arr[i]){
                        count++;
                    }
                }

               double freq =(count*100.0) / arr.length;//making the frequency a double to be decimal and multiplying the count by 100.0 to get a percentage value
                result.append(arr[i]).append(" --> ").append(freq).append("%\n");//adding everything in a string, updating the string result and using \n for a new line
            }
        }
        return result.toString();//converts the StringBuilder into a String and returns the value
    }
}
