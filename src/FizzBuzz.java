public class FizzBuzz {
    public static String fizzBuzz(int number){

        boolean isDivisibleBy3 = number % 3 == 0;
        boolean isDividibleBy5 = number % 5 == 0;
        if(isDivisibleBy3 && isDividibleBy5)
            return "FizzBuzz";

        if(isDivisibleBy3)
            return "Fizz";

        if(isDividibleBy5)
            return "Buzz";

        return number + "";
    }
}
