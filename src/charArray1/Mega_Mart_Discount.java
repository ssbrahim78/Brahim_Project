package charArray1;

import java.util.Scanner;

public class Mega_Mart_Discount {


    public static void main(String[] args) {
        double Discount_pusentage=0;
        String Costumer_type="";
        Scanner scn = new Scanner(System.in);
        System.out.println("enter Costumer_ID ");
        int  Costumer_ID = scn.nextInt();
        if (Costumer_ID <=0){
            System.out.println("the costemer doesn't existe");
            Runtime.getRuntime().halt(0);
        }
       System.out.println("enter Bill Amount");
        double Bill_amount=scn.nextInt();
        Get_Mega_Mart_Discount( Costumer_ID,Costumer_type, Bill_amount, Discount_pusentage) ;
    }
    public static void Get_Mega_Mart_Discount(int Costumer_ID,String Costumer_type,double Bill_amount,double Discount_pusentage) {
        double total_Bille;
        if (Bill_amount<=0){
            System.out.println("this is not a valid bill");
        }
        if (Costumer_ID >= 1 && Costumer_ID <= 100 && Bill_amount>=1000 ) {
            Discount_pusentage = 15;
            total_Bille = Bill_amount - (Bill_amount * Discount_pusentage / 100);
            System.out.println("================================================");
            System.out.println("Costumer type : Bronze ");
            System.out.print("the price to pay is: " );
            System.out.printf("%.2f", total_Bille);
            System.out.println();
            System.out.println("================================================");}
        else if (Costumer_ID >= 1 && Costumer_ID <= 100 && Bill_amount<1000 ){  total_Bille = Bill_amount;
            System.out.println("================================================");
            System.out.println("Costumer type : Bronze");
            System.out.print("the price to pay is: " );
            System.out.printf("%.2f", total_Bille);
            System.out.println();
            System.out.println("================================================");  }
            if (Costumer_ID >= 101 && Costumer_ID <= 250 && Bill_amount>=1000 ) {
                Discount_pusentage = 18;
                total_Bille = Bill_amount - (Bill_amount * Discount_pusentage / 100);
                System.out.println("================================================");
                System.out.println("Costumer type : Silver ");
                System.out.print("the price to pay is: " );
                System.out.printf("%.2f", total_Bille);
                System.out.println();
                System.out.println("================================================");}
            else if (Costumer_ID >= 101 && Costumer_ID <= 250 && Bill_amount<1000 ){  total_Bille = Bill_amount;
                System.out.println("================================================");
                System.out.println("Costumer type : Silver");
                System.out.print("the price to pay is: " );
                System.out.printf("%.2f", total_Bille);
                System.out.println();
                System.out.println("================================================");}

                if (Costumer_ID >= 251 && Costumer_ID <= 500 && Bill_amount>=1000 ) {
                    Discount_pusentage = 23;
                    total_Bille = Bill_amount - (Bill_amount * Discount_pusentage / 100);
                    System.out.println("================================================");
                    System.out.println("Costumer type : Gold ");
                    System.out.print("the price to pay is: " );
                    System.out.printf("%.2f", total_Bille);
                    System.out.println();
                    System.out.println("================================================");
                }

                else if (Costumer_ID >= 251 && Costumer_ID <= 500 && Bill_amount<1000 ){  total_Bille = Bill_amount;
                    System.out.println("================================================");
                    System.out.println("Costumer type : Gold ");
                    System.out.print("the price to pay is: " );
                    System.out.printf("%.2f", total_Bille);
                    System.out.println();
                    System.out.println("================================================");}
                    if (Costumer_ID >= 501 && Costumer_ID <= 100 && Bill_amount>1000 ) {
                        Discount_pusentage = 28;

                        total_Bille = Bill_amount - Bill_amount * Discount_pusentage / 100;
                        System.out.println("================================================");
                        System.out.println("Costumer type : Platinum ");
                        System.out.print("the price to pay is: " );
                        System.out.printf("%.2f", total_Bille);
                        System.out.println();
                        System.out.println("================================================");}
                    else if(Costumer_ID >= 501 && Costumer_ID <= 100 && Bill_amount<1000 )  {  total_Bille = Bill_amount;
                        System.out.println("================================================");
                        System.out.println("Costumer type : Platinum ");
                        System.out.print("the price to pay is: " );
                        System.out.printf("%.2f", total_Bille);
                        System.out.println();
                        System.out.println("================================================");}
                        if (Costumer_ID >= 1001 && Bill_amount>=1000 ) {
                            Discount_pusentage = 32;
                            total_Bille = Bill_amount - Bill_amount * Discount_pusentage / 100;
                            System.out.println("================================================");
                            System.out.println("Costumer type : Diamond ");
                            System.out.print("the price to pay is: " );
                            System.out.printf("%.2f", total_Bille);
                            System.out.println();
                            System.out.println("================================================");}
                        else if (Costumer_ID >= 1001 && Bill_amount<1000) {  total_Bille = Bill_amount;
                            System.out.println("================================================");
                            System.out.println("Costumer type : Diamond ");
                            System.out.print("the price to pay is: " );
                            System.out.printf("%.2f", total_Bille);
                            System.out.println();
                            System.out.println("================================================");}
                        }


                    }






