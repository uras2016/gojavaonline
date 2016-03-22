package module8.homewrok;


import java.util.ArrayList;
import java.util.Iterator;

public class Runners {
    public static void main(String[] args) {

        MusicFiles musicFiles = new MusicFiles("mp3", 4);
        PictureFiles pictureFiles = new PictureFiles("Spring", 15);
        DocFiles docFiles = new DocFiles("Book", 3);

        ArrayList bulkRequest = new ArrayList();  // коллекция содержит объекты разных классов

        MusicFiles files;

        bulkRequest.add(new MusicFiles("mp3", 4));
        bulkRequest.add(new PictureFiles("Spring", 15));
        bulkRequest.add(new DocFiles("Book", 3));
        bulkRequest.add("854");

        System.out.println("111 " + musicFiles.getName());

        System.out.println("111 " + bulkRequest.size());

       for (int i = 0; i < bulkRequest.size(); i++){
           System.out.println("Element " + i + bulkRequest.get(i));
       }




}


        }
