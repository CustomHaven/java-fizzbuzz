// https://www.codecademy.com/courses/learn-java/projects/java-fizzbuzz

/*
A program running the famous interview question FizzBuzz coded in Java
*/

import java.util.ArrayList;
// Q2 build class and main method
class FizzBuzz {
    public static void main(String[] args) {

        // Q3
        for (int i = 1; i <= 100; i++) {
            // Q4 then Q5 run java FizzBuzz in terminal
            // System.out.println(i);

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        // My quick solution with ArrayList doing without using the steps from codecademy!
        ArrayList fizzBuzz = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzz.add(i-1, "FizzBuzz");
            } else if (i % 3 == 0) {
                fizzBuzz.add(i-1, "Fizz");
            } else if (i % 5 == 0) {
                fizzBuzz.add(i-1, "Buzz");
            } else {
                fizzBuzz.add(i-1, i);
            }
        }
        System.out.println(fizzBuzz);
    }
}