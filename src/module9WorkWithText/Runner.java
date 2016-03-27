package module9WorkWithText;

import module8.homewrok.DocFiles;
import module8.homewrok.MusicFiles;
import module8.homewrok.PictureFiles;

import java.util.ArrayList;


public class Runner {
    public static void main(String[] args) {

        ArrayList bulkRequest2 = new ArrayList();  // коллекция содержит объекты разных классов



        bulkRequest2.add(new MusicFiles("mp3", 4));
        bulkRequest2.add(new PictureFiles("Spring", 15));
        bulkRequest2.add(new DocFiles("Book", 3));
        bulkRequest2.add("854");

        String y = String.valueOf(bulkRequest2);
        //System.out.println(y);*/



        CesarEncipher in  = new CesarEncipher(y, true);

        CesarEncipher out = new CesarEncipher("^PÎ⡆☊\u1CCD퀠䃈 惇ꀊ悗鿌惇ꀕ悍鿌悆鿅惍ꀎ惔ꀊ悗\u9FD9惗\u9FD1恺\u9FEB惃ꀑ悿ꀘ惕ꀓ悻ꀒ悿\u9FE2悁\u9FF8惊ꀗ惃ꀓ惁鿌悆鿅惍ꀎ惔ꀊ悗\u9FD6悏ꀢ悆鿅悠ꀎ惆ꀊ惍ꀠ惈ꀆ惇ꀊ悗鿌悜ꀔ惉ꀐ悁\u9FD1恺ꀘ惃ꀟ悿\u9FE2悍ꀢ悆鿅悒\u9FDA悎ꀂ", false);

    }
}
