package charArray1;

import java.util.Arrays;
import java.util.Scanner;

public class fat_homework_2 {

    public static void main(String[]args){
        getArrayNumber( );
    }
    public static void getArrayNumber(){
        int [] NumArray=new int [5];
        Scanner scn = new Scanner(System.in);
        int i=0;
        int LargeNumber=0;
        int SmallNumber=100;
        int sum=0;
        while (i<5){
            System.out.println("enter number");
            int number = scn.nextInt();
            if (number>=0 && number <=100) {
                NumArray[i] = number;
                if (LargeNumber < number) {
                    LargeNumber = number;
                }
                if (SmallNumber > number) {
                    SmallNumber = number;
                }
                sum = sum + number; // 0+3
                i++;
            }else {
                System.out.println("the entred number Should be between 0 and 100");
            }
        }
        System.out.println("the largest number is "+ LargeNumber);
        System.out.println("the smallest number is "+ SmallNumber);
        System.out.println("the sum of all numbers is " +sum);
        System.out.println("the Array Numbers is "+Arrays.toString(NumArray));


    }





}

