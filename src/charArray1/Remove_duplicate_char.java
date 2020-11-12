package charArray1;

import javax.swing.*;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicate_char {

    /*
Java program to remove duplicates characters :
Write a method to remove all duplicates characters in a given string.
Note: Avoid using the in-built method.
Input : This is a test
Expected Result : this ae
Input : Replace all spaces
Expected Result : replac s
Input : This
Expected Result : This
Input : [Empty]
Expected Result : null
Input : null
Expected Result : null
*/
    static String input = new String("abbc");

    public static void main(String[] args) {

      String str="ababada";
        System.out.println(Remove_duplicate_char(str));
        System.out.println(remove_Duplicates_Character( str));
        System.out.println(RemoveDup(str));

    }

  public static String Remove_duplicate_char(String str){

        if ( str==null || str.length()==0 ){

            return null;
        }

      char[] chars = str.toLowerCase().toCharArray();

      Set<Character> charSet = new LinkedHashSet<Character>();
      for (char c : chars) {
          charSet.add(c);    }
      StringBuilder sb = new StringBuilder();
      for (Character character : charSet) {
          sb.append(character); }

return sb.toString();
  }

  // str= "abcad"
// second method with out in-built method
public static String remove_Duplicates_Character(String str){
    if(str==null ||str.length()==0){ return null;}

    char [] strChar= str.toCharArray();
    String nonDuplicStr ="";
    int index=0;
    int i,j;
    for(i=0;i<strChar.length;i++){

        for(j=0; j<i ; j++){
            if(strChar[j]==strChar[i]){
                break;
            }
        }
        if(i==j){ strChar[index++]=strChar[i];}
    }
    for(i=0;i<index;i++){
        nonDuplicStr=nonDuplicStr+ strChar[i];
    }
    return nonDuplicStr;

}

  public static String RemoveDup(String str){

  if(str==null ||str.length()==0){ return null;}
 char [] StrCharArray= str.toCharArray();
 String Newstr= "";
 int i,j;
       // "ababada"
      //compare if tow characters are equals && compare indexes if equals => insert the character in NewString
 for (i=0; i<StrCharArray.length; i++){

     for ( j=0 ; j<StrCharArray.length;j++){

         if( StrCharArray[j]==StrCharArray[i]){
             break;
         }
     }
    if (j==i){ Newstr= Newstr+StrCharArray[i]; // a
     }
  }

 return Newstr;
 }

}

