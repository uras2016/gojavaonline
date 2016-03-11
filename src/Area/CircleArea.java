package Area;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус первого круга: ");
        double radius1 = scanner.nextDouble();
        System.out.println("Введите радиус второго круга: ");
        double radius2 = scanner.nextDouble();

        final double Pi = 3.1415926536;
        double area1 = Pi*radius1*radius1;
        double area2 = Pi*radius2*radius2;

        System.out.println("Circle area1 is:" + area1);
        System.out.println("Circle area2 is:" + area2);

        if(area1 < area2){
            System.out.println("First circle is smaller");
        } else  if(area1 > area2) {
            System.out.println("Second circle is smaller");
        } else {
            System.out.println("Circles are equal");
        }

    }
}