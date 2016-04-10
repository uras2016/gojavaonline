package module10.Work;

import java.io.IOException;
import java.util.Arrays;

public class FileData {



    public static void main(String[] args) throws IOException {



            String file_name = "ExampleIn.txt"; // переменная с адресом файла

            try {

                ReadFile file = new ReadFile(file_name); // создаем обьект класса ReadFile
                String[] aryLines = file.OpenFile(); // вызываем метод и записываем строки из файла в массив

                /*int i;
                for (i = 0; i < aryLines.length; i++) {
                    System.out.println(aryLines[i]);*/

                    final java.lang.String aryLines1 = Arrays.toString(aryLines);

                   Crypt crypt = new Crypt(aryLines1, true);
                    String quit = crypt.toString();


                WriteFile write = new WriteFile("ExampleOut.txt");

                write.writeToFile(quit);
                /*StringBuilder builder = new StringBuilder();
                for (String t: aryLines)

                System.out.println(builder.append(t));*/

              //  }


            } catch (IOException e) {
                System.out.println(e.getMessage());
            }


        }

    }

