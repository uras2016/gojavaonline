package Fahrengeit;


import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args){
        float temp;
        Scanner in = new Scanner(System.in);// создаем обьект Сканнер, System.in -ввод данных

        System.out.println("Температура по Фаренгейту:");

        temp = in.nextInt();

        temp = ((temp-32)*5)/9;

        System.out.println("Температура по Цельсию:" + temp);


    }
}