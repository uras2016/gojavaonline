package Area;

import java.util.Scanner;


public class PairUnpair {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер: ");
        int number = scanner.nextInt();

        if (number %2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

}
