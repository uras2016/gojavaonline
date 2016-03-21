package module8;

import java.util.ArrayList; // импортируем коллекцию
import java.util.Arrays;
import java.util.Collection;

public class CollectionsExample {
    public static void main(String[] args) {
        // в коллекциях можно использовать только ссылочные типы, нельзя - примитивные
        // создем массив массив целых чисел
        //сначала был - int[] intArray = {5, 17, -42};

        Integer[] intArray = {5, 17, -42}; // механизм автоупаковки - изм int на Integer


        // создаем из него динамический массив с типом (оболочка) Integer

        // используем на вход коллекцию ArrayAsList для нашего int массива intArray

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(intArray));

        // напечатаем этот массив
        System.out.println("List of elements:");

        for (Integer element : arrayList) { // проходим по элементам массива

            System.out.println(element);// и выводим на пеать все элементы
        }

        arrayList.add(100); // добавим новое значение  массив
        System.out.println("Size of arrayList:" + arrayList.size()); //напечатаем размер массива с помощью метода .size

        // другие методы ищем здесь Collections. и выбираем себе метод


    }

}
