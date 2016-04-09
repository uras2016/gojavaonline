package Module5;

public class HometaskMethod {

    int intArray[];

    public int sorting(int[] intArray) {
//    Arrays.sort(intArray);

//    return intArray;
        int summa = 0;
        int min = 0;
        int max = 0;

        for (int i : intArray) {
            summa += i;
            if (max < i)
                max = i;
            if (min > i)
                min = i;
        }

        System.out.printf("min value: %d\n", min);
//        System.out.printf("max value: %d\n", max);
    return min;
    }

}
