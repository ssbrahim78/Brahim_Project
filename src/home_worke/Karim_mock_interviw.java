package home_worke;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// fide the greatest number from the entered numbers
//2056,56,96,,45,48,9,3
public class Karim_mock_interviw {
  public static void main (String[]grs) {

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number : ");
      int max = 0;

     // while (sc.hasNext()) {
      for (int i=0; ; i++){

          int max1 = sc.nextInt();
          if (max1 > max) {
              max = max1;
              System.out.println(" The Max is: " + max);
              System.out.println("enter number");
              // max1=sc.nextInt();
          } else {
              System.out.println(" The Max is: " + max);

              System.out.println("enter number");

              //max1=sc.nextInt();}
          }


      }


  }}
