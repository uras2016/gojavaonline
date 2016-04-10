package Module5;


public class Hometask1 {

    private static HometaskMethod hometaskMethod;


    public static void main(String[] args) {
        int[] intArray = {30, 8, 100, -3, 2, 300, 224};

        hometaskMethod = new HometaskMethod();

        hometaskMethod.sortingMin(intArray);
        hometaskMethod.sortingMax(intArray);

    }
}