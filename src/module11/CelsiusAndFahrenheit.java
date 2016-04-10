package module11;

public class CelsiusAndFahrenheit {
    public double celsiusToFahrenheit (double temperature) {


        temperature = (9*temperature)/5+32;

//        System.out.println("Температура по Фаренгейту:" + temperature);

        return temperature;
    }



    public double fahrenheitToCelsius(double temperature) {


        temperature = ((temperature - 32) * 5) / 9;

//        System.out.println("Температура по Цельсию:" + temperature);
        return temperature;

    }
    public String toString(double temperature) {
        String stringResult = toString(temperature);
        return stringResult;
    }
}
