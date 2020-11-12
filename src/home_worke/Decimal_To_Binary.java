package home_worke;

import java.util.Scanner;

public class Decimal_To_Binary {
    /*Java Program to convert Decimal To Binary, Decimal To Octal And Decimal To HexaDecimal.
Write a java program to convert a given decimal number to : binary, octal and hexadecimal.
Notes: Use The console to get the Input
Use a mechanism to Restart the program or to Exit the program.
Examples:
Input: Decimal :34
Expected Result:
Binary : 100010*/
    public static void main(String[] args)
    {
        int number, rem;
        String binaryNumber = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any decimal number:");
        number = s.nextInt();
        while(number> 0)   // 10
        {
            rem = number % 2; //  0
            binaryNumber = rem + binaryNumber;
            number = number / 2;
        }
        System.out.println("Binary number:"+binaryNumber);

    }

}
