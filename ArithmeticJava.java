import java.io.*;
  public class ArithmeticJava {
      public static void main(String[] args) {
        int number1 = 100;
        int number2 = 0;

        try {
        int answer = number1/number2;
        System.out.println("Answer: " + answer);
        }

        catch (ArithmeticException e) {
        System.out.println("Error: Divivsion by zero is not allowed!");
        }

        finally {
        System.out.println("Program continues after handling the exception.");
        }
      }
    }
