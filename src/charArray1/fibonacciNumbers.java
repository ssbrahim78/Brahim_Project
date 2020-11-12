package charArray1;

import java.util.Scanner;

public class fibonacciNumbers {


    public static void main(String []srg) {

//        Scanner scn = new Scanner(System.in);
//        System.out.println("please enter the number");
//        int FibNumber= scn.nextInt();
//        charArray1.fibonacciNumbers( FibNumber);
        int FibNumber=5;
        System.out.println("the fibonacci number is "+fibonacciNumber( FibNumber));
    }
    public static void fibonacciNumbers(int FibNumber) {

        int firstNumber = 0;
        int nextNumber = 1;

        for (int i = 0; i <FibNumber; i++) {

            System.out.print(firstNumber + ", "); // prints: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610……..
            int number = firstNumber + nextNumber;
            firstNumber = nextNumber;
            nextNumber = number;
        }


    }
// using recursion method

   public static int fibonacciNumber(int FibNumber) {

       if (FibNumber <= 1)  // 5
           return FibNumber;
       return fibonacciNumber(FibNumber-1) + fibonacciNumber(FibNumber-2);
   }
       //     fibonacciNumber(5-1)(4)   +  fibonacciNumber(5-2)(3)         =>  3 +   2   =  5
       //               |
       //   fibonacciNumber(4-1)(3)   +  fibonacciNumber(4-2)(2)           =>  2  +  1
       //              |
       //    fibonacciNumber(3-1)(2)   +  fibonacciNumber(3-2)(1)          =>  1 +   1
       //             |
        //   fibonacciNumber(2-1)(1)  +  fibonacciNumber(2-2)(0)            =>  1  +  0
    }
