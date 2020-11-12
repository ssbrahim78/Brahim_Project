package charArray1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Split_Integer {
  /*
Java program to split an integer :
Write a method to split a given number in tow separated integer.
Input : int num= 24
Expected Result : int A=2 ,int B=4
*/
  public static void main(String[] args) {
      Integer num= 24;
      Split_integers( num);
      Split_integers2(num );
  }
  public static void Split_integers(Integer num){

      String newNum= num.toString();
      int leng = newNum.length();
      char [] StrArray=new char[leng];
      for (int i=0 ; i< leng;i++){

       StrArray[i]=newNum.charAt(i);

      }
      System.out.println(Arrays.toString(StrArray));

// 1234567 ==> [ 1 , 234567] [12,34567]


  }
// second method using split method
    public static void Split_integers2(int num ){

      String StringNum=String.valueOf(num);
        int leng =StringNum.length();
        String [] array = StringNum.split("");

        ArrayList<String>list = new ArrayList<>(Arrays.asList(array ));
        System.out.println(list);


        }
    }




