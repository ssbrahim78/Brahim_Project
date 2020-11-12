package charArray1;

import java.util.Arrays;

public class Sum_numbers {


    public static void main(String[] args) {
      int [] numbers={0, 5,7, 8, 1, 9, 13 };
      int target=20;
        System.out.println(Arrays.toString(twoSum( numbers,  target)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] == target - numbers[i]) {
                    return new int[] { i, j };
                }
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
