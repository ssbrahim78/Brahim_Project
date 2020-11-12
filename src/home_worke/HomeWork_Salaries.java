package home_worke;




/*
    apply the following:
1. do while loop to repeat your program,
2. while loop to validate your input (hours and rate must be greater than 0)
3. apply print f statement for your output
Write a java program to calculate the gross, tax and net for an employee. your input is:
 First name, Middle initial, Last name, Id number, hours worked, rate per hour.
 assume the tax percentage is 12%.
formulas :
Gross_pay = hours worked * rate per hour
Gross_Tax = Gross_pay * tax_percentage
 Net_pay = Gross_pay – Gross_Tax
 Display: First Name: Middle Initial: Last Name: Id Number: Hours worked: Rate Per hour: Tax: Gross: Net: a message : ** Thank You ***
     */
import java.util.Scanner;
    public class HomeWork_Salaries {
       static String  First_name, Last_name;
       static char Middle_initial;
      static  int Id_number;
       static double hours_worked,rate_per_hour;
      static  double tax_percentage =0.12;
      static  double Gross,Tax,Net ;
      static int doYouwantToContinueTheProgram;

        public static void main(String[]args) {

            Scanner scn = new Scanner(System.in);
            do {
                System.out.println("enter First name: ");
                First_name = scn.next();
                System.out.println("enter Last name: ");
                Last_name = scn.next();
                System.out.println("enter Middle Initial: ");
                Middle_initial = scn.next().charAt(0);
                System.out.println("enter Id_number");
                Id_number = scn.nextInt();
                System.out.println("enter hours_worked");
                hours_worked = scn.nextDouble();
                System.out.println("enter rate_per_hour");
                rate_per_hour = scn.nextDouble();

                while (hours_worked > 0 && rate_per_hour > 0) {

                    Gross = hours_worked * rate_per_hour;
                    Tax = Gross * tax_percentage;
                    Net = Gross - Tax;
                    System.out.println("==================Welcome=========================");
                    System.out.println("First name: "+First_name);
                    System.out.println("Last name: "+Last_name);
                    System.out.println("Middle initial: "+Middle_initial);
                    System.out.println("Id number: "+Id_number);
                    System.out.println("hours worked: "+hours_worked);
                    System.out.println("rate per hour: "+rate_per_hour);
                    System.out.println("Gross Tax: "+Tax);
                    System.out.println("Gross pay: "+Gross);
                    System.out.printf("the net pay is: "+"%.2f",Net);
                    System.out.println();
                    System.out.println("******************* Thank You ********************");
                    break;
                }

                System.out.println("do you want to continue ");
                System.out.println("put 1 to continue or 0 to stop the program");

                doYouwantToContinueTheProgram = scn.nextInt();

            }
            while (doYouwantToContinueTheProgram==1);


                }



        }
