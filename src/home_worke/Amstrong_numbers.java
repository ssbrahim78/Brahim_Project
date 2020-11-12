package home_worke;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Amstrong_numbers {

/*
Java program to check if a number is Armstrong or not
Write a Java program to check if a number is Armstrong or not ?
Armstrong Number in Java: A positive number is called armstrong number
if it is equal to the sum of cubes of its digits
for example 0, 1, 153, 370, 371, 407 etc.
Let's try to understand why 153 is an Armstrong number.
1 5 3 1exp3 5exp3 3exp3
153 = (1*1*1)+ (5*5*5)+ (3*3*3)

22 ==> (2*2)+(2*2)= 8
3==> 3 =3
*/
public static void main(String[]grs){
//   int len=String.valueOf(n).length();



    Scanner scn = new Scanner(System.in);
    System.out.println("please enter your number ");
    int number=scn.nextInt();

    int number1,number2 ,restOfDevision, lengt = 0;
    number1 = number;
    number2=number;
    // find the number's length
//  while(number1 > 0)  {
//   number1 = number1 / 10;
//        leng++; }
    List<Integer>NumberList= new ArrayList<>();
    while(number2 > 0)  {
        restOfDevision= number2 % 10;
        number2 =number2/ 10;
       // counter++;
        NumberList.add(restOfDevision);
    }
    System.out.println(NumberList);
    int totalNumb =0;
   int total=1;
    int leng;
    for (Integer num1:NumberList ) {
        leng=NumberList.size();
        while(leng>0){
            total= total * num1;
            leng--;
    }
        totalNumb = totalNumb + total; //1
        total=1;
}
if (totalNumb==number){
    System.out.println("the number is amstrong ");
}else {
    System.out.println("the number is not amstrong ");
}











 }
}
