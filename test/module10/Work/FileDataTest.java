package module10.Work;

import module9WorkWithText.newCaesarAlgorithm.CaesarAlgorithm;
import org.junit.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileDataTest {
    String file_name1 = "ExampleIn.txt";
    final int SHIFT_OF_LETTER = 5;
    String file_name2 = "ExampleOutTest.txt";

    @BeforeClass
    public static void setUp() throws Exception {
        FileData fileData = new FileData();
        System.out.println("Start");

    }

    @AfterClass
    public static void tearDown() throws Exception {
        FileData fileData = new FileData();
        System.out.println("Test is finished");

    }

    @Test(timeout = 3000)
    public void testMain() throws Exception {

        try {

            ReadFile file = new ReadFile(file_name1);
            String[] aryLines = file.OpenFile();


            final java.lang.String aryLines1 = Arrays.toString(aryLines);
            System.out.println(aryLines1);

            String quit = CaesarAlgorithm.encode(aryLines1, SHIFT_OF_LETTER);

            System.out.println(quit);

            WriteFile write = new WriteFile("ExampleOutTest.txt");

            write.writeToFile(quit);
            System.out.println("Record is finished");



            Scanner scanner = new Scanner(new FileReader(file_name2));

            StringBuilder builder = new StringBuilder();
            while (scanner.hasNext()) {
                builder.append(CaesarAlgorithm.decode(scanner.next(), SHIFT_OF_LETTER));
            }

            Assert.assertEquals(aryLines1,builder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
