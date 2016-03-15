package module456;


import sun.security.util.Length;

public class LengthConverter {

    public static final double FEET_IN_ONE_METER = 3.2808399;

    public double convertMetersToFeet(double meters){

        return meters *  FEET_IN_ONE_METER;
    }
    public double convertFeetToMeters(double feet){
        return feet / FEET_IN_ONE_METER;
    }

    public static void main(String[] args) {
        double lengthInMeters = 100;
        LengthConverter lengthConverter = new LengthConverter();
        double feetLength = lengthConverter.convertMetersToFeet(lengthInMeters);
        System.out.println(feetLength);

        double metersLength = lengthConverter.convertFeetToMeters(feetLength);
        System.out.println(metersLength);
    }
}
