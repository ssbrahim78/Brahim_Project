package home_worke;
import java.util.Scanner;
public class fat_homework3 {



        public static void main(String[] args) {
            System.out.println("Enter 1 for Square");
            System.out.println("Enter 2 for Rectangle");
            System.out.println("Enter 3 for Triangle");
            System.out.println("Enter 4 for Circle");
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the choice");
            int choice=input.nextInt();
            if (choice<=0 || choice>=5){
                System.out.println("the choice entered doesn't exist");
            }
            System.out.println("Reenter the choice ");
            choice=input.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter side of square:");
                    double side=input.nextDouble();
                    if(side<=0){
                        System.out.println("Enter side greater than 0.");
                        System.out.println("Enter side of square:");
                        side=input.nextDouble();
                    }
                    System.out.println("the entred side is:"+side);
                    System.out.println("Area of square:"+side*side);
                    break;
                case 2:
                    System.out.print("Enter length of Rectangle:");
                    double length=input.nextDouble();
                    System.out.print("Enter breadth of Rectangle:");
                    double breadth=input.nextDouble();
                    if(length<=0||breadth<=0){
                        System.out.println("Enter values greater than 0.");
                        System.out.print("Enter length of Rectangle:");
                        length=input.nextDouble();
                        System.out.print("Enter breadth of Rectangle:");
                        breadth=input.nextDouble();
                    }
                    System.out.println("the entred length is:"+length);
                    System.out.println("the entred breadth is:"+breadth);
                    System.out.println("Area of Rectangle:"+length*breadth);
                    break;
                case 3:
                    System.out.print("Enter base of triangle:");
                    double base=input.nextDouble();
                    System.out.print("Enter height of triangle:");
                    double height=input.nextDouble();
                    if(base<=0||height<=0){
                        System.out.println("Enter values greater than 0.");
                        System.out.print("Enter base of triangle:");
                        base=input.nextDouble();
                        System.out.print("Enter height of triangle:");
                        height=input.nextDouble();
                    }
                    System.out.println("the entred base is:"+base);
                    System.out.println("the entred height is:"+height);
                    System.out.println("Area of triangle:"+base*height/2);
                    break;
                case 4:
                    System.out.print("Enter radius of circle:");
                    double radius=input.nextDouble();
                    if(radius<=0){
                        System.out.println("Enter radius greater than 0.");
                        System.out.println("Enter radius of circle:");
                        radius=input.nextFloat();
                    }
                    System.out.println("the entred radius is:"+radius);
                    System.out.println("Area of circle:"+3.14*radius*radius);
                    break;

//                default:
//                    System.out.println("Reenter the choice ");
//                    choice=input.nextInt();

            }
        }
    }

