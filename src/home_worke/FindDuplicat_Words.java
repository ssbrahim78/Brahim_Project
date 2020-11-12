package home_worke;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//    Given a String names[] = {"java","javaScript","Ruby","C","Python","java","java"};
//    Print all the duplicates words
//    Note: use a traditional for loop
//    Note: use hashSet
public class FindDuplicat_Words {
    public static void main(String[] args) {
        String arrayString[] = {"java","javaScript","Ruby","C","Python","java","java","C","C","C","C","C","C","C","C","C","C","C","C","C"} ;
        System.out.println(find_Words_Duplicates( arrayString));
        System.out.println(duplicateWord( arrayString));
        duplicateWord( arrayString).forEach(dup -> System.out.println(dup));
    }

    public static List find_Words_Duplicates(String[] arrayString) {
       if (arrayString==null){return null;}
        int leng = arrayString.length;
        String[] newStringArray = new String[leng];
        int i, j;
        int index = 0;
        for (i = 0; i < leng; i++) {
            for (j = 0; j < leng; j++) {
                if (arrayString[i] == arrayString[j]) {
                    break;
                }
            }
            if (i != j) {
                newStringArray[index++] = arrayString[i];
            }
        }
        //String[] duplicatWordsArray= new String[index];
        List<String> duplicatWordsList = new ArrayList<>();
        for (i = 0; i < index; i++) {
            for (j = 0; j < index; j++) {
                if (newStringArray[i] == newStringArray[j]) {
                    break;
                }
            }
            if (i == j) {
                duplicatWordsList.add(newStringArray[i]);
            }
        }
        return duplicatWordsList;
    }
// second method:
public static Set duplicateWord(String[] arrayString) {
    if (arrayString == null ) return null;
    int i;
    Set<String> duplicateString1 = new LinkedHashSet<>();
    Set<String> duplicateString2 = new LinkedHashSet<>();
    for (i = 0; i < arrayString.length; i++) {
        if (!duplicateString1.add(arrayString[i])) {
            duplicateString2.add(arrayString[i]);
        }
    }
    return duplicateString2;
}
}

