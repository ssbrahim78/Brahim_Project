package charArray1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicat_Number {

    /*Java program to remove  duplicates numbers in a given Array of numbers :

    Write a method to remove the duplicate number.
    Note:
    Input : arr[] = { 1, 3, 2,4, 5, 6,4}
    Expected Result : { 1, 3, 2, 5, 6,4}
    Input : arr[] = { 1, 3, 2, 13,5, 6,4,7,8,10,11,12,15,16,13,9,2,14}
    Expected Result : { 1, 3, 2, 13,5, 6,4,7,8,10,11,12,15,16,9,14}
    Input : arr[] = {2}
    Expected Result : 0
    Input : arr[] = [Empty]
    Expected Result : 0
    Input : arr[] = {}
    Expected Result : 0
    Input : arr[] = { 1, 3, 2, 5, 6,4}
    Expected Result : 0
    Input : arr[] = { 1, 2, 2}
    Expected Result : 2
    Input : arr[] = { 1,2}
   Expected Result : 0
            */

  //  int [] array={1,2,3,4,5,6,7,8,3,9,10,11,9,12,13,7,14,15,3};

    public static void main(String[] args) {
     int [] numbAray=  {1,2,20,3,4,5,6,7,8,3,9,10,3,11,9,12,13,7,14,15,3,};
     System.out.println(Arrays.toString(Remove_Duplicat_Numbers(numbAray)));
        System.out.println(Remove_duplicate_Array(numbAray));;
        System.out.println(Arrays.toString(Remove_duplicate_Array2( numbAray)));;
       // Remove_Duplicat_Numbers( numbAray);
    }

 public static int[] Remove_Duplicat_Numbers(int [] numbAray) {

       if (numbAray==null || numbAray.length==0){return null;}
        int index = 0;
     int leng= numbAray.length;
   int i,j;
     //compare if tow numbers are equals && compare indexes if equals then reassign indexes [index] to the NumberArray
     //ex: {a[0],b[1],a[2],c[3]}==>{a[0],b[1],c[2],0[3]}
    for (i=0; i<leng ;i++){
            for (j=0 ; j<leng; j++){
              if(numbAray[i]==numbAray[j]){
                  break; }
            }
                if (j==i){numbAray [index++]= numbAray[i];
                }
        }
        int [] newNumbArray = new int[index];
       for (i=0; i<index ; i++){
          newNumbArray [i]= numbAray[i];
       }
  return newNumbArray;

 }
//  using in-built method
    public static Set<Integer> Remove_duplicate_Array(int[] numbAray){
        if (numbAray==null){
            return null;
        }
     int leng= numbAray.length;
        Set<Integer> arraylist=new LinkedHashSet<>();
        for (int i=0 ; i<leng;i++){
            arraylist.add(numbAray[i]);

        }
        return arraylist;

    }
// {1,2,1}
//using for loop method
public static int [] Remove_duplicate_Array2(int[] numbAray){
        if (numbAray==null){
            return null;
        }

        // numbAray={1,2,1,2}
        int i=0;
        int j=0;
        int index=0;
        int leng = numbAray.length;
        int []newarray=new int[leng];
      for ( i=0 ;i<leng ;i++){
         for ( j=0 ;j<leng;j++){
            if (numbAray[i]==numbAray[j]){
                break; }
         }
         if (i==j){
            newarray[i]=numbAray[i]; // 1,2
             index++;               // 2
         }
      }
    System.out.println(Arrays.toString(newarray));
      int [] removedDuplicArray=new int[index];

      for (i=0 ;i<index; i++ ){
          removedDuplicArray[i]=newarray[i];
      }

    return removedDuplicArray;

}





}
