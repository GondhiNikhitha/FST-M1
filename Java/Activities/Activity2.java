package Activities;
import java.util.*;

public class Activity2 {
    public static void main(String[] args) {
        int[] nArr = {11, 7, 10, 10, -11, 10};
        System.out.println("Original Array: " + Arrays.toString(nArr));

        //Set constants
        int searchNum = 10;
        int fixedSum = 30;

        //Print result
        System.out.println("Result: " + result(nArr, searchNum, fixedSum));
    }
        public static boolean result(int[] numbers, int searchNum, int fixedSum) {
            int temp_sum = 0;
            //Loop through array
            for (int number : numbers) {
                //If value is 10
                if (number == searchNum) {
                    //Add them
                    temp_sum += searchNum;
                }

                //Sum should not be more than 30
                if (temp_sum > fixedSum) {
                    break;
                }
            }

            //Return true if condition satisfies
            return temp_sum == fixedSum;
    }
}
