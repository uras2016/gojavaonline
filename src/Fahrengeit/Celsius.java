package Fahrengeit;


import java.util.Scanner;

public class Celsius {
    public static void main(String[] args){
        float temp;
        Scanner in = new Scanner(System.in);// создаем обьект Сканнер, System.in -ввод данных

        System.out.println("Температура по Цельсию:");
        temp = in.nextInt();

        temp = (9*temp)/5+32;

        System.out.println("Температура по Цельсию:" + temp);


    }
}