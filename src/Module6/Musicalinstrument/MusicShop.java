package module6.Musicalinstrument;

import java.util.List;

public class MusicShop {
    private List<Trumpet> Trumpet;
    private List<Piano> Piano;
    private List<Guitar> Guitar;

    public List<module6.Musicalinstrument.Trumpet> getTrumpet() {return Trumpet;}

    public void setTrumpet(List<module6.Musicalinstrument.Trumpet> trumpet) {Trumpet = trumpet;
    }

    public List<module6.Musicalinstrument.Piano> getPiano() {
        return Piano;
    }

    public void setPiano(List<module6.Musicalinstrument.Piano> piano) {
        Piano = piano;
    }

    public List<module6.Musicalinstrument.Guitar> getGuitar() {
        return Guitar;
    }

    public void setGuitar(List<module6.Musicalinstrument.Guitar> guitar) {
        Guitar = guitar;
    }


}
