package home_worke;

import java.util.ArrayList;
import java.util.Scanner;

public class prime_number {

    public static void main(String[] args) {
        int n = 13;
        prime_Numbers();
        System.out.println( prime_Numbers_ArrayList( n));
    }
    public static void prime_Numbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the Number : ");
        int num = sc.nextInt();
        for (int j = num; j > 1; j--) { // num = 13 , i=12 ,j=13
            boolean isPrime = true;
            int i = j - 1;
            while (i > 1) {
                if (j % i == 0) {
                    isPrime = false;
                }
                i--;
            }
            if (isPrime) {
                System.out.println(" The prime number is : " + j);
            }
        }
    }

    public static ArrayList prime_Numbers_ArrayList(int n) {
        ArrayList prime_Num = new ArrayList<>();
        int count;
        for (int i = 0; i <= n; i++) {
            count = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                prime_Num.add(i);
            }     }
        return prime_Num;
        }

    }
