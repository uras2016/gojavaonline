package Module6;


import java.util.Scanner;

public class ExceptionExample {
    public static void main (String[] args) throws NegativeAgeException {
        System.out.println("Enter age:");

        final Scanner scanner = new Scanner(System.in);

        final String userInput = scanner.next();               //scanner.nextInt();

        try {
            final int age = Integer.parseInt(userInput);// преобразование строки в число
            if (age <0) {
                throw new NegativeAgeException(age);

            }
            System.out.println("Your age is:" + age);
        } catch (NumberFormatException ex){
        System.out.println("Age should be an integer");
         }

    }
}
