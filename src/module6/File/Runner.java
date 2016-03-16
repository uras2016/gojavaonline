package module6.File;


import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws PositiveException {
        System.out.println("Please input quantity of files:");
        final Scanner scanner = new Scanner(System.in);

        try {
            int quantity = scanner.nextInt();


            if (quantity < 0) {
                throw new PositiveException(quantity);
            }
            System.out.println("Quantity:" + quantity);
        } catch (PositiveException e){
            System.out.println("Please enter a positive value!");}

            }




    }
