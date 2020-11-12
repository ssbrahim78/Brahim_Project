package charArray1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class lowest_Number_2_Arrays {
    public static void main(String[] args) {

    int [] array1 = {30,12,5,9,2,20,33,1};
    int [] array2 = {18,25,41,47,17,36,14,19,30,2};
        lowest_number_Arrays( array1, array2);
        lowest_number_In_Arrays( array1, array2);
        }
    public static void lowest_number_Arrays(int [] array1, int [] array2){


        // convert the tow arrays to set
    Set<Integer> list1 = new HashSet<>();
    list1.addAll(Arrays.asList(30,12,5,9,2,20,33,1));
    Set<Integer>list2 = new HashSet<>();
    list2.addAll(Arrays.asList(18,25,41,47,17,36,14,19 ,30,2));
    // get ths difference between the tow arrays
    Set<Integer> difference =new HashSet<>(list1);
    difference.removeAll(list2);
    System.out.println(difference); // prints : [33, 1, 20, 5, 9, 12]
    // get the lowest number in the list difference
    // convert the set difference to the Array
    Object[] differenceArray=difference.toArray();
    int length = differenceArray.length;
    // declare an int lownumber from differenceArray[0] by converting Object to integer
    int lownumber=(int)differenceArray[0];
    int i=0;
     for ( i=0; i <length; i++){
        int number =(int) differenceArray[i];

        if (lownumber>number  ) {
            lownumber=number;
        }
    }
    System.out.println("the lowest number is "+lownumber); // prints : 1
}
   //method without in-built method
    // array1 = {30,12,5,9,2,20,33,1};
   // array2 = {18,25,41,47,17,36,14,19,30,2};
    public static void lowest_number_In_Arrays(int [] array1, int [] array2){
        int i,j;
        int index = 0;
        int leng1 = array1.length;
        int leng2= array2.length;
        int[]differenceArray= new int[leng1];

        for (i=0;i<leng1;i++){

            for (j=0;j<leng2;j++){

                if(array1[i]!=array2[j]){
                    break; }
            }
            if (j!=i){differenceArray[index++]= array1[i];
            }
            }


        System.out.println(Arrays.toString(differenceArray));

        }


    }


