package home_worke;

public class A_Test {


    public static void main(String[] args) {
        A.i=5;                  //    use A class because of the static variable
        A.Outermeyhod();	    //  	use the A class because of the static method

        A.B object2 = new A.B();  // the inter class is static
        A.B.b=3;                  // if the inter variable static use the classes A.B
        object2.InterMethod();	// use the object with normal method
        A.B.InterMethod();    //   use the classes A.B for the static method
    }
    
}
