package module456;


public class AverageNumberCounter {
    public double countAverage(int[] numbers){  //массив целых чисел
       // {4,5,6,7,8} - всего 5 элем
       //  0 1 2 3 4  - нумерация с 0 до 5-1=4

        double sum = 0;

        for (int i=0; i<numbers.length; i++) { // проходимся по всем элементам массива
            sum += numbers[i];// sum=sum+numbers[i] - берем старое значение суммы и + i-знач массива
            // это сумма всех элементов в массиве
        }
        return sum / numbers.length;

        // проверяем
        }

    public static void main(String[] args) {
        AverageNumberCounter averageNumberCounter = new AverageNumberCounter(); // зозд обьект класса

        int[] numbers1 = new int[]{3,3,3,3,3};
        System.out.println(averageNumberCounter.countAverage(numbers1));
        // запускаем метод countAverage для нового массива

        int[] numbers2 = new int[]{1,1,2,2};
        System.out.println(averageNumberCounter.countAverage(numbers2));

    }

}
