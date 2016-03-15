package module456;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MergeSorter {
    public List<Integer> sort(List<Integer> integers){ // список целых чисел
        if (integers.size() <=1) return integers; // список состоит только из 1, то возвращаем это число
        // если нет.ю то весь список делим пополам

        int middle = integers.size()/2;

        // берем 2 половины списка

        List<Integer> left = integers.subList(0, middle); // берем часть списка (суб лист) и созд перемен
        List<Integer> right = integers.subList(middle, integers.size());// ,берем вторую половину

        // в методе sort вызываем метод sort - рекурсия
        List<Integer> leftSorted = sort(left); // сортируем левый список и созд переменную
        List<Integer> rightSorted = sort(right); // сортируем правый список и созд переменную

        return merge (leftSorted, rightSorted); // складываем два отсорьтированных списка
    }

    private List<Integer> merge(List<Integer> leftSorted, List<Integer> rightSorted) {// авт. созд метод
        List<Integer> result = new ArrayList<Integer>(); // создаем список интеджеров - результат
        // создаем два указателя, которые будут по каждому списку выбирать наименьшее

        int leftIndex = 0;
        int rightIndex = 0;
        // применяем цикл

        while (leftIndex < leftSorted.size() || rightIndex < rightSorted.size()) {
            // пока левый индекс меньше чем длина левого списка или правый индекс меньше чем длина правого списка
        if (leftIndex == leftSorted.size()){ // если левый индес дошел до конца левого списка
            result.addAll(rightSorted.subList(rightIndex, rightSorted.size()));
            // к левому списку добавляем правый не пройденный (с правого индекса по
            // длину)
            rightIndex = rightSorted.size();// увеличиваем правый индекс
        }else if (rightIndex == rightSorted.size()) {
                result.addAll(leftSorted.subList(leftIndex, leftSorted.size())); // аналогично
                leftIndex = leftSorted.size();
        }else {
            int left = leftSorted.get(leftIndex); // левое значение
            int right = leftSorted.get(rightIndex); // правое значение
            if (left < right) { // если лемове < правое, то левое добавляем в результат
                result.add(left);
                leftIndex++;// и увелич значение левого индекса на 1
            } else {
                result.add(right); // если правый меньше, то записываем правый, и увел згачение индекса на 1
                rightIndex++;
            }
        }
        }
        return result;

    }

    public static void main(String[] args) {
        MergeSorter mergeSorter = new MergeSorter();// создаем сортировку


        List<Integer> integers = Arrays.asList(4, 7, 8, 3, 9, 0, 2, 7, 5); // создаем список

        List<Integer> sortedIntegers = mergeSorter.sort(integers);// отсортируй числа
        System.out.println(sortedIntegers);


    }
}
