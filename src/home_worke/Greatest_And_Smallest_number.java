package home_worke;

public class Greatest_And_Smallest_number {
    public static void main (String[]args){
        int[] array= { -88,-10,1,5,24,50,987534 };
        get_Smallest_Largest( array);


    }
    public static void get_Smallest_Largest(int[] array){
        int leng = array.length;
        int greatestNumber= 0;
        int smallestNumber=0;
        if (leng==0){
            System.out.println("the array is empty");
            return;
        }
        for(int i=0; i<leng;i++){

            if(array[i]> greatestNumber){ greatestNumber=array[i] ; }
            if(array[i]<smallestNumber){smallestNumber = array[i] ;}


        }

        System.out.println("the greatest number is: "+ greatestNumber);
        System.out.println("the smallest number is : "+ smallestNumber);

    }
}
