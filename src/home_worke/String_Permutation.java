package home_worke;

import java.util.ArrayList;

/*
	Statements to understand the exercise solution
        String s1="Javatpoint";
        String substr = s1.substring(1); // Starts with 1 and goes to end
        System.out.println(substr); // print:    avatpoint
        String substr2 = s1.substring(2,5); // Starts from 2 and goes to 5
        System.out.println(substr2);   // prints : vat
        String substr3 = s1.substring(0+2); // Returns Exception start from 2 to end
        System.out.println(substr3);  // prints : vatpoint
*/
public class String_Permutation {
    public static void main(String[] args) {
        String str = "ABCD";
        String newString ="";
        printPermutn(str, newString);
        System.out.println(returnPermutation(str));
    }
     // public static void removeDuplicateString(String str , String removedDUPString)

    static void printPermutn(String str, String newString) {
        // If string str is empty it will print
        if (str.length() == 0) {
            System.out.println("the permut is "+newString + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            // ith character of str
            char ch = str.charAt(i); // 1
            // Rest of the string after excluding the ith character
            String RestOfString = str.substring(0, i) + str.substring(i + 1); // 23
// Recurvise call method printPermutn(RestOfString, newString + ch) --->printPermutn(String str, String newString)
            printPermutn(RestOfString, newString + ch);  // 23
        }
    }
    // second method
    public static ArrayList<String> returnPermutation(String str) {
        if (str.length() == 0) {
            ArrayList<String> isEmpty = new ArrayList<>();
            isEmpty.add("");
            return isEmpty;
        }
        char charWord = str.charAt(0);
        String subWord = str.substring(1);
//recursion
        ArrayList<String> lastStr = returnPermutation(subWord);
        ArrayList<String> newStr = new ArrayList<>();
        for (String elem : lastStr) {
            for (int i = 0; i <= elem.length(); i++) {
                newStr.add(elem.substring(0, i) + charWord + elem.substring(i));
            }
        }
        return newStr;
    }

}
