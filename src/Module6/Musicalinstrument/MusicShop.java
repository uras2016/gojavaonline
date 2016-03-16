package module6.Musicalinstrument;

import java.util.List;
import java.util.Map;

public class MusicShop {
    private List<Trumpet> Trumpet;
    private List<Piano> Piano;
    private List<Guitar> Guitar;

    public List<module6.Musicalinstrument.Trumpet> getTrumpet() {
        return Trumpet;
    }

    public List<module6.Musicalinstrument.Piano> getPiano() {
        return Piano;
    }

    public List<module6.Musicalinstrument.Guitar> getGuitar() {
        return Guitar;
    }

    public MusicShop(List<Trumpet> trumpet, List<Piano> piano, List<Guitar> guitar) {
        Trumpet = trumpet;
        Piano = piano;
        Guitar = guitar;
    }


    public  void prepareInstruments(Map <String, Integer> order){
    }


}
