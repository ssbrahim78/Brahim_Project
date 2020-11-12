package home_worke;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateString {

    public static void main(String[] args) {
        String str="abcdagadea";
        System.out.println(duplicateString( str));;
        duplicateString2(str);
    }
    //method 1
    public static String duplicateString(String str){
        if(str==null){return null;}
        if(str.length()==0){return null;}
   char [] charArray=str.toLowerCase().toCharArray();
       int leng=str.length();
       String NewString="";
        int i=0,j = 0;
       for ( i=0;i<leng;i++){
           for ( j=0;j<leng;j++){

               if (charArray[i]==charArray[j]){
                 //  System.out.println(charArray[i]+" and "+charArray[j]);
                   break;
               }
             }
           if (i==j){
               NewString=NewString + charArray[i];
           }
       }
       return NewString;
    }

    // method 2
    public static void duplicateString2(String str){
//        if(str==null){return null;}
//        if(str.length==0){return null;}
        int leng=str.length();
        StringBuilder strBufer= new StringBuilder();
        Set<Character> NewString=new HashSet<>();
        for (int i=0;i<leng;i++){
            NewString.add(str.charAt(i));
        }
        System.out.println(Arrays.toString(new Set[]{NewString}));
    }
}
