package charArray1;

public class removeGivenChar {

    //How to remove given characters from the String
    //
    //Ex:  str ="barbara"; character 'b'  prints: arara

    public static void main(String[] args) {
        String str = "barBara";
        System.out.println(Removechar( str));
    }

    public static String Removechar(String str){
        if (str== null ||str.length()==0  ){return null;}
        int leng =str.length();
        char char1 = 'b';
        String newString ="";
        for (int i=0 ; i<leng ;i++  ){
           if(str.toLowerCase().charAt(i)!=char1) {
               newString = newString + str.charAt(i);
           }

        }

      return newString;

    }


}
