package module10.Homework;

import javax.crypto.Cipher;
import java.io.*;

public class MessageReader {

    public static void main(String[] args) throws IOException{



               FileReader in;
               FileWriter out;

               try {
                   in = new FileReader("ExampleIn.rtf");
                   out = new FileWriter("ExampleOut.txt");


               }catch (FileNotFoundException e){
                   System.out.println("File no found");

               } catch (EOFException e){
                   System.out.println("Reached end of file");

               } catch (IOException e) {
                   e.printStackTrace();
               }

               // Cipher class provides the functionality of a cryptographic cipher for encryption and decryption.





    }

}
