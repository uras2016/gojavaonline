package module10.Work;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    private String path;
    public ReadFile (String file_path) throws IOException {
        path  = file_path;
    }  // каждый метод, который имеет дело с открытием текстовых файлов должен имет Exception
    public String[] OpenFile() throws IOException {
        // метод достает все строки из файла в виде String array - public String[]

        FileReader fr = new FileReader(path);// path - файл для открытия
        BufferedReader textReader = new BufferedReader(fr);// все символы, прочитанные FileReader теперь храняться в буфере в переменной textReader
        // создаем массив, каждая позиция будет получать полную строку текста

        int numberOfLines = readLines(); // примерное колличество строк 3, позже мотодом определим точное колличество строк в массиве
        // после написания метода readLines() меняем значение 3 на метод.


        String[] textData = new String[numberOfLines];

        // с помощью loop вкидываем каждую строку текста из файла в каждую позицию массива

        int i;
        for (i = 0; i < numberOfLines; i++) {
            textData[i] = textReader.readLine(); //метод readLine считывает целую строку из буфера и потом мы эту строку размещаем в позицию массива
        }

        textReader.close();// закрываем поток
        return textData; // возвращаем весь массив
    }
        // пишем метод для определения количества строк в файле


    int readLines() throws IOException {
        FileReader file_to_read = new FileReader(path);
        BufferedReader bf = new BufferedReader(file_to_read);

        String aLine;
        int numberOfLines = 0;

        while ((aLine = bf.readLine()) != null) { // читай каждую строку текста пока не не дойдет до значения 0(когда закончаться строки Java вернет 0);
            numberOfLines++;
        }
        bf.close();
        return numberOfLines;
    }
}

