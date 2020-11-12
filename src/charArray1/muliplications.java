package charArray1;

public class muliplications {

 /*
Java program for Multiplication without using a multiplication operator (*) :
Write a method to multiply two given numbers : " X " ," Y " without using a multiplication operator (*).
Note: Avoid using the in-built method.
Note: Use recursion method.
Input : " X = 6 " ," Y = 5 "
Expected Result : 30
Input : " X = - 6 " ," Y = - 5 "
Expected Result : 30
Input : " X = - 6 " ," Y = 5 "
Expected Result : - 30
Input : " X = 0 " ," Y = 5 "
Expected Result : 0
Input : " X = 0 " ," Y = 0 "
Expected Result : 0
*/

    public static void main(String[] args) {
        int x= 0;
        int y= 2;

        System.out.println(multiplicationUsingAddition(x,y));
        System.out.println(multiplicationUsingRecursion(x,y));
        System.out.println(multiplication( x,  y));
        System.out.println(multiplicationUsingRecursion2(x,  y));

    }
// method without multiplication operator
    public static int multiplicationUsingAddition(int x, int y){
        int Result=0;
        if((y<0 && x<0)||(y<0 && x>0)){x=-x;y=-y;
            while(y>0){
                Result=Result +(x);
                y--;}
        }
        else if((y>0 && x<0 )||(y>0 && x>0)){
            while(y>0){
                Result=Result +(x);
                y--;}
        }
        return Result;
    }
        //method using recursion
    public static int multiplicationUsingRecursion(int x, int y){
        int Result=0;
        if((y<0 && x<0)||(y<0 && x>0)){x=-x;y=-y;
            if(y>0){
                Result= x+multiplicationUsingRecursion(x,y-1);}
        }
        else if((y>0 && x<0 )||(y>0 && x>0)){
            if(y>0){
                Result= x+multiplicationUsingRecursion(x,y-1);}
        }
        return Result;
    }
    //forloop method
    public static int multiplication(int x, int y) {
        int mult = 0;
        if((y<0 && x<0)||(y<0 && x>0)){x=-x;y=-y;}

        for (int i = 1; i <= y; i++) {
            mult = mult + x;  }
        return mult; }

    public static int multiplicationUsingRecursion2(int x, int y) {
        if((y<0 && x<0)||(y<0 && x>0)){x=-x;y=-y;}
      while (y > 0) {
            return x + multiplicationUsingRecursion(x, y - 1);
        } return 0;
    }


}






