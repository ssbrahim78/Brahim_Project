package home_worke;


import java.util.ArrayList;

public class practice {


    public static void main(String[] args) {
int number= 9;
       System.out.println( prim_number(number) );
        prim_number2( number);
    }

    public static boolean prim_number(int number){

        int restOfDevision;
       // Boolean isPrime = false;
        for(int i=2;i<number/2;i++){
            restOfDevision=number%i;
            if(restOfDevision==0){
                return false;
            }
        }
        return true;
    }
    public static void prim_number2(int number){

        int restOfDevision;
         Boolean isPrime = true;
        for(int i=2;i<number/2;i++){
            restOfDevision=number%i;
            if(restOfDevision==0){
                isPrime = false;
                System.out.println(isPrime );
                break;
            }
        }
      if(isPrime==true){System.out.println(isPrime);}
    }
}