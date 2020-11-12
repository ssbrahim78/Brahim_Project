package charArray1;

public class MaxOccuringChar {
/*
    Input : abcdcd --->Expected Result : c
    Input : abcdeg ---->Expected Result : null
    Input : ""-----> Expected Result : null
    Input : bcdcaa ----> Expected Result : a
    Input : aaaa----> Expected Result : a
    Input : b----> Expected Result : b
    Input : bbaacdd ===> Expected Result : b
*/

    public static void main(String [] arg){
      String str= "aabbccc" ;
        System.out.println(MaxOccuringChar(str)); ;
        System.out.println( maximumChar( str ));
    }
    public static final int sizeChar= 256;
   public static Character MaxOccuringChar(String str) {

       if (str==null || str.length()==0){return null;}
       int leng = str.length();
       int max=0;
       char [ ] charArray= str.toLowerCase().toCharArray();
       char charResult=' ';
       int [] charcount=new int[sizeChar];
String str1= str.toLowerCase();

       for (int i=0 ; i<leng; i++){
           charcount[str1.charAt(i)]++;
           if (max< charcount[str1.charAt(i)]){
               max=charcount[str1.charAt(i)];
               charResult=str1.charAt(i);
           }
       }
     if (max==1){return null;}
     return charResult;
   }
    public static Character maximumChar(String str ) {

        int legn = str.length();
        int[] charCount = new int[legn];
        char maxchar = ' ';
        int max = 0;
        for (int i = 0; i < legn; i++) {
            for (int j = 0; j < legn; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    charCount[i]++;  }

            }

            if (charCount[i] > max) {
                max = charCount[i];
                maxchar = str.charAt(i);
            }
        }
        if (legn ==0 || max == 1 && legn !=1  ) {
            return null;                                         }
        else return maxchar;
    }


}
