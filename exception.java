package cscorner;
public class exception{
    public static void main(String[] args) {
        try {
            // ArrayIndexOutOfBoundsException
            int[] numbers = {1, 2, 3};
            int indexOutOfRange = numbers[5];

            // Divide by Zero (ArithmeticException)
            int result = 10 / 0;

            // NullPointerException
            String str = null;
            int strLength = str.length();
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException ex) {
            // Multi-catch block to handle multiple exceptions
            System.out.println("Exception caught: " + ex.getClass().getSimpleName());
            System.out.println("Exception message: " + ex.getMessage());
        } finally {
            // Code in this block will always be executed, regardless of whether an exception occurred or not.
            System.out.println("Finally block executed.");
        }
    }
}

