package home_worke;

import java.util.Scanner;

public class Reverse_String {
    public static  String newString="";
    public static  int i=1;
    public static void main(String[] args) {
        String str ="123";
        System.out.println(reverse_String( str,newString));
       // reverse_String( str,newString);

//      Scanner scn = new Scanner(System.in);


    }

public static String reverse_String( String str,String newString){

      if (newString.length()==str.length()) return newString;
  newString = newString + str.charAt(str.length()-i);
  i++;
  return reverse_String(str , newString);



}

}
