package home_worke;

public class Max_occuring_char {
    public static void main(String[] args) {
        String str = "abcdaadce";
        System.out.println( MaxOccuringChar(str));
    }
   public static final int CHAR_SIZE=256;
 public static char MaxOccuringChar(String str){
     char [] charArray= str.toLowerCase().toCharArray();
    char maxChar=' ';
    int max=0;
    int i=0;
     int [] charCount = new int [CHAR_SIZE];
     for ( i =0 ; i<str.length();i++) {
         charCount[charArray[i]]++;
         if (charCount[charArray[i]] > max) {
             max = charCount[charArray[i]];
             maxChar = charArray[i]; }
     }
   return maxChar;
 }


}
