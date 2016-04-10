package module9WorkWithText.newCaesarAlgorithm;

public class CaesarAlgorithm {

    public static String encode (String string, int shiftOfLetter) {

        return getData(string, shiftOfLetter);
    }

    public static String decode (String string, int shiftOfLetter) {

        return getData(string, -shiftOfLetter);
    }

    private static String getData ( String string, int shiftOfLetter) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i<string.length(); i++) {

            builder.append( (char) ((string.charAt(i) + shiftOfLetter + (int) Character.MAX_VALUE) % (int) Character.MAX_VALUE));
        }

        return builder.toString();
    }
}
