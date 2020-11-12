package home_worke;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicats {
    public static final int CHAR_SIZE = 256;

    public static void main(String[] args) {
        String str = "aabcbb";
      //  System.out.println(Arrays.toString(printDuplicats(str)));
         findDuplicate(str);
      // findDuplicate2(str);
    }

//    public static char[] printDuplicats(String str) {
//        int leng = str.length();
//        char[] charArray = str.toLowerCase().toCharArray();
//
//        char[] newcarArray = new char[leng];
//        int i, j;
//        int index = 0;
//        for (i = 0; i < leng; i++) {
//            for (j = 0; j < leng; j++) {
//                if (charArray[i] == charArray[j]) {
//                    break;
//                }
//            }
//            if (i != j) {
//                newcarArray[index] = charArray[i];
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(newcarArray));
//        char[] duplicatCharArray = new char[index];
//        int index1 = 0;
//        for (i = 0; i < index; i++) {
//            for (j = 0; j < i; j++) {
//                if (newcarArray[i] == newcarArray[j]) {
//                    break;
//                }
//            }
//            if (i == j) {
//                duplicatCharArray[index1++] = newcarArray[i];
//            }
//        }
//        char[] DupNumbArray2 = new char[index1];
//        for (i = 0; i < index1; i++) {
//            DupNumbArray2[i] = duplicatCharArray[i];
//        }
//        return DupNumbArray2;
//    }
//
//    // using inBuilt method
//    public static Set<Character> duplicateChar(String str) {
//        if (str == null) return null;
//        char[] strChar = str.toLowerCase().toCharArray();
//        int i;
//        Set<Character> dupstr1Char = new LinkedHashSet<>();
//        Set<Character> dupstr2Char = new LinkedHashSet<>();
//        for (i = 0; i < strChar.length; i++) {
//            if (!dupstr1Char.add(strChar[i])) {
//                dupstr2Char.add(strChar[i]);
//            }
//        }
//        return dupstr2Char;
//    }

    public static void findDuplicate(String str) {
        String NewString = "";
        int leng = str.length();
        char[] charArray = str.toCharArray();
        int[] charCount = new int[CHAR_SIZE];
        for (int i = 0; i < leng; i++) {
            charCount[charArray[i]]++;
            System.out.println(Arrays.toString(new int[]{charCount[charArray[i]]}));
        }
        System.out.println(charCount[charArray[0]]);
        for (int i = 0; i < leng; i++) {
            if (charCount[charArray[i]] >= 2) {
             //   NewString = NewString + str.charAt(i);
                System.out.println("azul "+charCount[charArray[i]]);
            }

        }
        System.out.println("this is the new String " + NewString);
    }
//**********************************************
//    public static void findDuplicate2(String str) {
//      //  String str = "aabcbb"
//        String NewString = "";
//        int leng = str.length();
//        char[] charArray = str.toCharArray();
//        int[] charCount = new int[leng];
//        int max = 0;
//        char maxchar=' ';
//        for (int i = 0; i < leng; i++) {
//            for (int j = 0; j < leng; j++) {
//                if (str.charAt(i) == str.charAt(j)) {
//                    charCount[i]++;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(charCount));
//            System.out.println("*********************************");
//            }   for(int i=0;i<leng;i++){
//            if (charCount[i]>max){
//            //    System.out.println(charCount[i]);
////                max=charCount[i];
////                System.out.println(max);
////                maxchar=str.charAt(i);
////               NewString=NewString+maxchar;
//            }  }
//       // System.out.println(NewString);
    // using inbuilt method
public static Set<Character> duplicateChar(String str) {
    if (str == null) return null;
    char[] strChar = str.toLowerCase().toCharArray();
    int i;
    Set<Character> dupstr1Char = new LinkedHashSet<>();
    Set<Character> dupstr2Char = new LinkedHashSet<>();
    for (i = 0; i < strChar.length; i++) {
        if (!dupstr1Char.add(strChar[i])) {
            dupstr2Char.add(strChar[i]);
        }
    }
    return dupstr2Char;
}
       }



