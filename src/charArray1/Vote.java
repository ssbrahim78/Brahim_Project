package charArray1;

import java.util.Scanner;

public class Vote {


    public static void main (String[]args){

        Scanner scn = new Scanner(System.in);
        int age;
        System.out.println("please enter your age ");
         age= scn.nextInt();
         if (age>=18){
             System.out.println("you are eligible to vote ");
         }else {
             System.out.println("you are not eligible to vote ");
         }





    }
}
