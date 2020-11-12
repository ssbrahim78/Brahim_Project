package home_worke;

public class StringLength {
    public static void main(String[]args){
        String str=" brahim";

        System.out.println(getStringlength( str));


    }
    public static int getStringlength(String str){
        int count=0;
       // String str1=str.trim();
        String[] charArray=str.trim().split("");
        for(String chr: charArray) {
            count++;
        }
        return count;
    }
}
