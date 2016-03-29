package module10;

import java.io.*;

public class ReadOfData {

        // чтение некоторых типов данных

    static final String dataFile = "invoicedata"; // наш файл

    // создаем массивы разных типов

    static final double[] prices = {19.99, 9.99, 15.99, 3.99, 4.99};
    static final int[] units = {12, 8, 13, 29, 50};
    static final String[] descs = {
            "Java t-shirt",
            "Java Mug",
            "Duke Juggling",
            "Java Pin",
            "Java Key Chain"
    };

    public static void main(String[] args) throws IOException {
        DataInputStream in = null; // выносим за пределы блока try
        // сначала запишем их в какой то файл, прочитать и напечатать на экран

        try {
                DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)));

                // записываем в файл

                for (int i=0; i<prices.length; i++){ // читаем массивы
                    out.writeDouble(prices[i]);
                    out.writeInt(units[i]);
                    out.writeUTF(descs[i]);
                }

                out.close();// закрываем стрим

                in = new DataInputStream(new BufferedInputStream(new FileInputStream(dataFile)));
                while (true){
                    double price = in.readDouble();
                    int unit = in.readInt();
                    String desc = in.readUTF();

                    System.out.format("You ordered %d units of %s at $%.2f%n", unit, desc, price);

                    //out.close();

                    } // для остановки стрима используем исключение EOFException - end of file exception
            } catch (EOFException e){
                System.out.println("Reached end of file");

            } catch (IOException e){
                e.printStackTrace();
            }finally {
                if (in !=null){
                    in.close();
                }

            // в итоге в файле invoicedata увиди кракозяблы, так как это бинарный файл
            // сможем прочесть там только текстовую информацию
            }

    }


}
