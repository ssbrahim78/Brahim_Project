package charArray1;

import java.util.Scanner;

public class SuipeNumbers {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("please enter the two numbers to suitche");
       int A = scn.nextInt();
       int B = scn.nextInt();
        suitchnumbers( A , B);

    }


    public static void suitchnumbers(int A ,int B){
    int C = 0;
    C=A;
    A=B;
    B=C;

        System.out.println("the value of A suiped to :"+ A);
        System.out.println("the value of B suiped to :"+ B);


    }
// Using logical operator

    /* Using XOR operator : ^
    x | y | XOR
    false ^ false => false      / 0^0=0
    true ^ false => true        / 1^0=1
    false ^ true => true        / 0^1=1
    true ^ true => false        / 1^1=0
    */
    public static void swipe_Tow_Integers_Using_Logical_Operator_XOR(int x,int y){
// x =5 = 0101 ,y = 7 = 0111
        x= x^y;
// 0101
// 0111
// x=5^7= 0010
        y= x^y;
// 0010
// 0111
// y=2^7=0101=5
        x= x^y;
// 0010
// 0101
// x=2^5=0111=7
        System.out.println("Using logical operator XOR : "+"x= "+x+" , "+" y= "+y);
    }
}
