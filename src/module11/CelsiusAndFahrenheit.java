package module11;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CelsiusAndFahrenheit {
    public double celsiusToFahrenheit (double temperature) {


        temperature = (9*temperature)/5+32;

//        System.out.println("Температура по Фаренгейту:" + temperature);

        return temperature;
    }



    public double fahrenheitToCelsius(double temperature) {


        temperature = ((temperature - 32) * 5) / 9;


        double newDouble = new BigDecimal(temperature).setScale(1, RoundingMode.UP).doubleValue();


//        System.out.println("Температура по Цельсию:" + newDouble);
        return newDouble;

    }
//    public String toString(double temperature) {
//        String stringResult = toString(temperature);
//        return stringResult;
//    }
}
