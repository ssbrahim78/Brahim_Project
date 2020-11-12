package home_worke;
import java.util.Arrays;
import java.util.Scanner;

public class fat_students_project {

        public static void main(String[] args) {
          int Size;

             double class_Average=0;
            int doYouwantToContinueTheProgram;
            int i;
            Scanner KB = new Scanner(System.in);

            do {
                System.out.println("enter the class size");
                Size = KB.nextInt();
                while (Size <= 0 ) {
                    System.out.println(" the Size must be greater then 0 --> retry");
                    Size = KB.nextInt();}
                double[] Test1 = new double[Size];
                double[] Test2 = new double[Size];
                double[] Test3 = new double[Size];
                String[] F_Name = new String[Size];
                String[] L_Name = new String[Size];
                char[] MI = new char[Size];
                double total_Averages =0;
                double[] Average = new double[Size];
                for (i = 0; i < Size; i++) {
                System.out.println("enter the student first name");
                F_Name[i]=KB.next();
                System.out.println("enter the student MI");
                MI[i]=KB.next().charAt(0);
                System.out.println("enter the student last name");
                L_Name[i]=KB.next();
                    System.out.println(" Entre a Score 1");
                    Test1[i] = KB.nextFloat();

                    while (Test1[i] < 0 || Test1[i] > 100) {
                    System.out.println(" the score must be in between 0 and 100 --> retry");
                    Test1[i] = KB.nextFloat();}
                    System.out.println(" Entre a Score 2");
                    Test2[i] = KB.nextFloat();
                    while (Test2[i] < 0 || Test2[i] > 100) {
                        System.out.println("the score must be in between 0 and 100 --> retry ");
                        Test2[i] = KB.nextFloat();
                    }
                    System.out.println(" Entre a Score 3");
                    Test3[i] = KB.nextFloat();
                    while (Test3[i] < 0 || Test3[i] > 100) {
                        System.out.println(" the score must be in between 0 and 100 --> retry ");
                        Test3[i] = KB.nextFloat();
                    }
                    Average[i] = (Test1[i]+Test2[i]+Test3[i])/3;
                    total_Averages=total_Averages+Average[i];

                }
                class_Average=total_Averages/Size;
//
                System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n","First name","MI","Last name","Test 1","Test 2","Test 3","Average");
                System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n","________","_________","________","_______","_________","________","_________");

                for( i=0;i<Size;i++)
                {

                    System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n",F_Name[i],MI[i],L_Name[i], Test1[i],Test2[i] ,Test3[i],String.format("%.2f", Average[i]));
                }
                System.out.printf("\nthe Class Average is: "+"%.2f",class_Average);
                System.out.println("\n============================================================================================================");
                System.out.println("\ndo you want to restart your program");
                System.out.println("enter 1 to continue or 0 to stop the program");
                doYouwantToContinueTheProgram = KB.nextInt();
            }  while (doYouwantToContinueTheProgram == 1);


        }

        }
