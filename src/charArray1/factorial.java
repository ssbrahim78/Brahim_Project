package charArray1;

import java.util.Scanner;

public class factorial {


    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("please enter the number ");   // number 5 intred
        int number = scaner.nextInt();
        GetFactorialNumber(number);
    }

        public static void GetFactorialNumber(int number) {
            int factnumber = 1;
            for (int i = 0; i < number; i++) {
                factnumber = factnumber * (number - i);
            }
            System.out.println("the charArray1.factorial number of the entered number "+number+"!"+" is "+factnumber); //prints:5! is 120
        }

    }

