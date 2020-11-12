package charArray1;

import java.util.Arrays;

public class Reverse_Array {

    /*Java program to reverse a given array in place:
    Write a method to reverse a given array in place.
    Note: Avoid using in-built methods.
    Note: Use in-built methods.
    Input : int [] array={-1,-3,5,77,0,1,2,3,4,5,6,7,8,9,99}
    Expected Result : [99, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 77, 5, -3, -1]
    Input : int [] array={-1,-3};
    Expected Result : [-3, -1]
    Input : int [] array={};
    Expected Result : []
    Input : int [] array={1};
    Expected Result : [1
    */

    public static void main(String[] args) {
int [] Numarray={-1,-3,5,77,0,1,2,3,4,5,6,7,8,9,99};

        System.out.println(Arrays.toString(Reverse_given_Array( Numarray)));

    }

    public static int [] Reverse_given_Array(int [] Numarray){

        int leng= Numarray.length;
        int [] ReversedArray= new int[leng];
          int j= 0;
        for (int i=leng-1; i>=0; i-- ){

            ReversedArray[j]=Numarray[i];
            j++;
         //   System.out.print(ReversedArray[i]+" ");
        }

      return   ReversedArray;
    }
}
