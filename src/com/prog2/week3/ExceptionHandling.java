package com.prog2.week3;

public class ExceptionHandling {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        
        // Exception Handling: try-catch-finally
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]); // This will cause an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        } finally {
            System.out.println("This block always executes.");
        }

        // Exception Handling: try-catch-finally with multiple exceptions
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]); // This will cause an ArrayIndexOutOfBoundsException
            String str = null;
            System.out.println(str.length()); // This will cause a NullPointerException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception occurred!");
        } finally {
            System.out.println("This block always executes.");
        }

        try {
            int result = divide(10, 0); // This will cause an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("This block always executes.");
        }
    }

    private static int divide(int numerator, int denominator)  {
        // This method divides two integers and throws an exception if the denominator is zero
        return numerator / denominator; // This will throw an ArithmeticException if denominator is zero
    }
}
