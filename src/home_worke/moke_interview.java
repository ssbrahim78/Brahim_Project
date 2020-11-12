package home_worke;

import java.util.Arrays;

public class moke_interview {

    public static void main(String[] args) {
         int [] arrayNumber={1,10,-5,20};
          reversArray(arrayNumber);


    }


    public static void reversArray(int[] arrayNumber) {

        int leng = arrayNumber.length;

        int[] reversArr = new int[leng];

        int i = 0;
        int j = 0;
        for (j = 0, i = leng - 1; i >= 0; i--, j++) {
            reversArr[j] = arrayNumber[i];
        }
        System.out.println("the reversed Array is : " + Arrays.toString(reversArr));


    }


}