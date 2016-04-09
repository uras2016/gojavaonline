package Module5;


public class Homework2 {
    public static void main(String[] args) {
                                                    /* можно указать случайное заполнение массива
                                                        int [] massive = new int[10];
                                                        for (int i=0; i < massive.length; i++);
                                                 massive[i] = (int) Math.round(Math.random()*100);
                                                     */
        int[] massive = {11, 2, 35, -10, 5};

        for (int i = 0; i < massive.length; i++) {
            System.out.println(massive[i]);
        }

        int left = 1;
        int right = massive.length - 1; // границы

        do { // делаем это, пока ...

            // метод Шейкера
            // выставляем первый элемент
            for (int i = right; i >= left; i--) { // итерация справа на лево
                if (massive[i - 1] > massive[i]) { // сравниваем
                    int a = massive[i]; // сохранили последний элемент
                    massive[i] = massive[i - 1]; // затерли и заменили последний элемент на предшествующий
                    massive[i - 1] = a;
                }
            }   // выставляем последниый (максимальный) элемент
            left++; // первый элемент уже отсортирован, провускаем его и начнем со второго
            for (int i = left; i <= right; i++) { //итерация слева на право
                if (massive[i - 1] > massive[i]) { // сравниваем
                    int a = massive[i]; // сохранили последний элемент
                    massive[i] = massive[i - 1]; // затерли и заменили последний элемент на предшествующий
                    massive[i - 1] = a;
                }
            }
            right--;
        }
        while (left <= right);

        System.out.println(); // разделительная строка
        for (int i = 0; i < massive.length; i++) System.out.println(massive[i] + " ");


    }
}