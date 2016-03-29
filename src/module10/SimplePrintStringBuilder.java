package module10;

public class SimplePrintStringBuilder {
    public static void main(String[] args) {

        // простая печать на экран

        int i=2;
        double r = Math.sqrt(i);

        System.out.print("The square root of ");
        System.out.print(i);
        System.out.print(" is ");
        System.out.print(r);
        System.out.println("."); // или вот так System.out.print(". \n");


        i=5;
        r=Math.sqrt(i);

        System.out.println("The square root of " + i + " is " + r + ".");

        // используем для вывода StringBuilder

        // каждая новая строка будет добавлена в существующий String
        final StringBuilder stringBuilder = new StringBuilder(); // создаем обьект класса

        // можно сразу занести первыую часть
        // в StringBuilder final StringBuilder stringBuilder = new StringBuilder("The square root of ");

        stringBuilder.append("The square root of "); // вызываем метод
        stringBuilder.append(i);
        stringBuilder.append(" is ");
        stringBuilder.append(r);
        stringBuilder.append(".");

        /* можно писать и так
        stringBuilder.append("The square root of "); // вызываем метод
            .append(i)
            .append(" is ")
            .append(r)
            .append(".")

          */

        final String outputMessage = stringBuilder.toString();// заносим в переменную метод toString,
                                                       // который соберет все кусочки
        System.out.println(outputMessage);
    }
}
