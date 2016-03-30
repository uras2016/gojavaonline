package module10.Work;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {
    private String path;
    private boolean append_to_file = false;// не хочу добавлять, но затираю все в файле


    public WriteFile(String file_path){ // конструктор используем, чтобы перезаписать весь файл
        path = file_path;
    }

    public WriteFile(String file_path, boolean append_value){ // конструктор 2 используем, когда хотим добавить значение
        path = file_path;
        append_to_file = append_value;
    }

    public void writeToFile(String textLine) throws IOException { // переменная textLine - текст, который хотим записать в файл
        // в методе создаем обьект класса FileWriter - он открывает файл и записывает текст в байтах

        FileWriter write = new FileWriter (path, append_to_file); // path - адрес файла. Он также создает файл, если его нет
        PrintWriter print_line = new PrintWriter(write);

        print_line.printf("%s" + "%n", textLine);

        print_line.close();

    }
}
