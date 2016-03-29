package module10;

public class FormatMethod {
    public static void main(String[] args) {

        // используем метод форматирования текста format

        /*
        %d - число
        %f - число с плавающей точкой
        %n - перевод строки
         */


        int i=2;
        double r=Math.sqrt(i);

        System.out.format("The square root of %d is %f.%n",i,r); // строка форматирования +
                                                                // переменные по очереди
    }
}
