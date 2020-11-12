package home_worke;

import java.util.Scanner;

public class fa_homework2 {

    public static void main(String args[])
    {
        int array[]= {3,15,1,62,9,10,-1,17,10,16,-2,99,67,58,31,22,90,29,55,40};
        int sortedArray[]= {3,5,7,8,9,10,13,18,23,25,29,34,41,55,79,90,101,105,117,135};

       Scanner scn =new Scanner(System.in);
        System.out.println("1 for Sequential Search");
        System.out.println("2 for Binary Search");
        int choice=scn.nextInt();

        if (choice<1 || choice>2 ){
            System.out.println("the choice should be 1 or 2, reEnter you choice");
             choice=scn.nextInt();}
       if(choice==1){
            System.out.println("enter the searching  number ");
           int number= scn.nextInt();
           int x= sequentialSearch( array,number);
           if (x!=-1) System.out.println(" the number found at index "+x);
           else{ System.out.println("the number is not found "); }
        }
        else if (choice==2){
            System.out.println("enter the searching  number ");
            int number= scn.nextInt();
            int x=  binarySearch( sortedArray,number);
            if (x!=-1) System.out.println(" the number found at index "+x);
            else{ System.out.println("the number is not found "); }
        }
    }
   public static int binarySearch(int sortedArray[], int number)
    {
        int left = 0, right = sortedArray.length - 1;
        while (left <= right) {
            int m = left + (right - left) / 2;

            if (sortedArray[m] == number)
               return m;
            if (sortedArray[m] < number)
               left = m + 1;

            else
                right = m - 1;
        }
       return -1;
    }
  public  static int  sequentialSearch(int[] array,int number)
    {
        for(int i =0;i<array.length;i++)
        {
            if(array[i]==number){

                return i;
               }
            }
        return -1;
        }
    }

