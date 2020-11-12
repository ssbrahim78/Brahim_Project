package charArray1;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Anagram {

    // How to check if two given Strings are the anagram of each other: ex: "Army" and "Mary"

    public static void main(String[] grs) {
        String str1 = "aramaya";
        String str2 = "MAaraya";
        System.out.println(check_Anagram_String(str1, str2));
        System.out.println(check_Anagram_String2( str1, str2));
        System.out.println(isAnagramCounting( str1,  str2));
    }

    public static boolean check_Anagram_String(String str1, String str2) {
        int leng1 = str1.length();
        int leng2 = str2.length();
        if (leng1 != leng2) {
            return false;
        }
        //
        char[] charArray1 = str1.toLowerCase().toCharArray();
        sort(charArray1);
        String SortedString1 = new String(charArray1);
        char[] charArray2 = str2.toLowerCase().toCharArray();
        sort(charArray2);
        String SortedString2 = new String(charArray2);

        if (SortedString1.equals(SortedString2)) {
            //    if (charArray1==(charArray2)) {
            return true;
        } else
            return false;
    }
      // Sort both strings
      //  Arrays.sort(str1);
     //   Arrays.sort(str2);

    // second method
    public static boolean check_Anagram_String2(String str1, String str2) {
        int leng1 = str1.length();
        int leng2 = str2.length();
        if (leng1 != leng2) {
            return false;
        }
        char[] charArray1 = str1.toLowerCase().toCharArray();
        sort(charArray1);
        // String SortedString1= new String(charArray1);

        char[] charArray2 = str2.toLowerCase().toCharArray();
        sort(charArray2);
        // String SortedString2= new String(charArray2);


        for (int i = 0; i < leng1; i++) {

            if (charArray1[i] != charArray2[i]) {
                return false;
            }

        }


        return true;
    }

    // method without Sorting method
    private static int CHARACTER_RANGE= 256;

    public static boolean isAnagramCounting(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }

        int count[] = new int[CHARACTER_RANGE];
        for (int i = 0; i < string1.length(); i++) {    // +1                                                 a  b
            count[string1.toLowerCase().charAt(i)]++;   // "a r b y "    count[a]={1,1,1,1}  {0,1,2,3.........65.75....256}
            count[string2.toLowerCase().charAt(i)]--;   // "m a r y"     count[a]={-1,-1,-1,-1} {0,1,2,3......65...65}
        }                                               // -1            count[a]={-1,0,1,0}      {0,0,0,0.........65}
        for (int i = 0; i < CHARACTER_RANGE; i++) {    // {4,2,6,}
            if (count[i] != 0) { // count={2,2,2,2}
                return false;
            }
        }
        return true;
    }
}