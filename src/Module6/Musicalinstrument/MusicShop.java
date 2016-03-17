package Module6.Musicalinstrument;

import java.util.List;
import java.util.Map;

public class MusicShop {
    private List<Trumpet> Trumpet;
    private List<Piano> Piano;
    private List<Guitar> Guitar;

    public MusicShop(List<Trumpet> trumpet, List<Piano> piano, List<Guitar> guitar) {
        Trumpet = trumpet;
        Piano = piano;
        Guitar = guitar;
    }

    public List<Module6.Musicalinstrument.Trumpet> getTrumpet() {
        return Trumpet;
    }

    public List<Module6.Musicalinstrument.Piano> getPiano() {
        return Piano;
    }

    public List<Module6.Musicalinstrument.Guitar> getGuitar() {
        return Guitar;
    }

    public  void prepareInstruments(Map <String, Integer> order){
    }


}
