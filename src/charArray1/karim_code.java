package charArray1;

public class karim_code {

   /* Find the maximum occurring character in a given string .
            Return null if no unique maximum character is found.
            Note: Avoid using the in-built method.
    Input : abcdcd
    Expected Result : c
    Input : abcdeg
    Expected Result : null
    Input : ""
    Expected Result : null
    Input : bcdcaa
    Expected Result : a
    Input : aaaa
    Expected Result : a
    Input : b
    Expected Result : b

    Input : bbaacdd ===> I have to work on it !!!!!!
    Expected Result : b
*/
    public static void main(String[] args) {
        String str = "bbaabdd";
        System.out.println(maximumChar( str ));

    }
public static Character maximumChar(String str ) {
    int legn = str.length();
    int[] charCount = new int[legn];
    char maxchar = ' ';
    int max = 0;
    for (int i = 0; i < legn; i++) {
        for (int j = 0; j < legn; j++) {

            if (str.charAt(i) == str.charAt(j)) {
                charCount[i]++;
                //          b b a a b d d
                //charCount[1,2,1,2,3,1,2]
            }
            if (charCount[i] > max) {
                max = charCount[i];
                maxchar = str.charAt(i);
            }
        }

    }
    if (legn ==0 || max == 1 && legn !=1  ) {
        return null;}
    else return maxchar;
    }


}
