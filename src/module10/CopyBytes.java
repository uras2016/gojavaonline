package module10;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        // посимвольное чтение из потока InputSrteam

        try (final FileInputStream in = new FileInputStream("xanadu.txt"); // входной ресурс текстовый файл

             // открываем файл(предварительноя я создал текстовый файл в папке проекта), читаем его и записываем в выходной
             FileOutputStream out = new FileOutputStream("outagain.txt");) {

            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }


    }


}
