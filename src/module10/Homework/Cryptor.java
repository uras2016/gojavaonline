package module10.Homework;

import java.io.FileReader;

public class Cryptor {

    String in;
    String out = "";
    int step = 3;

    public Cryptor(String in, boolean operation) {
        this.in = in;
        for (int i= 0; i<in.length();i++, step = step*step+1){
            if (operation==true)
                out+= ((char)(in.codePointAt(i)+step));
            else if (operation==false){
                out+= ((char)(in.codePointAt(i)-step));

            }
        }
    }
}
