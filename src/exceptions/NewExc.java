package exceptions;

// try-catch
// try-catch-finally
// try-finally


public class NewExc {
    public static void main(String[] args) {

        try {              // если в этом блоке не будет сгенер никакого исключ, то кетч не выполн
            System.out.println(0);
            throw new RuntimeException();// создем экземп исключ. и делаем throw
            // Если вызываем библиотеку - то не пишем throw
        } catch (Exception e) { // указываем тип (RuntimeExc наследник Except) и переменную
            System.out.println(1);
        }
        System.out.println(2);
    }
}