package Module5;


public class ManualSortArray {
    public static void main(String[] args) {
        double[] doubleArray = {1.2, 2.2, 3.5, -10.0, 5.0};

        boolean swapOccurred = true;

        while (swapOccurred){
           swapOccurred = false;

            for (int i = 0; i < doubleArray.length - 1;i++) {
                if (doubleArray[i] > doubleArray[i + 1]) {
                    double tempVariable = doubleArray[i];

                    doubleArray[i] = doubleArray[i + 1];
                    doubleArray[i + 1] = tempVariable;

                    swapOccurred = true;
                }
            }
        }
        for (double element : doubleArray){
            System.out.println(element);
        }
    }
}
