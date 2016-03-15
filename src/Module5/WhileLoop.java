package module5;

public class WhileLoop {
    public static void main(String[] args) {

        int a=10;
        int b=9;

        while (a > b) { // итерация - повторение
            a = a - 1;
        }

        do {
            a = a - 1;
        } while (a > b); // цикл выполняется пока а больше b;
    }
}

