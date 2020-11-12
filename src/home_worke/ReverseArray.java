package home_worke;

import java.util.Arrays;

public class ReverseArray {
    /*
    Java program to reverse a given array in place:
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
    Expected Result : [1]
            */
    public static void main(String[]args){
        int [] intArray={-1,-3,5,77,0,1,2,3,4,5,6,7,8,9,99};
        System.out.println(reverseArray(intArray));
        reverseArrays( intArray);
    }
    public static String reverseArray(int[] intArray){
       int leng = intArray.length;
       int[] reversedArray= new int[leng];
       int i,j;
        for ( i=leng-1,j=0; i>=0;i--,j++){
            reversedArray[j]=intArray[i];

        }
       return (Arrays.toString(reversedArray));
    }

    //second method
    public static void reverseArrays(int[] intArray){

        String stringArray=Arrays.toString(intArray);
     StringBuffer stringB =new StringBuffer(stringArray);
       stringB.reverse();
        System.out.println( stringB);
    }
}
