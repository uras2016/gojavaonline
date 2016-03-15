package Module6.Musicalinstrument;

import java.util.List;

public class MusicShop {
    private List<Trumpet> Trumpet;
    private List<Piano> Piano;
    private List<Guitar> Guitar;

    public List<Module6.Musicalinstrument.Trumpet> getTrumpet() {return Trumpet;}

    public void setTrumpet(List<Module6.Musicalinstrument.Trumpet> trumpet) {Trumpet = trumpet;
    }

    public List<Module6.Musicalinstrument.Piano> getPiano() {
        return Piano;
    }

    public void setPiano(List<Module6.Musicalinstrument.Piano> piano) {
        Piano = piano;
    }

    public List<Module6.Musicalinstrument.Guitar> getGuitar() {
        return Guitar;
    }

    public void setGuitar(List<Module6.Musicalinstrument.Guitar> guitar) {
        Guitar = guitar;
    }


}
