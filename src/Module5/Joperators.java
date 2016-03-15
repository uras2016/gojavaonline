package module5;


public class Joperators {

    public static void main(String[] args) {

        int a = 2, b = 2;

        System.out.println("a= " + a + "   b= " + b);
        System.out.println("a+b= " + (a + b));
        System.out.println("a-b= " + (a - b));
        System.out.println("a*b= " + (a * b));
        System.out.println("a/b= " + (a / b));
        System.out.println("a%b= " + (a % b));
        System.out.println("________________________________________________________");
        a = 2;b = 2;
        System.out.println("a= " + a + "   b= " + b);
        a = 2;b = 2;
        System.out.println("a++= " + (a++) + "     сначала печатает потом делает инкремент и изменяет значение а в памяти");
        System.out.println("a= " + (a) + "     после а++ в предыдущем выводе");
        a = 2;b = 2;
        System.out.println("a--= " + (a--)  + "     сначала печатает потом делает инкремент и изменяет значение а в памяти");
        System.out.println("a= " + (a) + "     после а-- в предыдущем выводе");
        a = 2;b = 2;
        System.out.println("++a= " + (++a));
        a = 2;b = 2;
        System.out.println("--a= " + (--a));
        a = 2;b = 2;
        System.out.println("a+++b= " + (a+++b));
        System.out.println("a= " + (a) + "     после а++ в предыдущем выводе");
        System.out.println("b= " + (b) + "     после а++ в предыдущем выводе");
        a = 2;b = 2;
        System.out.println("a---b= " + (a---b));
        System.out.println("a= " + (a) + "     после а-- в предыдущем выводе");
        System.out.println("b= " + (b) + "     после а-- в предыдущем выводе");
        a = 2;b = 2;
        System.out.println("(a++)+b= " + ((a++)+b));
        System.out.println("a= " + (a) + "     после а++ в предыдущем выводе");
        System.out.println("b= " + (b) + "     после а++ в предыдущем выводе");
        a = 2;b = 2;
        System.out.println("a+(++b)= " + (a+(++b)));
        System.out.println("a= " + (a) + "     после а++ в предыдущем выводе");
        System.out.println("b= " + (b) + "     после а++ в предыдущем выводе");
        System.out.println("________________________________________________________");
        boolean a1=true,b1=true;
        System.out.println("a= " + a1 + "   b= " + b1);
        System.out.println("a&b= " + (a1&b1));
        System.out.println("a= " + a1 + "   b= " + b1);
        System.out.println("a|b= " + (a1|b1));
        System.out.println("a= " + a1 + "   b= " + b1);
        System.out.println("a^b= " + (a1^b1));
        System.out.println("a= " + a1 + "   b= " + b1);
        System.out.println("!a= " + (!a1));
        System.out.println("a= " + a1 + "   b= " + b1);
        System.out.println("!b= " + (!b1));
        System.out.println("________________________________________________________");
        boolean a2=false,b2=true;
        System.out.println("a= " + a2 + "   b= " + b2);
        System.out.println("a&b= " + (a2&b2));
        System.out.println("a= " + a2 + "   b= " + b2);
        System.out.println("a|b= " + (a2|b2));
        System.out.println("a= " + a2 + "   b= " + b2);
        System.out.println("a^b= " + (a2^b2));
        System.out.println("a= " + a2 + "   b= " + b2);
        System.out.println("!a= " + (!a2));
        System.out.println("a= " + a2 + "   b= " + b2);
        System.out.println("!b= " + (!b2));
        System.out.println("________________________________________________________");
        boolean a3=true,b3=false;
        System.out.println("a= " + a3 + "   b= " + b3);
        System.out.println("a&b= " + (a3&b3));
        System.out.println("a= " + a3 + "   b= " + b3);
        System.out.println("a|b= " + (a3|b3));
        System.out.println("a= " + a3 + "   b= " + b3);
        System.out.println("a^b= " + (a3^b3));
        System.out.println("a= " + a3 + "   b= " + b3);
        System.out.println("!a= " + (!a3));
        System.out.println("a= " + a3 + "   b= " + b3);
        System.out.println("!b= " + (!b3));
        System.out.println("________________________________________________________");
        System.out.println("Теор. отличие от одинарного: второй операнд вычисляется" +
                " только если невозможно вычислить первый. В чем практический смысл?");
        boolean a4=true,b4=true;
        System.out.println("a= " + a4 + "   b= " + b4);
        System.out.println("a&&b= " + (a4&&b4));
        System.out.println("a= " + a4 + "   b= " + b4);
        System.out.println("a||b= " + (a4||b4));
        System.out.println("________________________________________________________");
        boolean a7=false,b7=false;
        System.out.println("a= " + a7 + "   b= " + b7);
        System.out.println("a&&b= " + (a7&&b7));
        System.out.println("a= " + a7 + "   b= " + b7);
        System.out.println("a||b= " + (a7||b7));
        System.out.println("________________________________________________________");
        boolean a5=false,b5=true;
        System.out.println("a= " + a5 + "   b= " + b5);
        System.out.println("a&&b= " + (a5&&b5));
        System.out.println("a= " + a5 + "   b= " + b5);
        System.out.println("a||b= " + (a5||b5));
        System.out.println("________________________________________________________");
        boolean a6=true,b6=false;
        System.out.println("a= " + a6 + "   b= " + b6);
        System.out.println("a&&b= " + (a6&&b6));
        System.out.println("a= " + a6 + "   b= " + b6);
        System.out.println("a||b= " + (a6||b6));
        System.out.println("________________________________________________________");
        a = 2;b = 2;
        System.out.println("a= " + a + "   b= " + b +"        a<b =" + (a<b));
        System.out.println("a= " + a + "   b= " + b +"        a<=b =" + (a<=b));
        System.out.println("a= " + a + "   b= " + b +"        a>b =" + (a>b));
        System.out.println("a= " + a + "   b= " + b +"        a=>b =" + (a>=b));
        System.out.println("a= " + a + "   b= " + b +"        a==b =" + (a==b));
        System.out.println("a= " + a + "   b= " + b +"        a!=b =" + (a!=b));
        System.out.println("________________________________________________________");
        a = 3;b = 2;
        System.out.println("a= " + a + "   b= " + b +"        a<b =" + (a<b));
        System.out.println("a= " + a + "   b= " + b +"        a<=b =" + (a<=b));
        System.out.println("a= " + a + "   b= " + b +"        a>b =" + (a>b));
        System.out.println("a= " + a + "   b= " + b +"        a=>b =" + (a>=b));
        System.out.println("a= " + a + "   b= " + b +"        a==b =" + (a==b));
        System.out.println("a= " + a + "   b= " + b +"        a!=b =" + (a!=b));
        System.out.println("________________________________________________________");
        a = 2;b = 2;
        System.out.println("a= " + a + "   b= " + b +"        a>b?a*2:b*4  =" + (a>b?a*2:b*4));
        System.out.println("________________________________________________________");
        a = 2;b = 3;
        System.out.println("a= " + a + "   b= " + b +"        a=b=" + (a=b));
        a = 2;b = 3;int c=4;
        System.out.println("a= " + a + " b= " + b +" c= " + c +"        a=b=c=" + (a=b=c));
        a = 2;b = 3;c=4;
        System.out.println("a= " + a + " b= " + b +" c= " + c +"        a=b=c=10  " + (a=b=c=10));
        System.out.println("a= " + a + " b= " + b +" c= " + c );
        a = 2;b = 3;c=4;
        System.out.println("a= " + a + " b= " + b +" c= " + c +"        a=b+c; a= " + (a=b+c));
        a = 2;b = 3;c=4;
        System.out.println("a= " + a + " b= " + b +" c= " + c +"        a=b+c++ = " + (a=b+c++));
        System.out.println("после верхних вычислений: a= " + a + " b= " + b +" c= " + c);
        System.out.println("________________________________________________________");

        byte    w1=1; //  -128:127
        short   w2=1; //  -32768:32767
        int     w3=1; //  -2147483648:2147483647
        long    w4=1; //  -9223372036854775808:9223372036854775807

        float   w5=1; //  3.4*10^38  - 8  цифр
        double  w6=1; //  1.7*10^308 - 17 цифр

        char    w7='a'; // 0:65535

        long w = 9223372036854775807L-1;
        System.out.println("w= "  + w);

        w = 9223372036854775807L+1;
        System.out.println("1 w= "  + w);
        System.out.println("2 w= "  + (w*2)); // -->w=0
        System.out.println("3 w= "  + (double)w*2);//---> double

        w1=10;
        //w1=w1+1;  w1+1--->int --->error
        //w1+=1; // <------ is not error
        w1=(byte) (w1+1);
        System.out.println("w1= "  + w1);


        w1=10;
        w1+=1; // <------ not error
        System.out.println("w1= "  + w1);

        w1=127;
        // w2=w1+1;//byte не преобразуется в short
        w2= (byte)(129+1);
        System.out.println("w= "  + w2);

        w2=32767;
        w3=w2+1; // short-->int
        System.out.println("w= "  + w3);

        w2=32767;
        w2= (short)(w2+1); // short <-not- int
        System.out.println("w= "  + w2);

        w2=32767;
        w2= (byte)(w2+10); // short <-not- int
        System.out.println("w= "  + w2);

        w2=32767;
        w2= (short) (w2+10); // short <-- int
        System.out.println("w= "  + w2);

        w2=0;
        w2= (short) (w2+10); // short <-- int
        System.out.println("w= "  + w2);

        w3=9;
        System.out.println("w= "  + w3/2); //=4
        System.out.println("w= "  + w3/2.0); //=4.5

        w6=1212E2;
        w6=1212e2;
        w6=1212e-2;
        w6=1212e-2f;
        w6=1212e-2F;

        System.out.println("________________________________________________________");
        System.out.println("Приоритет операторов");
        System.out.println("1. () [] . ");
        System.out.println("2. ++ -- ~ !");
        System.out.println("3. *  /  % ");
        System.out.println("4. +  -");
        System.out.println("5. >>  <<  >>> ");
        System.out.println("6. >  <  >=  <= ");
        System.out.println("7. ==  != ");
        System.out.println("8. &");
        System.out.println("9. ^");
        System.out.println("10. |");
        System.out.println("11. &&");
        System.out.println("12. ||");
        System.out.println("13. ?:");
        System.out.println("14. =  +=  -= *=  /=  %=  &=  ^=  |=  <<=  >>= >>>=");

    }

}
