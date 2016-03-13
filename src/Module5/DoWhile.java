package Module5;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 'a':");
        int a = scanner.nextInt();
        System.out.println("Enter number 'b':");
        int b = scanner.nextInt();

        do {
            a = a - 1;
            System.out.println("New value 'a': + a ");
        } while (a > b);

    }
}