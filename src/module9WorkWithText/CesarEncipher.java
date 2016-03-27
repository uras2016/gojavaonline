package module9WorkWithText;



public class CesarEncipher {

    String in;
    String out = "";
    int step =3;

    public CesarEncipher(String in, boolean operation) {
        this.in = in;
        System.out.println("Caesar In: " + in);
        for (int i=0; i<in.length();i++, step = step*step+1){
            if (operation==true)
                out+=((char)(in.codePointAt(i)+step));
            else if (operation==false)
                out+=((char)(in.codePointAt(i)-step));
        }
        System.out.println("Caesar out: " + out);
    }
}

