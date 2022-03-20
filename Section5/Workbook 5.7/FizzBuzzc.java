import java.io.*;
import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class FizzBuzzc {
    public static void main(String[] args) {

        for (int i = 0; i <= 18; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) {
                System.out.print("Gibb");
            }
            if (i % 3 == 0) {
                System.out.print("Fizz");
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
            }
            System.out.print("\n"); 
        }
        // Task 1 – Make a for loop that counts from 0 to 18.

        /*
         * Task 2
         * 
         * Beside each number:
         * if it's a multiple of three, mark it as Fizz.
         * if it's a multiple of five, mark it as Buzz.
         * if it's a multiple of three and five, mark it as FizzBuzz.
         * 
         */

        /*
         * Hints:
         * If a number is a multiple of X, the remainder is zero when you divide that
         * number by X.
         * There are three conditions for Fizz, Buzz, and FizzBuzz. Be careful about
         * their order. If something is FizzBuzz, it can also be Fizz or Buzz.
         */

    }

}
