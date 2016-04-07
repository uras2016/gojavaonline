package module11;

public class Celsius {
    public int temp (int temperature) {

//        Scanner in = new Scanner(System.in);// создаем обьект Сканнер, System.in -ввод данных
//
//        System.out.println("Температура по Цельсию:");
//        temperature = in.nextInt();

        temperature = (9*temperature)/5+32;

        return temperature;
       // System.out.println("Температура по Фаренгейту:" + temperature);

    }


}
