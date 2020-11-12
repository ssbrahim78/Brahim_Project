package charArray1;

import java.util.Arrays;

public class FindDuplicatChar {

    // String str = "abcadcef"------> ac

    public static void main(String[] args) {
        String str = "brahimetkarimambihh";
        int[] numArray = {1,2,3,2,4,2,5,6,6,4,2,6,6,6,6,6,6};
        findDuplicatChar(str);
        System.out.println(Arrays.toString(Find_Duplicat_numbers(numArray)));

    }

    // *************************find Duplicate characters for given String ***************************************
    public static void findDuplicatChar(String str) {
        int leng = str.length();
        String AllduplicatChar = "";
        String duplicatChar = "";
        int i, j;
        for (i = 0; i < leng; i++) {
            // a b a c d
            for (j = leng - 1; j > i; j--) {
                if (str.charAt(i) == str.charAt(j)) {  break;   }
            }
            if (i != j) { AllduplicatChar = AllduplicatChar + str.charAt(i); }
        }
        for (i = 0; i < AllduplicatChar.length(); i++) {
            for (j = 0; j < i; j++) {
                if (AllduplicatChar.charAt(i) == AllduplicatChar.charAt(j)) {  break; }
            }
            if (i == j) { duplicatChar = duplicatChar + AllduplicatChar.charAt(i);  }
        }
        System.out.println(duplicatChar);
    }

    //***********************************find Duplicate numbers for given Array *************************************

    public static int[] Find_Duplicat_numbers(int[] numbAray) {
        int leng = numbAray.length;
        int index2=0;
        int index =0;
        int i, j;
        if (numbAray==null || numbAray.length==0){return null;}
        for (i = 0; i < leng; i++) {
            for (j = 0; j < i; j++) {
                if (numbAray[i] == numbAray[j]) {  break;  }
            }
            if (i != j) { numbAray[index++] = numbAray[i];  }
        }
        int[] newNumbArray = new int[index];
        for (i = 0; i < index; i++) { newNumbArray[i] = numbAray[i];   }

        for (i=0; i<newNumbArray.length ;i++){
            for (j=0 ; j<i ; j++){
                if(newNumbArray[i]==newNumbArray[j]){    break; }
            }
            if (j==i){newNumbArray[index2++]= newNumbArray[i]; }
        }
        int [] DupNumbArray2 = new int[index2];
        for (i=0; i<index2 ; i++){
            DupNumbArray2 [i]= newNumbArray[i]; }


        return DupNumbArray2;

    }



    }
