package module10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScanXan {
    public static void main(String[] args) throws IOException{

        // читаем сканнером наш файл

        Scanner scanner = null;

        try {  // символьный поток FileReader открывает сам файл,BufferedReader - буферизируем
            scanner = new Scanner(new BufferedReader(new FileReader("xanadu.txt")));

            while (scanner.hasNext()){ // проверяем закончились ли строки
                System.out.println(scanner.next());
            }
        }finally {  // закрываем поток
            if (scanner !=null){
                scanner.close();
            }
        }
    }


}
