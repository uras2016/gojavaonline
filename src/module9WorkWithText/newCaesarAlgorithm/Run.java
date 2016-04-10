package module9WorkWithText.newCaesarAlgorithm;

import java.io.*;
import java.util.Scanner;

public class Run {
    private static final int SHIFT_OF_LETTER = 5;

    public static void main(String[] args) {

        String text = "shifrMessage";
        File file = new File("shifrMessage.txt");
        String originalText = "shifrMessage";
        System.out.println("originalText is:" + originalText);

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file.getAbsolutePath()))) {

            bufferedWriter.write(CaesarAlgorithm.encode(text,SHIFT_OF_LETTER));
            System.out.println("Encoded message is:" + CaesarAlgorithm.encode(text,SHIFT_OF_LETTER));
            System.out.println("Encoded message has been written.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Scanner scan = new Scanner(new FileReader(file.getAbsolutePath()))){

            StringBuilder builder = new StringBuilder();

            while ( scan.hasNext()) {
                builder.append(CaesarAlgorithm.decode(scan.next(),SHIFT_OF_LETTER));
            }

            System.out.println(builder.toString());

        } catch (FileNotFoundException e) {
            System.err.println("File" + file.getName()+ " not found");
            e.printStackTrace();
        }

    }

}
