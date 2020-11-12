package home_worke;

public class OuterClass {  // this is outer class


        public int i;
        public void Outermeyhod() {
            System.out.println("this is the outer method");
        }
        public class inner{                 //        this is inter class
            int b;
            public void InterMethod() {
                System.out.println("this is the inter method");
            }  }

    public static void main(String[] args) {
        OuterClass object = new OuterClass();
        object.i=5;
        object.Outermeyhod();

        OuterClass.inner object2 = object.new inner();   // --to get the inter class variable and methods
                object2.b=3;
        object2.InterMethod();
    }}







