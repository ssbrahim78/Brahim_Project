package home_worke;

import java.util.Scanner;

public class WhileLoopProgram {

    public static void main(String[] args)
    {
        int Num1 ;
        int Num2;
        int Total=0;
        int maxTotal=100;
        int count = 0;
        Scanner scn=new Scanner(System.in);

        while (Total<=maxTotal){
            System.out.println("enter the first number Num1");
            Num1= scn.nextInt();
            System.out.println("enter the second number Num2");
            Num2= scn.nextInt();
            Total = Num1 + Num2 ;
            System.out.println(" The Total is: "+ Total);;
            count++;
        }
        System.out.println("the number of time the total is calculated is "+ count);
    }
}
