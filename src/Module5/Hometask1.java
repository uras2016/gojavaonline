package module5;


import java.util.Arrays;

public class Hometask1 {

    public static void main(String[] args) {
        int[] intArray = {30, 8, 100, -3, 2, 300, 224};

        Arrays.sort(intArray);

        int a = intArray.length-1;


        System.out.println(intArray[0]);

        System.out.println(intArray[a]);
    }
}