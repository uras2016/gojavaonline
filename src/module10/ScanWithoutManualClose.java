package module10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScanWithoutManualClose {

    public static void main(String[] args) throws IOException {

        // с автоматическим закрытием потока

        // читаем сканнером наш файл


        // символьный поток FileReader открывает сам файл,BufferedReader - буферизируем
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("xanadu.txt"))))
        {

            while (scanner.hasNext()){ // проверяем закончились ли строки
                System.out.println(scanner.next()); // печать символов на экран
            }
        }
    }
}




