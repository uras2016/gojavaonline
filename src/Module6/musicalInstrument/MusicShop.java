package Module6.musicalInstrument;

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

    public static void main(String[] args) {

    }

    public List<Module6.musicalInstrument.Trumpet> getTrumpet() {
        return Trumpet;
    }

    public List<Module6.musicalInstrument.Piano> getPiano() {
        return Piano;
    }

    public List<Module6.musicalInstrument.Guitar> getGuitar() {
        return Guitar;
    }

    public void prepareInstruments(Map<String, Integer> order) {
    }
}
