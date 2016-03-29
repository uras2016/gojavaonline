package module10.Homework;

import javax.crypto.Cipher;
import java.io.*;

public class MessageReader {

           private void crypt(int index, int k) throws IOException{

               FileReader in;
               FileWriter out;

               try {
                   in = new FileReader("ExampleIn.rtf");
                   out = new FileWriter("ExampleOut.txt");

               }catch (FileNotFoundException e){
                   System.out.println("File no found");

               } catch (EOFException e){
                   System.out.println("Reached end of file");
                   return;
               } catch (IOException e) {
                   e.printStackTrace();
               }

               // Cipher class provides the functionality of a cryptographic cipher for encryption and decryption.





    }

}
