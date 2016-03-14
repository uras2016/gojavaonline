package Module6;

import java.util.Scanner;


public class ExceptionExample2 {
    public static void main (String[] args)  {
        System.out.println("Enter age:");

        final Scanner scanner = new Scanner(System.in);

        final String userInput = scanner.next();               //scanner.nextInt();

        try {
            final int age = Integer.parseInt(userInput);
            if (age <0) {
                throw new NegativeAgeException(age);

            }
            System.out.println("Your age is:" + age);
        } catch (NumberFormatException ex){
            System.out.println("Age should be an integer");
        } catch (NegativeAgeException e) {
            System.out.println("[Error]: Entered age is: '" + e.getAgeValue() + "' Age should be >= 0");
        }

    }
}
