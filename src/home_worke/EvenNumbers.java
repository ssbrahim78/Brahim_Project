package home_worke;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNumbers {
    private static Object Integer;

    public static void main(String[] args) {
       List<Integer> numbers = Arrays.asList(5, 7,10, 12, 15, 20, 25, 30, 35, 40);
        System.out.println(getEvenNumbers(numbers));
        System.out.println(getEvenNumbers2(numbers).collect(Collectors.toList()));
    }
    //using for loop
    public static List<Integer> getEvenNumbers(List<Integer> numbers) {
       List<Integer> evenNumbers = new ArrayList<>();

        for (Integer num : numbers) {
            if (num % 2 == 0) evenNumbers.add(num);
        }
        return evenNumbers;
    }
   //using stream filter method
public static Stream<Integer> getEvenNumbers2(List<Integer> numbers){

   //numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    Stream<Integer> evenNumbers =  numbers.stream().filter(n -> n % 2 == 0);
    return evenNumbers;
}

}

