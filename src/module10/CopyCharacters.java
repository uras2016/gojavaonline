package module10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
    public static void main(String[] args) throws IOException {

        // используем символьные потоки

        FileReader reader = null;
        FileWriter writer = null;

        try {
            reader = new FileReader("xanadu.txt");
            writer = new FileWriter("characteroutput.txt");

            int c;

            while ((c = reader.read()) != -1) {
                writer.write(c);
            } // метод закрытия потоков для java < 7 версии
        } finally {
            if (reader != null) { // проверяем призошла ли инициализация
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }
    }
}


