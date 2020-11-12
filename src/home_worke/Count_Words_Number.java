package home_worke;

public class Count_Words_Number {



    public static void main(String []args){

        String str =" one two three viva algeria ";
        String str2 = "   rac hid  ";


        count_words_number(str);

    }
    public static void count_words_number(String str) {
         //str.trim();
        String[] stringArray = str.trim().split(" ");
        int count = 0;

        for (String st : stringArray) {

            if (st != " ") {

                count++;
            }

        }
        System.out.println(count);
    }
}
