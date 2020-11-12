package charArray1;

public class Lowest_number {

   // Write java solution to find the lowest number from this array.
     //       Ex: numbArray ={12,5,7,67,45}=>{5}
    public static void main(String[] args) {
        int [] numbArray={12,5,7,67,45};
       // System.out.println(lowest_number(numbArray));;
        lowestNumber( numbArray);
    }
public static int lowest_number(int [] numbArray){
    int i,j;
    int lowestnumber= numbArray[0];
    int leng = numbArray.length;
    for ( i=0 ;i<leng;i++){  // i=0

        for (j =leng-1 ;j >i ; j++){
            if (numbArray[i]< numbArray[j]){
                lowestnumber=numbArray[i];
            }
        }
    }

    return lowestnumber;
}
    public static void lowestNumber(int[]numbArray){

        int length=numbArray.length;
        if (length==0){
            System.out.println("the Array is empty");
        }
        int lowestnumber=numbArray[0];
        for (int i = 1 ; i<length;i++){
            if ( lowestnumber > numbArray[i]){
                lowestnumber=numbArray[i];  }
        }    System.out.println(lowestnumber);}

}
