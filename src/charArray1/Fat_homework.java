package charArray1;

import java.util.Scanner;

public class Fat_homework {

    public static void main(String[] args) {

       int [] NumArray=new int [5];
        Scanner scn = new Scanner(System.in);
        int i=0;
        int LargeNumber=0;
        int SmallNumber=100;
        int sum=0;
        while (i<5){
            System.out.println("enter number");
           int number = scn.nextInt(); // number=3

           if (number>=0 && number <=100) {
               NumArray[i] = number;
               if (LargeNumber < number) {
                   LargeNumber = number;  // largestNumber= 3
               }
               if (SmallNumber > number) { // Smallnumbr=3
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
        for (i=0 ;i<NumArray.length; i++){
            System.out.print(NumArray[i]+" ");
        }

    }


}
