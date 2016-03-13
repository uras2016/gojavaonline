package Module5;


import java.util.Arrays;

public class AutoSortArray {
    public static void main(String[] args) {
        double[] doubleArray = {1.2, 2.2, 3.5, -10.0, 5.0};

        Arrays.sort(doubleArray);

        for (double element : doubleArray) {
            System.out.println(element);
        }
    }
}

