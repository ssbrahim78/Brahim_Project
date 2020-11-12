package home_worke;

import java.util.Scanner;

public class fa_homework {
    public static void main(String[] args)
    {


        int size=20;

        int sortedArray[]= {3,5,7,8,9,10,13,18,23,25,29,34,41,55,79,90,101,105,117,135};

        int array[]= {3,15,1,62,9,10,-1,17,10,16,-2,99,67,58,31,22,90,29,55,40};

        Scanner input=new Scanner(System.in); //Scanner object to read input


        //prompting user to select search choice
        System.out.println("1 for Sequential Search");
        System.out.println("2 for Binary Search");
        int choice=input.nextInt(); //reading user input
        if(choice==1) //if choice selected is 1
        {
            for(int ele:array) //printing array to user once
                System.out.println(ele+" ");
            System.out.println("Enter Number to be searched");
            int number=input.nextInt(); //getting input of key value to be searched from the user
            boolean isFound=sequentialSearch(number, array); //calling method for sequential search
            if(isFound) //if value is found
                System.out.println(number+" is Found in the array"); //printing found
            else //if value is not found
                System.out.println(number+" is not Found in the array"); //printing not found
        }

        else if(choice==2) //if choice selected is 2
        {
            for(int ele:sortedArray) //printing array to the user once
                System.out.print(ele+" ");
            System.out.println("\nEnter key to be searched");
            int key=input.nextInt(); //reading key to be searched
            boolean isFound=binarySearch(0,sortedArray.length,key, sortedArray);//calling method for binary search
            if(isFound) //if value is found
                System.out.println(key+" is Found in the array"); //printing found
            else //if value is not found
                System.out.println(key+" is not Found in the array"); //printing not found
        }
        else //if user choice is invalid(other than 1 or 2)
        {
            System.out.println("Invalid choice!");
        }
    }


    static boolean sequentialSearch(int key,int[] array) //method for sequential search
    {
        for(int i:array) //Iterating over array
        {
            if(i==key) //if current element is equal to key
                return true; //returning true
        }
        return false; //if value is not found returning flase;

    }
       //{3,5,7,8,9,10,12,15,20,25,29,30,41,52,78,90,101,105,110,115}

    static boolean binarySearch(int left,int right,int key,int[] sortedArray) //method for binary search
    {
//    mid= 3+112=115/2 = 57.5
        while(left<=right) //looping until left less than or equal to right
        {
            int mid=left+(right-left)/2; //getting mid of the current array
            if(key==sortedArray[mid]) //checking if key is equal to mid of the array
                return true; //returning true is key is equal to mid
            else if(key<sortedArray[mid]) //if key is less than the mid
                right=mid-1; //making mid-1 as right
            else if(key>sortedArray[mid]) //if key is greater than mid
                left=mid+1; //making mid+1 as left

        }
        return false; //if key is not found in above search .then returning false.

    }

}

