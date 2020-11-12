package home_worke;

public class SuipeIntegers {

    public static void main(String[]args){
        int x=-10;
        int y=-5;
        swipeIntegers(x,y);

    }
    public static void swipeIntegers(int x,int y){

//        x=x*y;
//        y=x/y;
//        x=x/y;
        // x=5,y=7
      //  x=x*y;
// x=5*7 ==>x=35
      //  y=x/y;
// y=35/7 ==>y=5
       // x=x/y;
// x=35/5 ==>x=7

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("x=" + x);
        System.out.println("y=" + y);



    }
}
