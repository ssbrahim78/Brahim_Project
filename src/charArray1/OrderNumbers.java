package charArray1;

import java.util.Scanner;

public class OrderNumbers {



    public static void main(String[]args){
        int a;
        int b;
        int c;
        Scanner scn = new Scanner(System.in);
        System.out.println("please enter the first number a ");
        a=scn.nextInt();
        System.out.println("please enter the second number b ");
        b=scn.nextInt();
        System.out.println("please enter the third number c ");
        c=scn.nextInt();

        if(a<b && b<c){
            System.out.println("the order is creasing "+a+" "+" "+b+" "+c);

        }
        else if (a>b && b>c){
            System.out.println("the order is decreasing "+a+" "+" "+b+" "+c);
        }
        else {
            System.out.println("the numbers are not in creasing or decreasing  order ");
        }
    }
}
