package exceptions;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YutubeEx {
    public static void main(String[] args) {
        try {
            String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
            throw new IOException("any"); // выбрасываем ошибку на ввод любой строки

        } catch (IOException e) { // иксепш типа ... переменная e
            System.out.println("error");
        } catch (Exception e) {
            System.out.println("generic exception");
        }//
    }


}
