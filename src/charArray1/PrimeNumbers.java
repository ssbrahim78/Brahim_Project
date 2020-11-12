package charArray1;

public class PrimeNumbers {

   // Find list of Prime numbers from number 2 to given number.
    //        ex: int Number= 40 ;

    public static void main(String[] args) {
        int Number= 999999999;
        getPrimeNumber( Number)  ;
    }
    public static void getPrimeNumber(int Number) {

        // start the prime numbers i from 2
        for (int i = 2; i <= Number; i++) {
            boolean isPrime = true;
            // create Divisors numbers j start from 2 to i/2
            for (int j = 2; j <= i / 2; j++) {

                // the boolean isPrime returns false if the rest of division is 0
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            // if the boolean isPrime returns true it will print
            if (isPrime == true)
                System.out.print(i);
        }


    }
    }
