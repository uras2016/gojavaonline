package module5;


public class ForLoop {

    public static void main(String[] args) {
        int a = 0;
        int b = 10;

    for(int i = a; i<= b; i++) { // или for(перем; условие; шаг);
        System.out.println("i =" + i);

        a=0;
        System.out.println("a++ = " + a++);
        System.out.println("++a = " + ++a);
    }
    }
}
