package Module6.File;


import java.util.Scanner;

public class File {
    public static void main(String[] args) throws IllegalStateException {
        System.out.println("Please input quantity of files:");
        final Scanner scanner = new Scanner(System.in);

        try {
            int quantity = scanner.nextInt();
            if (quantity < 0) {
                throw new IllegalStateException(quantity);
            }
            System.out.println("Quantity:" + quantity);
        } catch (IllegalStateException e){
            System.out.println("Please enter a positive value!");
           }

    }
}
