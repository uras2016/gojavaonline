/*
package module10;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.util.Calendar;

public class ReadObjects {
        static final String dataFile = "invoicedata"; // будет создан файл с таким имененми

    static final BigDecimal[] prices = {
            new BigDecimal("19.99"),
            new BigDecimal("9.99"),
            new BigDecimal("15.99"),
            new BigDecimal("3.99"),
            new BigDecimal("4.99")};

    static final int[] units = {12,8, 13, 29, 50};
    static final String[] descs = {"Java t-shirt",
            "Java Mug",
            "Duke Juggling",
            "Java Pin",
            "Java Key Chain"};

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        try (final ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)));
            out.writeObject(Calendar.getInstance());
            for (int i =0; i<prices.length; i++){
                out.writeObject (prices[i]);
                out.writeObject(units[i]);
                out.writeUTF(descs[i]);
            }
        }
        try
    }

*/
