package Module5;

public class HometaskMethod {

    int intArray[];
    int summa = 0;
    int min = 0;
    int max = 0;

    public int sortingMin(int[] intArray) {
//    Arrays.sort(intArray);

//    return intArray;


        for (int i : intArray) {
            summa += i;

            if (min > i)
                min = i;
        }

//        System.out.printf("min value: %d\n", min);

        return min;
    }

    public int sortingMax(int[] intArray) {
        for (int i : intArray) {
            summa += i;
            if (max < i)
                max = i;
//        }System.out.printf("max value: %d\n", max);

        }
        return max;
    }
}