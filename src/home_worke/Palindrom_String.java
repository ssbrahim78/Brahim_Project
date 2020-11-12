package home_worke;

public class Palindrom_String {

  public static void main(String[]grs){
String str="madaM";
     // Check_palindrom_string (str ) ;
System.out.println("The given string is palindrome : "+ isPalindromString(str));

  }
  public static void Check_palindrom_string (String str ){
      int leng = str.length();

      // reverse the string
      System.out.println(str);
      System.out.println(str.charAt(0));
      StringBuilder NewString= new StringBuilder(str);
      System.out.println("this is NewString  " +NewString);
      StringBuilder reversedString= NewString.reverse();
      System.out.println("this sis reversed String "+reversedString);
      System.out.println(reversedString.charAt(0));
      System.out.println(reversedString.charAt(0)+"="+str.charAt(0));
      System.out.println(reversedString.charAt(0)!=str.charAt(0));

}
    // create method to check the palindrom String
    public static boolean isPalindromString(String str){
        if (str.length()==0){ return false;}

        String reverse = "";
        // add characters to reverse from str  one by one from the last one to the first
        for(int i = str.length() - 1; i >= 0; i--) {

            reverse = reverse + str.charAt(i);
        }
        // compare if the reverse equals to original string str
        if(str.equalsIgnoreCase(reverse)){
            return true; }

        return false;
    }
  }




